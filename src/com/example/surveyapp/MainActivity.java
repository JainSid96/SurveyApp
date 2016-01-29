package com.example.surveyapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Toast;

public class MainActivity extends Activity {
int x=5;
	Intent i;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		task tm=new task(5000,500);
		tm.start();
		
	}

	public class task extends CountDownTimer
	{

		public task(long millisInFuture, long countDownInterval) {
			super(5000, 500);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void onFinish() {
			// TODO Auto-generated method stub
			i=new Intent(MainActivity.this,Survey1.class);
			startActivity(i);
		}

		@Override
		public void onTick(long arg0) {
			// TODO Auto-generated method stub
			x--;
		}
		
	}

}
