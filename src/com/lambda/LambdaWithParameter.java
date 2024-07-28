package com.lambda;

interface I {
	void mul(int a, int b);
}

public class LambdaWithParameter {
	public static void main(String[] args) {

		I i = (a, b) -> {
			System.out.println(a * b);
		};
		i.mul(12, 12);
	}

}
