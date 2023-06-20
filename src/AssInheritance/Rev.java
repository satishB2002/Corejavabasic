
package AssInheritance;
import java.util.*;
class input 
{
	  Scanner sc=new Scanner(System.in);
	  int a[]=new int[10];
	  int i;
	  input()
	  {
		  System.out.println("Enter Array Element");
		  for(i=0;i<a.length;i++)
		  {
			a[i]=sc.nextInt(); 
		  }
	  }
	  
	
}
class display extends input
{
	public void res()
	{
		{
			  for(i=a.length-1;i>=0;i--)
			  {
				  System.out.print(a[i]+" ");
			  }
		  }
	}
}
public class Rev {
public static void main(String args[])
{
	display n= new display();
	n.res();
}

}
