package com.antiplay.customtab;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Clicker extends Activity{

	private GlobalState gs;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.clicker_cont);
		gs = (GlobalState) getApplication();
		clickerSetup();
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

	//Class Methods

	private void clickerSetup(){
		final Button button = (Button) findViewById(R.id.clicker_button);
		button.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// Perform action on clicks
				gs.click();
			}
		});
	}
}