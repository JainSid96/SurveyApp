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
import android.widget.Toast;

public class Survey1 extends Activity {
Button b1;
Intent i;
EditText et1,et2,et3,et4;
String id1,name,loc,zip,a;
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
		
		 a=et1.getText().toString();
		 System.out.println(a);
		
		name=et2.getText().toString();
		loc=et3.getText().toString();
		zip=et4.getText().toString(); 
		
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(Survey1.this, et1.getText().toString(), 98765).show();
				i=new Intent(Survey1.this,Survey2.class);
				//Toast.makeText(Survey1.this, id, 98765).show();
				
			    i.putExtra("id", et1.getText().toString());
			    i.putExtra("name",name);
			    i.putExtra("loc",loc);
			    i.putExtra("zip",zip);
			   // Toast.makeText(getApplicationContext(),id+name+loc+zip,Toast.LENGTH_SHORT).show();
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
