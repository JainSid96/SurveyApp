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
	    private ImageView imageView;
	    String image;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_capture_image);
		   this.imageView = (ImageView)this.findViewById(R.id.iv1);
	        Button photoButton = (Button) this.findViewById(R.id.image);
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
	    } 

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.capture_image, menu);
		return true;
	}

}
