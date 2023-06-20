//Q8.Wap enter an array and print the element which is on even position.

package ReturntypewithArgumentmethod;

public class Print_Even_Pos {
	int i,j;
	public int input(int a[])
	{
		for(i=1;i<a.length;i=i+2)
		{
			System.out.println(a[i]+" ");
		}

		return 0;
	}
	public static void main(String arg[])
	{
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		Print_Even_Pos aa=new Print_Even_Pos();
		aa.input(a);
	}

}


