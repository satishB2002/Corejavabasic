package AsswithargNoarg;
/*Q3. WAP to replace all the 0’s with 1’s in your array. Your array is [26, 0, 67, 45, 0, 78, 
                                                                      54, 34, 10, 0, 34] */
import java.util.*;
public class Zerorepalaceone {
	
	public void input(int a[])
	{int t=1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				a[i]=t;
			}
			System.out.print(a[i]+" ");
		}
		
	}
	public static void main(String arg[])
	{
		int a[]= {26,0,67,45,0,78,54,34,10,0,34};
		Zerorepalaceone sc =new Zerorepalaceone();
		sc.input(a);
		
	}

}
