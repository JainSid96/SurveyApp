package com.example.surveyapp;

import org.json.JSONObject;
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
import com.example.surveyapp.R;
import com.example.surveyapp.UserFunction;

public class Survey1 extends Activity {
Button b1;
Intent i;
EditText et1,et2,et3,et4;
String id,name,loc,zip;
String a;

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
				Toast.makeText(Survey1.this, et1.getText().toString(), 98765).show();
				JSONObject json=new JSONObject();
				UserFunction userFunction=new UserFunction();
				Toast.makeText(Survey1.this, et1.getText().toString(), 98765).show();
				String s1=et1.getText().toString();
				String s2= et2.getText().toString();
				String s3=et3.getText().toString();
				String s4= et4.getText().toString();
				try {
					
					json = userFunction.Survey1_data_load(s1, s2, s3, s4);
					int success = json.getInt("success");
					Toast.makeText(Survey1.this, success, 98765).show();
					 if (success == 1) 
					 {
						 Toast.makeText(getApplicationContext(), "Your data submittd", 3000).show();	
						  i= new Intent(Survey1.this,Survey2.class);
							startActivity(i);
					 }
					 else
					 {
						 Toast.makeText(getApplicationContext(), "not submitted", 3000).show(); 
					 }
				}
					 catch(Exception ex)
						{
							
						}
			  
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
