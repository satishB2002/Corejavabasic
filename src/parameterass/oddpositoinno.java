package parameterass;
/*Q7.Wap enter an array and print the element which is on odd position.*/
import java.util.*;
public class oddpositoinno {
	int i,j;
	int []a=new int[10];
	Scanner sc=new Scanner(System.in);
public void input()
{
	System.out.println("Enter Array Element");
	for(i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	
}
public void display()
{
	for(i=0;i<a.length;i=i+2)
	{
		
			a[i+1]=a[i];
		
	}
	for(i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
}
public static void main(String arg[])
{
	
	oddpositoinno sc =new oddpositoinno();
	sc.input();
	sc.display();
}
}
