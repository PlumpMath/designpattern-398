package com.designpattern.singleton;

public class BillPughSingleton {

	private BillPughSingleton() {
		super();
	}

	private static class SingletonHelper{
		private static final BillPughSingleton instance=new BillPughSingleton();
	}
	public static BillPughSingleton getBillPughSingleton(){
		return SingletonHelper.instance;
		
	}
	
}
