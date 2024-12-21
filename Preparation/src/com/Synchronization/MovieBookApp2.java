package com.Synchronization;

//static synchronization for class level in this class acquires a lock 
class BookTheatreSeats2 {
	static int total_seats = 20;

	static synchronized void bookseats(int seats) {
		if (total_seats >= seats) {
			System.out.println(seats + " Seats booked successfully");
			total_seats = total_seats - seats;
			System.out.println("Seats Left: " + total_seats);
		} else {
			System.out.println("Seats not available");
			System.out.println("Seats left: " + total_seats);
		}
	}
}

class MyThread1 extends Thread {
	int seat;
	BookTheatreSeats2 b;

	MyThread1(int s, BookTheatreSeats2 b) {
		this.seat = s;
		this.b = b;
	}

	@Override
	public void run() {
		b.bookseats(seat);
	}
}

class MyThread2 extends Thread {
	int seat;
	BookTheatreSeats2 b;

	MyThread2(int s, BookTheatreSeats2 b) {
		this.seat = s;
		this.b = b;
	}

	@Override
	public void run() {
		b.bookseats(seat);
	}
}

public class MovieBookApp2 extends Thread {

	public static void main(String[] args) {
		
		BookTheatreSeats2 b = new BookTheatreSeats2();
		MyThread1 m = new MyThread1(7, b);
		m.start();
		
		MyThread2 m1 = new MyThread2(8, b);
		m1.start();
		
		BookTheatreSeats2 b1 = new BookTheatreSeats2();
		MyThread1 m2 = new MyThread1(7, b1);
		m2.start();
		
		MyThread2 m3 = new MyThread2(4, b1);
		m3.start();
		
		
	}
}
