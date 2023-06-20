package Practice;
/*
 * Java Array: Exercise-33 with Solution
Write a Java program to remove the duplicate elements
 of a given array and return the new length of the array.
Sample array: [20, 20, 30, 40, 50, 50, 50]
After removing the duplicate elements the program should 
return 4 as the new length of the array.
 */
public class Removeduplicate {

	int a[]= {20, 20, 30, 40, 50, 50, 50};
	int b[]=new int[a.length];
	int i,j,x=-1,k;
	Removeduplicate()
	{
		for(i=0;i<a.length;i++)
		{
			k=1;
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					b[j]=x;
					k++;
				}
			}
			if(b[i]!=x)
			{
				b[i]=k;
			}
		}
		int m=0;
		for ( i = 0; i < a.length; i++) {
			if(b[i]!=x)
			{
				System.out.println(a[i]+" ");
				m++;
			}
			
		}
		System.out.println("New Size="+m);
	}
	
	public static void main(String[] args) {
		Removeduplicate ok=new Removeduplicate();
	}
}
