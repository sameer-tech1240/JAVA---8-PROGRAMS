package com.interfaceMethods;

interface Car {
	static void engine() {
		System.out.println("it's very useless");
	}
	static void type() {
		System.out.println("Number 1 quality tyre....");
	}
}

public class StaticMethods implements Car{
	public static void main(String[] args) {
		Car.type();
		Car.engine();
		
		

	}

}
