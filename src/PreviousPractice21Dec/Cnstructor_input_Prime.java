
package PreviousPractice21Dec;
import java.util.*;
public class Cnstructor_input_Prime {
	int i,j,k,n,t;
	Scanner sc=new Scanner(System.in);
			Cnstructor_input_Prime()
	{
				System.out.println("Enter Your First Range");
				k=sc.nextInt();
				System.out.println("Enter Your Last Range");
				n=sc.nextInt();
				for(i=k;i<=n;i++)
				{
					
					t=0;
					for(j=2;j<i-1;j++)
					{
						if(i%j==0)
						t=n+1;
					
						
					}
					if(t==0)
						System.out.println(i+" ");
				}
		
	}
			public static void main(String arg[])
			{
				Cnstructor_input_Prime sb =new Cnstructor_input_Prime ();
			}
}
