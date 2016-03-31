package com.example.surveyapp;

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

public class Survey4 extends Activity {
Button b2;
EditText et9,et10,et11;
String i,j,k,z,x,c,vi,b,n,m,qa,qz,qd,qc;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_survey4);
		b2=(Button)findViewById(R.id.button25);
		et9=(EditText)findViewById(R.id.editText1);
		et10=(EditText)findViewById(R.id.editText2);
		et11=(EditText)findViewById(R.id.editText3);
		
	    
		i=et9.getText().toString();
		j=et10.getText().toString();
		k=et11.getText().toString(); 

		
		b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent ik;
				ik=new Intent(Survey4.this,Survey5.class);
				startActivity(ik);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.survey4, menu);
		return true;
	}

}
