package com.designpattern.singleton;

public class StaticBlockInitialization {

	private static StaticBlockInitialization instance;

	static{
		try{
			instance=new StaticBlockInitialization();
		}
		catch(Exception e){
			throw new RuntimeException("Exception occur at the time of object creation");
		}
	}
	
	private StaticBlockInitialization() {
		super();
	}
	
	public static StaticBlockInitialization getInstance(){
		return instance;
		
	}
	
}	
	
	
