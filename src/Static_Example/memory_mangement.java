package Static_Example;

public class memory_mangement {
		int id;
		String name;
		int sal;
		static String C_name="Heaven";
	public memory_mangement(int id, String name, int sal) {
			super();
			this.id = id;
			this.name = name;
			this.sal = sal;	
		}
	public void disp()
	{
		System.out.println("\nid="+id+" \tName="+name+"\tsal="+sal+"\tCompany name="+C_name);
	}

	public static void main(String[] args) {
		memory_mangement  ss=new memory_mangement (11, "satish", 1500);
		memory_mangement  ss1=new memory_mangement (12, "sagar", 1600);
		memory_mangement  ss2=new memory_mangement (13," avi", 1700);
		memory_mangement  ss3=new memory_mangement (14, "amol", 1800);
		ss.disp();
		ss1.disp();
		ss2.disp();
		ss3.disp();
		
	}
}
