package com.designpattern.factorydesign;

public class TestFactory {

	public static void main(String[] args) {

		Computer pc=ComputerFactory.getComputer("pc", "4GB", "500BG", "2GHz");
		Computer server=ComputerFactory.getComputer("server", "8GB", "1TB", "3GHz");
		System.out.println("PC configuration are : "+pc);
		System.out.println("Server configuration are : "+server);

	}

}
