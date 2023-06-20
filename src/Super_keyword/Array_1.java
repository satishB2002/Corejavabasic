package Super_keyword;
import java.util.*;

class abc 
{

	 int i,j;
		int a=22;
		Scanner sc=new Scanner(System.in);
		
		abc (int k)
		{
		System.out.println("Parent Array")	;
		
		this.a=k;
			System.out.println(a+" ");
		
		}
		public void input(int a[])
		{
			for(i=0;i<a.length;i++)
			{
				System.out.println(a[i]+" ");
			}
		}
	 
}

public class Array_1 extends  abc {
	Array_1() {
		super(100);
		// TODO Auto-generated constructor stub
	}


	int i,j,k;
	int a=22;
	Scanner sc=new Scanner(System.in);
	

	public void input(int a[])
	{
		
	}
	public static void main(String arg[])
	{
		Array_1 sb=new Array_1();
	}
	
}
