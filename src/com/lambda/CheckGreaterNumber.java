package com.lambda;

interface Greater {

	int checkGreaterValue(int n1, int n2);
}

public class CheckGreaterNumber {

	public static void main(String[] args) {

		Greater greater = (i1, i2) -> {
			if (i1 > i2) {

				throw new RuntimeException("i2 is not greater i1");
			}
			return i2;
		};
		System.out.println(greater.checkGreaterValue(120, 20));
	}
}