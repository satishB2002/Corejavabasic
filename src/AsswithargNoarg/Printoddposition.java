package AsswithargNoarg;
/*Q7.Wap enter an array and print the element which is on odd position.*/

public class Printoddposition {
public void input(int a[])
{
	for(int i=0;i<a.length;i=i+2)
	{
			System.out.print(a[i]+" ");
	}
	
}
public static void main(String arg[])
{
	int a[]= {1,2,3,4,5,6,7,8,9};
	Printoddposition sc=new Printoddposition();
	sc.input(a);
}

}
