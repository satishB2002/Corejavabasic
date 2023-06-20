package Practice_Most;
import java.util.*;
public class Array_deletion {
	int i,j;
	int a[]=new int[10];
	Scanner sc=new Scanner(System.in);
	public void input() {
		System.out.println("Enter Your Array");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
			
		}
		System.out.println("Enter Your Delete ele");
		int ele=sc.nextInt();
		for ( i = 0; i < a.length-1; i++) {
			if(a[i]==ele)
			{
				a[i]=a[i+1];
			}
		
		}
			for ( i = 0; i < a.length; i++) {
				
				System.out.println(a[i]);
			}
		
	}
	public static void main(String[] args) {
		 Array_deletion ss=new  Array_deletion();
		 ss.input();
	}

}
