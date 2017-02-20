package com.designpattern.test;

import com.designpattern.singleton.EagerInitialization;

public class TestEarlyInitilization {

	public static void main(String[] args) {
		
		EagerInitialization e1=EagerInitialization.getInstance();
		System.out.println(e1);
		
		EagerInitialization e2=EagerInitialization.getInstance();
		System.out.println(e2);
	}
}
