//Q4.Wap enter an array and search any particular element and find the count.
package ReturntypewithArgumentmethod;
import java.util.*;
public class Search_Perticulat_Element {
	int i,j,ele,c,k;
	Scanner sc=new Scanner(System.in);
	public int  input(int a[])
	{
		c=0;
		System.out.println("Search Your Perticular Ele");
		ele=sc.nextInt();
		for(i=0;i<a.length;i++)
		{
			if(a[i]==ele)
			{
				c++;
			
			k=1;
			}
		
	}
		System.out.println("Count ="+c);
			if(k==1)
			{
				System.out.println("Element Are Found");
			}
			else
			System.out.println("Element Are Not Found");
			
		
		return 0;
		
	}
	public static void main(String arg[])
	{
		int a[]= {1,2,5,4,5,6,7,5,9};
		Search_Perticulat_Element ss=new Search_Perticulat_Element();
		ss.input(a);
	}

}
