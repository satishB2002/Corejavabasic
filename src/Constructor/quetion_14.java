package Constructor;
/*Q14..Find the duplicate from the elements Size of array will be 10; 
input in constructor and final result through the method. */
import java.util.*;
public class quetion_14 {
	int i,j,t;
	int []a =new int[5];
	Scanner sc =new Scanner(System.in);
	quetion_14()
	{
		System.out.println("Enter Element");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	}
		public void disp()
		{System.out.println("Duplicate Element");
			for(i=1;i<a.length;i++)
			{
				for(j=i+1;j<a.length;j++)
				{
					if(a[i]>a[j])
					
						
					System.out.println(a[j]+" ");
				}
			}
		}
		
		public static void main(String arg[])
		{
			quetion_14 sc=new quetion_14();
			sc.disp();
		}
	
}
