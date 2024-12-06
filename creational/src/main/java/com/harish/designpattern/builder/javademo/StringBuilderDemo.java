package com.harish.designpattern.builder.javademo;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		StringBuilder builder = new StringBuilder();
		
		builder.append("This is an example ");
		
		builder.append("of builder pattern. ");
		
		builder.append("It can append and thing to string. ");
		
		builder.append(46);
		
		System.out.println(builder.toString());

	}

}