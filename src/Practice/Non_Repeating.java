package Practice;
import java.util.*;
public class Non_Repeating {

public static void main(String arg[])
{
	
	
	int a[]= {1,1,3,2,2,5,5,6,6,6};
	int res=a[0];

	for(int i=1;i<a.length;i++)
	{
		
	res=res^a[i];
			
	}
	System.out.println("First Repeted Are"+res);


}

}
