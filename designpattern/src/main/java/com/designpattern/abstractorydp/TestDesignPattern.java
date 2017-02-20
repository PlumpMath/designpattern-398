package com.designpattern.abstractorydp;

public class TestDesignPattern {

	public static void main(String[] args) {
		testAbstractFactory();
	}
	public static void testAbstractFactory(){
	
		com.designpattern.abstractorydp.Computer pc=ComputerFactory.getComputer(new PCFactory("2gb", "233gb", "2ghz"));
		com.designpattern.abstractorydp.Computer server=ComputerFactory.getComputer(new ServerFactory("3GB", "320GB", "3ghz"));
		System.out.println("Abstract FActory pc configuration : "+pc);
		System.out.println("Abstract FActory server configuration : "+server);

	}
}
