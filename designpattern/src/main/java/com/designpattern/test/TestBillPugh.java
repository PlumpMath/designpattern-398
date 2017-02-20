package com.designpattern.test;

import com.designpattern.singleton.BillPughSingleton;

public class TestBillPugh {

	public static void main(String[] args) {
		
		BillPughSingleton b1=BillPughSingleton.getBillPughSingleton();
		System.out.println(b1);
		
		BillPughSingleton b2=BillPughSingleton.getBillPughSingleton();
		System.out.println(b2);
	}
}
