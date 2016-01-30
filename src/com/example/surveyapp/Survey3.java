package com.example.surveyapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Survey3 extends Activity {
 Button b1,b2;
 GPSTracker gps;
 EditText et1,et2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_survey3);
		b1 = (Button) findViewById(R.id.but1);
		et1=(EditText)findViewById(R.id.editText8);
		et2=(EditText)findViewById(R.id.editText9);
		b2=(Button)findViewById(R.id.button2);
		b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				 gps = new GPSTracker(Survey3.this);

					// check if GPS enabled		
			        if(gps.canGetLocation()){
			        	    gps.updateGPSCoordinates();
			        	double latitude = gps.getLatitude();
			        	double longitude = gps.getLongitude();
			        	String lati = String.valueOf(latitude);
			        	String longi = String.valueOf(longitude);
			        	et1.setText(lati);
			        	et2.setText(longi);
			          
	 Toast.makeText(getApplicationContext(), "Your Location is - \nLat: " + latitude + "\nLong: " + longitude, Toast.LENGTH_LONG).show();
			       
			        }else{
			        	// can't get location
			        	// GPS or Network is not enabled
			        	// Ask user to enable GPS/network in settings
			        	gps.showSettingsAlert();
			        }
			}
		});
		b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i;
				i=new Intent(Survey3.this,Survey4.class);
				startActivity(i);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.survey3, menu);
		return true;
	}

}
