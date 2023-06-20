package Returntype;
import java.util.*;
public class Primeboolean {
	int num;
	int temp;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter number");
		num=sc.nextInt();
	}
	public boolean Checkprime()
	{
		
		int temp=num;
		for(int i=2;i<num-1;i++)
		{
			if(num%i==0)
			temp=num+1;
		}
		if(temp==0)
			return true;
		else
			return false;
	}
	public void main(String arg[])
	{
		Primeboolean sc=new Primeboolean();
		sc.input();
		boolean x=sc.Checkprime();
		System.out.println(" "+x);
	}
}

