package mixpractice3jan.txt;
import java.util.*;
public class Anticlockwise_Rotation {
	int i,j,x;
	int a[]=new int[5];
	Scanner AA=new Scanner(System.in);
	Anticlockwise_Rotation()
	{
		System.out.println("Enter Your Array");
		for(i=0;i<a.length;i++)
		{
			a[i]=AA.nextInt();
		}
		x=a[0];
		for(i=0;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		a[a.length-1]=x;
		System.out.println("Anticlockwise Rotation");
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		
	}
	public static void main(String arg[])
	{
		Anticlockwise_Rotation aa=new Anticlockwise_Rotation();
	}

}
