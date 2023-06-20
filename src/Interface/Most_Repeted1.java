package Interface;
import java.util.*;
public class Most_Repeted1 implements Most_Repeted ,first,first1,first2,first3,first4,first5,first6,first7,first8,first9,first10,first11,first12{
int i,j,t,k,count;
int a[]= {1,2,3,4,5};
int b[]= {2,1,3,5,4,6,7,9,8,19,11};
int size=a.length+b.length;
int c[]=new int[size];
int x;
 static Scanner sc=new Scanner(System.in);
 public void ten() {
		System.out.println("Your Array");
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		
	}
	@Override
	public void First() {
		System.out.println("Reverse Array");
		for(i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]+" ");
		}
		}
@Override
	public void second() {
	
		System.out.println("Clockwise Rotation");
		x=a[a.length-1];	
		for(i=a.length-2;i>=0;i--)
		{
			a[i+1]=a[i];
		}
		a[0]=x;;
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		
	}

	@Override
	public void fourteen() {
		System.out.println("Anticlockwise Rotation");
		a[0]=x;
		for(i=1;i<a.length;i++)
		{
			a[i-1]=a[i];
		}
		x=a[a.length-1];
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	@Override
	public void thirteen() {
		
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println("Accen Order");
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		
		
		
	}

	@Override
	public void twele(){
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println("Deccen Order");
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		
	}

	@Override
	public void eleven() {
		
		System.out.println("Enter Your Search Element");
		k=sc.nextInt();
		for(i=0;i<a.length;i++)
		{
			if(a[i]==k)
			{
				
			count++;
			}	
		}
		if(count==1)
		{
			System.out.println("Element are Found");
		}
			else
			System.out.println("Element Not  are Found");
		
			
		
		
	}

	

	@Override
	public void third() {
		
		
	}

	@Override
	public void eight() {
		
		
	}

	@Override
	public void seven() {
		
		
	}

	@Override
	public void six() {
	
		
	}

	@Override
	public void fifth() {
		
		
	}

	@Override
	public void fourth() {
		
		
	}
	public static void main(String ar[])
	{
		
		
		Most_Repeted1 ss=new Most_Repeted1 ();
		ss.ten();
		ss.First();
		ss.thirteen();
		ss.twele();
		ss.eleven();
		ss.third();
		ss.eight();
		ss.seven();
		ss.six();
		ss.fifth();
		ss.fourth();
		ss.second();
	    ss.fourteen();
	}

}
