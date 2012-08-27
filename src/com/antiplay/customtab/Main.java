package com.antiplay.customtab;

import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabSpec;

public class Main extends TabActivity implements OnTabChangeListener {

	private TabHost mTabHost;
	private TextView tv;
	private TextView tv2;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		mTabHost = (TabHost) findViewById(android.R.id.tabhost);
		mTabHost.getTabWidget().setDividerDrawable(R.drawable.tab_divider);
		mTabHost.setOnTabChangedListener(this);

		setupTab("HOME", new Intent(Main.this, Home.class));
		setupTab("NEW", new Intent(Main.this, New.class));
		setupTab("STATS", new Intent(Main.this, Stats.class));
		setupTab("CLICK!", new Intent(Main.this, Clicker.class));
	}

	private void setupTab(final String tag, final Intent intent) {
		View tabView = createTabView(mTabHost.getContext(), tag);
		TabSpec tab_specifications = mTabHost.newTabSpec(tag).setIndicator(tabView).setContent(intent);
		mTabHost.addTab(tab_specifications);
	}

	private View createTabView(final Context context, final String text) {
		View view = LayoutInflater.from(context).inflate(R.layout.tabs_bg, null);
		tv = (TextView) view.findViewById(R.id.tabsText);
		tv.setText(text);
		return view;
	}

	private void runAnimation(TextView current) {
		Animation a = AnimationUtils.loadAnimation(this, R.anim.bounce);
		a.reset();
		current.clearAnimation();
		current.startAnimation(a);
	}

	public void onTabChanged(String tabText) {
		LinearLayout tabLayout = (LinearLayout) mTabHost.getCurrentTabView();
		TextView current = (TextView) tabLayout.getChildAt(0);
		runAnimation(current);
	}
}