package com.interfaceMethods;

abstract class My {
	int a;

	public My(int a) {
		this.a = a;
	}
}

public class Me extends My {
	public Me(int a) {
		super(a);

	}

	public static void main(String[] args) {
		
		Me me = new Me(100);
		System.out.println(me.a);
	}

}
