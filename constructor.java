package oops;

class Alien {
	public int rollno;
	public String name;

	public Alien(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	public int getrollno() {
		return rollno;
	}

	public String getname() {
		return name;
	}

}

public class constructor {

	public static void main(String[] args) {

		Alien a = new Alien(20, "Kajal");
		Alien a1 = new Alien(21, "riya");
		System.out.println(a.getrollno());
		System.out.println(a.getname());
		System.out.println(a1.getrollno());
		System.out.println(a1.getname());
	}

}
