//Q7.Wap enter an array and print the element which is on odd position
package ReturntypewithArgumentmethod;

public class Print_Odd_Position {
	int i,j;
	public int input(int a[])
	{
		for(i=0;i<a.length;i=i+2)
		{
			System.out.println(a[i]+" ");
		}

		return 0;
	}
	public static void main(String arg[])
	{
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		Print_Odd_Position aa=new Print_Odd_Position();
		aa.input(a);
	}

}
