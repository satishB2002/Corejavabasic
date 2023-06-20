package Constructor;
/*Q12. WAP In java Reverse the array 
input in constructor and final result through the method. */
import java.util.*;
public class quetion_12 {
	Scanner sc=new Scanner(System.in);

	 int a[]=new int[10];
     int i;
     
     quetion_12()
     {
    	 System.out.println("Enter number ");
      for(i=0;i<a.length;i++)
      {
	a[i]=sc.nextInt();
       }
     }
      public void disp()
      {
    	  for(i=a.length-1;i>0;i--)
    	  {
    		 System.out.println(a[i]+" "); 
    	  }
      }
      public static void main(String arg[])
      {
    	  quetion_12 sc=new quetion_12();
    	  sc.disp();
      }
      
}
