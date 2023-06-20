package Constructor;

public class Count_Object {
	static int a=10;
	static int c=0;
	Count_Object()
	{
		System.out.println(a);
		a++;
		c++;
		
	}
public static void main(String[] args) {
	
	
	
	 Count_Object ss=new  Count_Object();
	 Count_Object ss1=new  Count_Object();
	 Count_Object ss2=new  Count_Object();
	 Count_Object ss3=new  Count_Object();
	 Count_Object ss4=new  Count_Object();
	
	 System.out.println("Count of Object="+c);
}
}
