//Q9. WAP to replace all the 0’s with 1’s in your array. Your array is [26, 0, 67, 45, 0, 78, 
 //   54, 34, 10, 0, 34] 
package Array_Big_Assignment;

public class Quetion_9 {
	int i,j;
	int a[]= {26, 0, 67, 45, 0, 78,54, 34, 10, 0, 34};
	int c=0;
	public void replace() {
		for (i = 1; i < a.length; i++) 
		{
			if(a[i]==0)
			{
				a[i]=1;
			}
			System.out.println(a[i]+" ");
			
		}
		
	}
	public static void main(String[] args) {
		Quetion_9 ss=new Quetion_9 ();
		ss.replace();
	}

}
