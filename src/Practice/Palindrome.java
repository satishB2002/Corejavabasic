package Practice;

public class Palindrome {
	
		Palindrome()
		{
			int no=122,rev,rem,t;
			t=no;
			rev=0;
			while(t!=0) 
			{
				rem=t%10;
				rev=rev*10+rem;
				t=t/10;
			}
			if(rev==no)
			{
				System.out.println("P");
			}
			else
			{
				System.out.println(" N P");
			}
				
			
		}
		public static void main(String arg[])
		{
			Palindrome sc=new Palindrome();
		}
	
}
