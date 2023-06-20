//Q11.Wap enter an array and print it in reverse order.
package ReturntypewithArgumentmethod;

public class Reverse_Array {
	int i,j;
	public int input(int a[])
	{
		for(i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]+" ");
		}
		
		
		return 0;
	}
    public static void main(String arg[])
    		{
    	int a[]= {1,2,3,4,5,6,7,8,9};
    	Reverse_Array ab=new Reverse_Array();
    	ab.input(a);
    		}
}
