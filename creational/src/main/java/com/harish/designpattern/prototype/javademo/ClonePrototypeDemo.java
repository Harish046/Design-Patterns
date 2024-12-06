package com.harish.designpattern.prototype.javademo;

import java.util.ArrayList;
import java.util.List;

public class ClonePrototypeDemo {

	public static void main(String[] args) {
		
		String sql = "select * from employee where emp_name=?";
		List<String> list = new ArrayList<String>();
		
		list.add("Jhon");
		
		Record record = new Record();
		
		Statement statement1 = new Statement(sql, list, record);
		
		System.out.println(statement1.getSql());
		System.out.println(statement1.getParameters());
		System.out.println(statement1.getRecord());
		
		Statement statement2 = statement1.clone();
		
		System.out.println(statement2.getSql());
		System.out.println(statement2.getParameters());
		System.out.println(statement2.getRecord());

	}

}
