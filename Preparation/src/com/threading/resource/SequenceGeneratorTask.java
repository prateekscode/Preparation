package com.threading.resource;

import com.threading.Print123usingThreeThreads;

public class SequenceGeneratorTask implements Runnable {
	
	private Print123usingThreeThreads pri;
	private int result;
	
	public SequenceGeneratorTask(Print123usingThreeThreads pri, int result) {
		super();
		this.pri = pri;
		this.result = result;
	}

	@Override
	public void run() {
		pri.printNumber(result);
	}
}
