package oops;

class staff {
	private int id;
	private String name;
	private String add;

	public void setid(int id) {
		this.id = id;
	}
	public void setname(String name) {
		this.name = name;
	}
	public void setadd(String add) {
		this.add = add;
	}
	public int getid() {
		return id;
	}
	public String getname() {
		return name;
	}
	public String getadd() {
		return add;
	}
}
public class encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staff s1 = new staff();
		s1.setid(101);
		s1.setname("kajal");
		s1.setadd("Dehradun");
		System.out.println(s1.getid());
		System.out.println(s1.getname());
		System.out.println(s1.getadd());
	}
}
