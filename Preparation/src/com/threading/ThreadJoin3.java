package com.threading;

public class ThreadJoin3 {
	public static void main(String[] args) throws InterruptedException {
		Thread.currentThread().join();	//program stucked like deadlock waiting for infinite amount of time
	}
}
