package com.designpattern.singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

	@SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args) {
		EagerInitialization instanceOne=EagerInitialization.getInstance();
		EagerInitialization insatnceTwo=null;
		try{
			Constructor[] constructors=EagerInitialization.class.getDeclaredConstructors();//get all constructors from class
			for(Constructor constructor:constructors){
				constructor.setAccessible(true);//to make private constructor visible
				insatnceTwo=(EagerInitialization) constructor.newInstance();
				break;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(instanceOne.hashCode());
		System.out.println(insatnceTwo.hashCode());
	}
	
}
