package AssInheritance;
/**Q2. WAP In java Reverse the array 
input in constructor and final result through the method. */
import java.util.*;

	

class quetion
{
	Scanner sc=new Scanner(System.in);
	int a[]=new int[10];
	int i;
	
	quetion()
	{
		System.out.println("Enter Array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	}
}
class reverse1 extends  quetion
{
	reverse1()
{
	    
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
			
		
		

}
}
public class quetion_2
{
public static void main(String arg[])
{
	reverse1 x=new reverse1();
}	
}
