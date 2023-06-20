/*Q10. Write a Java program to find the common elements between two arrays (int values) 
Means e.g. arr1[] = [12, 23, 34, 67 ,78, 91, 56] and arr2[] = [39, 25, 15, 23, 55, 91, 
66, 22], so common between two arrays are 23 and 9*/
package interface_practce_ass;
import java.util.*;
public class Common_Element_1 implements  Common_Element{
	int i,j;
	int a[]= {12, 23, 34, 67 ,78, 91, 56};
	int b[]= {39, 25, 15, 23, 55, 91,66,22};
	
    
	@Override
	public void common() {
		System.out.println("First Array");
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		System.out.println("Second  Array");
		for(i=0;i<a.length;i++)
		{
			System.out.println(b[i]+" ");
		}
		 
		 System.out.println("Common Element");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.print(a[i]+" ");
				}
			}
		}
			
		
	}
		public static void main(String arg[])
		{
			Common_Element_1 ss=new Common_Element_1();
			ss.common();
		}
		
	
	

}
