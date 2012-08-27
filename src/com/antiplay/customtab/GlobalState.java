package com.antiplay.customtab;

import android.app.Application;

public class GlobalState extends Application {
	private String userName;
	private int total = 0;
	
	// USER NAME
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	// TOTAL
	
	public String getTotalCount(){
		return Integer.toString(total);
	}
	
	public void click(){
		total++;
	}
}
