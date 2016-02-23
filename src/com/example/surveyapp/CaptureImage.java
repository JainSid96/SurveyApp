package com.example.surveyapp;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class CaptureImage extends Activity {
	 private static final int CAMERA_REQUEST = 1888; 
	 private static final int CAMERA_REQUEST2 = 1887; 
	 private static final int CAMERA_REQUEST3 = 1886; 
	    private ImageView imageView,imageview2,imageview3;
	    String image,image2,image3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_capture_image);
		   this.imageView = (ImageView)this.findViewById(R.id.iv1);
		   this.imageview2=(ImageView)this.findViewById(R.id.iv2);
		   this.imageview3=(ImageView)this.findViewById(R.id.iv3);
	        Button photoButton = (Button) this.findViewById(R.id.image);
	        Button photoButton2 = (Button) this.findViewById(R.id.image2);
	        Button photoButton3 = (Button) this.findViewById(R.id.image3);
		       photoButton3.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE); 
	                startActivityForResult(cameraIntent, CAMERA_REQUEST3); 
					
				}
			});
		      photoButton2.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE); 
	                startActivityForResult(cameraIntent, CAMERA_REQUEST2); 
					
				}
			}); 
	        photoButton.setOnClickListener(new View.OnClickListener() {

	            @Override
	            public void onClick(View v) {
	                Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE); 
	                startActivityForResult(cameraIntent, CAMERA_REQUEST); 
	            }
	        });
	        
	        Button b1 = (Button)this.findViewById(R.id.next1);
	        b1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent i;
					i=new Intent(CaptureImage.this,Survey8.class);
					startActivity(i);
				}
			});     
	}
	
	
	 protected void onActivityResult(int requestCode, int resultCode, Intent data) {  
	        if (requestCode == CAMERA_REQUEST && resultCode == RESULT_OK) { 
	        	 Uri selectedImage = data.getData();
		         InputStream imageStream;
	            Bitmap photo = (Bitmap) data.getExtras().get("data"); 
	            imageView.setImageBitmap(photo);
	            try {
					imageStream = getContentResolver().openInputStream(selectedImage);
					Bitmap yourSelectedImage = BitmapFactory.decodeStream(imageStream);
				    ByteArrayOutputStream stream = new ByteArrayOutputStream();
	                yourSelectedImage.compress(Bitmap.CompressFormat.PNG, 90, stream); 
	                byte [] byte_arr = stream.toByteArray();
	                image = Base64.encodeToString(byte_arr, Base64.DEFAULT);}
	            catch(Throwable e) {
					
				}
	        }  
	        if (requestCode == CAMERA_REQUEST2 && resultCode == RESULT_OK) { 
	        	 Uri selectedImage = data.getData();
		         InputStream imageStream;
	            Bitmap photo = (Bitmap) data.getExtras().get("data"); 
	            imageview2.setImageBitmap(photo);
	            try {
					imageStream = getContentResolver().openInputStream(selectedImage);
					Bitmap yourSelectedImage = BitmapFactory.decodeStream(imageStream);
				    ByteArrayOutputStream stream = new ByteArrayOutputStream();
	                yourSelectedImage.compress(Bitmap.CompressFormat.PNG, 90, stream); 
	                byte [] byte_arr = stream.toByteArray();
	                image2 = Base64.encodeToString(byte_arr, Base64.DEFAULT);}
	            catch(Throwable e) {
					
				}
	        } 
	        if (requestCode == CAMERA_REQUEST3 && resultCode == RESULT_OK) { 
	        	 Uri selectedImage = data.getData();
		         InputStream imageStream;
	            Bitmap photo = (Bitmap) data.getExtras().get("data"); 
	            imageview3.setImageBitmap(photo);
	            try {
					imageStream = getContentResolver().openInputStream(selectedImage);
					Bitmap yourSelectedImage = BitmapFactory.decodeStream(imageStream);
				    ByteArrayOutputStream stream = new ByteArrayOutputStream();
	                yourSelectedImage.compress(Bitmap.CompressFormat.PNG, 90, stream); 
	                byte [] byte_arr = stream.toByteArray();
	                image3 = Base64.encodeToString(byte_arr, Base64.DEFAULT);}
	            catch(Throwable e) {
					
				}
	        }  
	    } 

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.capture_image, menu);
		return true;
	}

}
