package com.example.surveyapp;

import java.io.Console;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Survey2 extends Activity {
Button b1;
Intent ii;
EditText  et5,et6,et7,et8,et9;
String tphone,mob,timein,timeout,other,id,name,loc,zip;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_survey2);
		b1=(Button)findViewById(R.id.b22);
	    et5=(EditText)findViewById(R.id.ets2); // tphone
		et6=(EditText)findViewById(R.id.editText2); //mob
		et7=et5=(EditText)findViewById(R.id.editText3); //other
		et8=(EditText)findViewById(R.id.editText4); //timein
		et9 =(EditText)findViewById(R.id.editText5); //timeout
		
		tphone=et5.getText().toString();
		mob=et6.getText().toString();
		other=et7.getText().toString();
		timein=et8.getText().toString(); 
		timeout = et9.getText().toString();
		
	      id = getIntent().getExtras().getString("id").toString();
		  name = getIntent().getExtras().getString("name").toString();
		  loc = getIntent().getExtras().getString("loc").toString();
	      zip = getIntent().getExtras().getString("zip").toString();
	      
	      Toast.makeText(getApplicationContext(), id+name+loc,Toast.LENGTH_LONG).show();
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				ii=new Intent(Survey2.this,Survey3.class);
				
			    
				startActivity(ii);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.survey2, menu);
		return true;
	}

}
