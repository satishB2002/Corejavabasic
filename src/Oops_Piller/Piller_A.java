package Oops_Piller;
public interface Piller_A {
void input();
public static void main(String[] args) {
	
	 System.out.println("====   Interface   =========");
	 pill sd=new pill ();
	 sd.input();
	 System.out.println("====     Polymorphism    =========");
	 LKJ dd=new LKJ();
	 dd.input();
	 dd.input(10);
	 System.out.println("====     Encapsulation       =========");
	 LKJ sm=new LKJ();
	 
		sm.setId(21);
		sm.setName("satish");
		sm.setSal(25000);
		System.out.println("Id="+sm.getId());
		System.out.println("Name="+sm.getName());
		System.out.println("Salary="+sm.getSal());
}
class LKJ
{
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
private int id;
private String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
private double sal;

	public void input() {
		System.out.println("First Method method Overloding");
	}
	public void input(int a) {
		System.out.println("Second  method Overloding="+a);
	}
}
}
