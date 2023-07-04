package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class TicketSort {
	public static void main(String[] args) {
		Passenger[] p1 = new Passenger[2];
		p1[0] = new Passenger("Bhasker", 20);
		p1[1] = new Passenger("Mohan", 6);
		Ticket t1 = new Ticket("1", "11/11/11", 600, p1, 2);
		Passenger[] p2 = new Passenger[3];
		p2[0] = new Passenger("madhu", 20);
		p2[1] = new Passenger("hemu", 26);
		p2[2] = new Passenger("kiran", 28);
		Ticket t2 = new Ticket("2", "13/11/11", 800, p2, 3);
		Passenger[] p3 = new Passenger[4];
		p3[0] = new Passenger("madhu", 20);
		p3[1] = new Passenger("hemu", 26);
		p3[2] = new Passenger("kiran", 28);
		p3[3] = new Passenger("Ronaldo", 28);
		Ticket t3 = new Ticket("2", "12/11/11", 400, p3, 4);
		ArrayList<Ticket> tarr1 = new ArrayList<>();
		Collections.addAll(tarr1, t1, t2, t3);

		System.out.println(tarr1);
		Collections.sort(tarr1);
		System.out.println(tarr1);
	}
}

class Ticket implements Comparable<Ticket> {
	String num;
	String traveldate;
	double price;
	double fare;
	Passenger[] p;
	int pCount;

	public int getpc() {
		return pCount;
	}

	public String getdate() {
		return traveldate;
	}

	public Ticket(String n, String t, double f, Passenger[] ppp, int c) {
		num = n;
		traveldate = t;
		price = f;
		p = ppp;
		pCount = c;
	}

	public double faree() {
		double tfare = 0;
		for (Passenger o : p) {
			if (o.geta() <= 6) {
				tfare += 0;
			} else if (o.geta() <= 20) {
				tfare += price * 0.5;
			} else {
				tfare += price;
			}
		}
		return tfare;
	}

	public int compareTo(Ticket t) {
		return (int) (this.faree() - t.faree());
	}
}

class Passenger {
	String name;
	public int age;

	public Passenger(String n, int a) {
		name = n;
		age = a;
	}

	public int geta() {
		return age;
	}

}
