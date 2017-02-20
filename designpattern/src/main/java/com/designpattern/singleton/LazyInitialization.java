package com.designpattern.singleton;

public class LazyInitialization {

	private static LazyInitialization instance;

	public LazyInitialization() {
		super();
  }
	public static LazyInitialization getInstance(){
		if(null==instance){
			instance=new LazyInitialization();
		}
		return instance;
		
	}
	
}
