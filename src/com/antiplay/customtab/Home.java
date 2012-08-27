package com.antiplay.customtab;

import android.app.Activity;
import android.os.Bundle;

public class Home extends Activity{

	private GlobalState gs;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_cont);
		gs = (GlobalState) getApplication();
	}

	public void onStart(){
		super.onStart();
	}

	public void onStop(){
		super.onStop();
	}

	public void onPause(){
		super.onPause();
	}

	public void onResume(){
		super.onResume();
	}

	// LOCAL METHODS
}
