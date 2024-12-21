package com.prepare;

import java.util.LinkedList;

class ProdCon {
	LinkedList<Integer> list=new LinkedList<Integer>();
	
	public void produce() throws InterruptedException{
		int value=0;
		while(true) {
			
			synchronized (this) {
				
				while(list.size()>0)
					wait();
				
				System.out.println("Produced data: "+value);
				
				list.add(value);
				value++;
				notify();
				Thread.sleep(1000);
			}
		}
	}
	
	public void consume() throws InterruptedException{
		while(true) {
			
			synchronized (this) {
				
				while(list.size()==0)
					wait();
				
				int value=list.removeFirst();
				
				System.out.println("Consumed data: "+value);
				notify();
				
				Thread.sleep(1000);
			}
		}
	}
}

public class ProducerConsumer{
	public static void main(String[] args) throws InterruptedException {
		ProdCon pc=new ProdCon();
		
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					pc.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					pc.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	}
}