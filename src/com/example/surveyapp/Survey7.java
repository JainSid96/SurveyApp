package com.example.surveyapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.Spinner;
import android.widget.Toast;

public class Survey7 extends Activity {
Button b1;
RatingBar rb,rb1;
Spinner sp3;
String timer[]={"5","10","15","20+"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_survey7);
		b1=(Button)findViewById(R.id.button1);
		rb=(RatingBar)findViewById(R.id.ratingBar1);
		rb1=(RatingBar)findViewById(R.id.ratingBar2);
		sp3=(Spinner)findViewById(R.id.spinner1);
		ArrayAdapter<String>adapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, timer);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		sp3.setAdapter(adapter);
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i;
				i=new Intent(Survey7.this,CaptureImage.class);
				startActivity(i);
			}
		});
		rb.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
			
			@Override
			public void onRatingChanged(RatingBar arg0, float arg1, boolean arg2) {
				// TODO Auto-generated method stub
				String rating= String.valueOf(rb.getRating());
				Toast.makeText(Survey7.this, rating, 89776).show();
			}
		});
		rb1.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
			
			@Override
			public void onRatingChanged(RatingBar arg0, float arg1, boolean arg2) {
				// TODO Auto-generated method stub
				String ratings=String.valueOf(rb1.getRating());
				Toast.makeText(Survey7.this, ratings, 98765).show();
			}
		});
		sp3.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				TextView b=(TextView)arg1;
				Toast.makeText(Survey7.this, b.getText(), Toast.LENGTH_LONG).show();
			


			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.survey7, menu);
		return true;
	}

}
