package com.designpattern.builder;

public class TestBuilder {

	public static void main(String[] args) {
		 Computer computer=new Computer.ComputerBuilder("500GB", "2GB").setBluetoothEnabled(true).setGraphicsCardEnabled(false).build();		 
			System.out.println(computer);	
	}
}
