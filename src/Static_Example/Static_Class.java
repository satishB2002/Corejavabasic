package Static_Example;

public class Static_Class {
	static int c=10;
	Static_Class()
	{
		c++;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Static_Class ss=new Static_Class();
		Static_Class ss1=new Static_Class();
		Static_Class ss2=new Static_Class();
		Static_Class ss3=new Static_Class();
		Static_Class ss4=new Static_Class();
		Static_Class ss5=new Static_Class();
	}

}
