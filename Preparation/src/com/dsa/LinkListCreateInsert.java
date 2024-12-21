package com.dsa;

public class LinkListCreateInsert {

	Node head,tail;
	int size;
	
	public LinkListCreateInsert() {
		head=tail=null;
		size=0;
	}
	
	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}
	
	public void add(int d) {
		Node n=new Node(d);
		if(head==null) {
			head=tail=n;
		}
		else {
			tail.next=n;
			tail=n;
		}
		size++;
	}
	
	public static void main(String[] args) {
		LinkListCreateInsert l=new LinkListCreateInsert();
		l.add(10);
		l.add(20);
		l.add(30);
	}
}
