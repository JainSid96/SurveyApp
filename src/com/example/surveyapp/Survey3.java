package com.example.surveyapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Survey3 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_survey3);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.survey3, menu);
		return true;
	}

}
