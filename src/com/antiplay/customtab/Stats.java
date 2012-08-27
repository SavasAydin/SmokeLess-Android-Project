package com.antiplay.customtab;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Stats extends Activity{

	private GlobalState gs;
	private boolean expanded;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.stats_cont);
		gs = (GlobalState) getApplication();
		expanded = false;
		expandSetup();
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
		TextView today = (TextView) findViewById(R.id.today);
		today.setText(gs.getTotalCount());
		
		TextView total = (TextView) findViewById(R.id.total);
		total.setText(gs.getTotalCount());
	}

	// LOCAL METHODS

	private void expandSetup(){
		final Button button = (Button) findViewById(R.id.expand_button);
		button.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// Perform action on clicks
				LinearLayout overview = (LinearLayout) findViewById(R.id.info_layout);

				if(!expanded){
					overview.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
					button.setText("Hide");
					expanded = true;
				}else{
					overview.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, 130));
					button.setText("More...");
					expanded = false;
				}
			}
		});
	}
}