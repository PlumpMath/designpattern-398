package com.designpattern.test;

import com.designpattern.singleton.LazyInitialization;

public class TestLazyInitilization {

	public static void main(String[] args) {

		LazyInitialization l1= LazyInitialization.getInstance();
		System.out.println(l1);
		
		LazyInitialization l2= LazyInitialization.getInstance();
		System.out.println(l2);
	}

}
