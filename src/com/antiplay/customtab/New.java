package com.antiplay.customtab;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class New extends Activity{

	private GlobalState gs;
	private LinearLayout new_layout;
	private View notification;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		gs = (GlobalState) getApplication();
		setContentView(R.layout.new_cont);

		new_layout = (LinearLayout) findViewById(R.id.new_layout);

		LayoutInflater layoutInflater = (LayoutInflater)this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		RelativeLayout notification1 = (RelativeLayout)layoutInflater.inflate(R.layout.notification, new_layout, false);
		TextView tv1 = (TextView) notification1.getChildAt(0);
		tv1.setText("KKKKKYou have not smoked for one week! Keep up the good work! You recieve water for u tree!. HOPE THIS WORKS");

		RelativeLayout notification2 = (RelativeLayout)layoutInflater.inflate(R.layout.notification, new_layout, false);
		TextView tv2 = (TextView) notification2.getChildAt(0);
		tv2.setText("***********You have not smoked for one week! Keep up the good work! You recieve water for u tree! YIIIIIIPIEEEEEE!!!");
		
		RelativeLayout notification3 = (RelativeLayout)layoutInflater.inflate(R.layout.notification, new_layout, false);
		TextView tv3 = (TextView) notification3.getChildAt(0);
		tv3.setText("You have not smoked for one week! Keep up the good work! You recieve water for u tree! !");
		
		RelativeLayout notification4 = (RelativeLayout)layoutInflater.inflate(R.layout.notification, new_layout, false);
		TextView tv4 = (TextView) notification4.getChildAt(0);
		tv4.setText("You have not smoked for one week! Keep up the good work! You recieve water for u tree! ");
		
		RelativeLayout notification5 = (RelativeLayout)layoutInflater.inflate(R.layout.notification, new_layout, false);
		TextView tv5 = (TextView) notification5.getChildAt(0);
		tv5.setText("You have not smoked for one week! Keep up the good work! You recieve water for u tree! !!");
		
		RelativeLayout notification6 = (RelativeLayout)layoutInflater.inflate(R.layout.notification, new_layout, false);
		TextView tv6 = (TextView) notification6.getChildAt(0);
		tv6.setText("You have not smoked for one week! Keep up the good work! You recieve water for u tree!  ONE!!");

		new_layout.addView(notification1);
		new_layout.addView(notification2);
		new_layout.addView(notification3);
		new_layout.addView(notification4);
		new_layout.addView(notification5);
		new_layout.addView(notification6);
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

	// LOCAL METHODS FIXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
	
	private void runAnimation(View current) {
		Animation a = AnimationUtils.loadAnimation(this, R.anim.scale);
		a.reset();
		current.clearAnimation();
		current.startAnimation(a);
	}

	public void close(View v){
		// Perform action on clicks
		notification = (View) v.getParent();
		runAnimation(notification);
		new_layout.removeView(notification);
	}
}
