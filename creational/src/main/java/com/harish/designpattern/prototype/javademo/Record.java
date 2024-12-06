package com.harish.designpattern.prototype.javademo;

public class Record implements Cloneable {
	
	public Record clone() {
		try {
			return (Record) super.clone();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
