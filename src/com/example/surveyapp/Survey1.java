package com.example.surveyapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class Survey1 extends Activity {
Button b1;
Intent i;
EditText et1,et2,et3,et4;
String id,name,loc,zip;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_survey1);
		b1=(Button)findViewById(R.id.button1);
		et1=(EditText)findViewById(R.id.editText1);
		et2=(EditText)findViewById(R.id.editText2);
		et3=(EditText)findViewById(R.id.editText3);
		et4=(EditText)findViewById(R.id.editText5);
		
		id=et1.getText().toString();
		name=et2.getText().toString();
		loc=et3.getText().toString();
		zip=et4.getText().toString(); 
		
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				i=new Intent(Survey1.this,Survey2.class);
				Bundle ab = new Bundle();
				
			    ab.putString("id", id);
			    ab.putString("name",name);
			    ab.putString("loc",loc);
			    ab.putString("zip",zip);
			    i.putExtras(ab);
				startActivity(i);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.survey1, menu);
		return true;
	}

}
