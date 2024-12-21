package com.Synchronization;

class BookTheatreSeats {
	int total_seats = 10;

	synchronized void bookseats(int seats) {
		if (total_seats >= seats) {
			System.out.println(seats+" Seats booked successfully");
			total_seats = total_seats - seats;
			System.out.println("Seats Left: " + total_seats);
		} else {
			System.out.println("Seats not available");
			System.out.println("Seats left: " + total_seats);
		}
	}
}

public class MovieBookApp extends Thread {
	static BookTheatreSeats b;
	int seat;

	@Override
	public void run() {
		b.bookseats(seat);
	}

	public static void main(String[] args) {
		
		b = new BookTheatreSeats();

		MovieBookApp m1 = new MovieBookApp();
		m1.seat = 3;
		m1.start();

		MovieBookApp m2 = new MovieBookApp();
		m2.seat = 2;
		m2.start();
	}
}
 