package com.js.spr;

import java.util.ArrayList;

public class Student {

	ArrayList<String> list;

	public Student() {
		// TODO Auto-generated constructor stub
		System.out.println("Obj-Student");
		
		
	}

	public void setNames(ArrayList<String> list) {
		this.list = list;
	}



	@Override
	public String toString() {
		return "Student [list=" + list + "]";
	}
	
	
	
	
	
	
	
}
