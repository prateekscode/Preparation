package com.threading.resource;

import com.threading.Print123usingThreeThreads;

public class SeqNoGeneratTtest {
	private static final int TOTAL_NO_IN_SEQUENCE=10;
	private static final int TOTAL_NO_OF_THREADS=3;
	
	public static void main(String[] args) {
		Print123usingThreeThreads print123usingThreeThreads=new Print123usingThreeThreads(TOTAL_NO_OF_THREADS, TOTAL_NO_IN_SEQUENCE);
		Thread t1=new Thread(new SequenceGeneratorTask(print123usingThreeThreads, 1),"Thread-1");
		Thread t2=new Thread(new SequenceGeneratorTask(print123usingThreeThreads, 2),"Thread-2");
		Thread t3=new Thread(new SequenceGeneratorTask(print123usingThreeThreads, 0),"Thread-3");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
