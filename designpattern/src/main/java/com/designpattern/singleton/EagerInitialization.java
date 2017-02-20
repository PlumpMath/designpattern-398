package com.designpattern.singleton;

public class EagerInitialization {

	private static final EagerInitialization object = new EagerInitialization();

	//private constructor to restrict the creation of new object in other class
	private EagerInitialization() {
		super();

	}
	public static EagerInitialization getInstance(){
		return object;
		
	}
    

}
