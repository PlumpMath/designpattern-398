package com.designpattern.test;

import com.designpattern.singleton.ThreadSafe;

public class TestThreadSafe {

	public static void main(String[] args) {
		ThreadSafe t1= ThreadSafe.getInstance();
		System.out.println(t1);
		ThreadSafe t2= ThreadSafe.getInstance();
		System.out.println(t2);
	
	}
}
