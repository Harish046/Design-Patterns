package com.harish.designpattern.singleton.javademo;

public class RuntimeSingleton {

	public static void main(String[] args) {
		
		Runtime runtimeOne = Runtime.getRuntime();
		
		System.out.println("Address of runtimeOne: "+runtimeOne);
		
		Runtime runtimeTwo = Runtime.getRuntime();
		
		System.out.println("Address of runtimeTwo: "+runtimeTwo);
		
		if(runtimeOne == runtimeTwo) {
			System.out.println("Both are same instance");
		} else {
			System.out.println("Singleton design failure! Both are not same");
		}

	}

}

