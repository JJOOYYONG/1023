package com.exam.controller;

public class ActionForward {

	
	private String path; // null
	private boolean isRedirect; // true - > redirect 이동, false->dispatch이동
	
	
	public String getPath() {
		return path;
	}
	
	public void setPath(String path) {
		this.path = path;
	}
	
	public boolean isRedirect() {
		return isRedirect;
	}
	
	public void setRedirect(boolean isRedirect) {
		this.isRedirect = isRedirect;
	}
	
	
	
	
	
	
}//Action
