package Technical_Array;
//Q13.Java Program to Check if Two Arrays Are Equal or Not

public class Array_EqualOrNot {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7,8};
	int b[]= {1,2,3,4,5,6,7,9};
	int i;
	int c=0;

		if(a.length!=b.length)
		{
			System.out.println("Arry Not Equal");
		}
		else
		{
		for(i=0;i<a.length;i++)
		{
			if(a[i]!=b[i])
				c++;
		}
			
		
		if(c==0)
		{
			System.out.println("Arry equal ");
		}
		else
			System.out.println("Array Not Equal");
	}
	
		
}
}
