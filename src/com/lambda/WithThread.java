package com.lambda;

public class WithThread {
	public static void main(String[] args) {
		Runnable runnable = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("HELLO THREAD");
				
			}
		};
		Thread thread = new Thread(runnable);
		thread.run();
		
	}

}
