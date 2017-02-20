package com.designpattern.test;

import com.designpattern.singleton.StaticBlockInitialization;

public class TestStaticBlock {

	public static void main(String[] args) {
		
	StaticBlockInitialization s1=StaticBlockInitialization.getInstance();
	System.out.println(s1);
	

	StaticBlockInitialization s2=StaticBlockInitialization.getInstance();
	System.out.println(s2);
	}
}
