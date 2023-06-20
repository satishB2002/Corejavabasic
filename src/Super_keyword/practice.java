package Super_keyword;

import java.util.*;

class AA
{ 
	int i,max;
	Scanner sc=new Scanner(System.in);
	int a[]= {6,5,4,3,2,1};
	AA(int max)
	{
       this.max=max;
       System.out.println("max ="+max);
	}
	
	public void input()
	{
		System.out.println("\n array ");
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
	}
	
}
}
public class practice extends AA{
	
	public void display()
	{
		System.out.println("\n reverse");
		for(i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
	}
	}
	
	practice()
	{
		super(5);
		input();
		display();
		
	}
	public static void main(String[] args) {
		
		practice ob=new practice();
		
	}
	

}
