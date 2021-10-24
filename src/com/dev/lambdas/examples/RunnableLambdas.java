package com.dev.lambdas.examples;

public class RunnableLambdas {

	public static void main(String args[]) {

		/**
		 * Before java 8
		 */

		Runnable runnable = new Runnable() {
			public void run() {
				System.out.println("Inside Runnable");
			}
		};

		new Thread(runnable).start();

		/**
		 * in java 8
		 */

		Runnable runnable1 = () -> System.out.println("Inside Runnable1");

		new Thread(runnable1).start();
	}

}
