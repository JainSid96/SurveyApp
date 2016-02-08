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

public class Survey2 extends Activity {
Button b1;
Intent ii;
EditText  et5,et6,et7,et8;
String e,f,g,h;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_survey2);
		b1=(Button)findViewById(R.id.b22);
		/*et5=(EditText)findViewById(R.id.ets2);
		et6=(EditText)findViewById(R.id.editText2);
		et7=et5=(EditText)findViewById(R.id.editText3);
		et8=(EditText)findViewById(R.id.editText4);
		e=et5.getText().toString();
		f=et6.getText().toString();
		g=et7.getText().toString();
		h=et8.getText().toString(); */
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
