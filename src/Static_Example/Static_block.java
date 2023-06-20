package Static_Example;

public class Static_block {
	 static int a=33,b=55;
	static
	{
		 int p=16,q=67;
		System.out.println(" static  Class");
		System.out.println("p of ="+p+" "+" q of ="+q);
	}
	  class Static1
	 {
		
		 static
		 {
			 System.out.println("Inner Non Static class ");
			 System.out.println("a of "+a+" b of"+b);
		 }
	 }
	 
	 public static void main(String arg[])
	 {
		
		// Static_block.Static1 sd=new Static_block.Static1();
		
		 System.out.println(Static_block.a);
		 Static_block sc=new Static_block();
		Static_block.Static1 ss=sc.new Static1();
		
		 
		 
		 
		
	 
	 }

}
