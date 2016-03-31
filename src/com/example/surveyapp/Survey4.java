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

public class Survey4 extends Activity {
Button b2;
EditText seo,fam,others; 
String lati,longi,tphone,mob,timein,timeout,other,id,name,loc,zip;

String ii,j,k;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_survey4);
		b2=(Button)findViewById(R.id.button25);
		seo=(EditText)findViewById(R.id.editText1);
		fam=(EditText)findViewById(R.id.editText2);
		others=(EditText)findViewById(R.id.editText3);
		ii=seo.getText().toString();
		j=fam.getText().toString();
		k=others.getText().toString();
		Bundle getUnique=getIntent().getExtras();
		 id = getUnique.getString("id");
		  name = getUnique.getString("name");
		  loc = getUnique.getString("loc");
	      zip = getUnique.getString("zip");
	      tphone=getUnique.getString("tphone");
	      mob=getUnique.getString("mob");
	      timein=getUnique.getString("timein");
	      timeout=getUnique.getString("timeout");
		   lati = getUnique.getString("lati");
		   longi=getUnique.getString("longi");
		b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i;
				i=new Intent(Survey4.this,Survey5.class);
				 Bundle ab = new Bundle();
				 ab.putString("id",id);
				    ab.putString("name",name);
				    ab.putString("loc",loc);
				    ab.putString("zip",zip);
				    ab.putString("tphone",tphone);
				    ab.putString("mob",mob);
				    ab.putString("other",other);
				    ab.putString("timein",timein);
				    ab.putString("timeout",timeout);
				    ab.putString("lati", lati);
				    ab.putString("longi",longi);
				    ab.putString("seo",ii);
				    ab.putString("fam",j);
				    ab.putString("others",k);
				    i.putExtras(ab);
				startActivity(i);
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
