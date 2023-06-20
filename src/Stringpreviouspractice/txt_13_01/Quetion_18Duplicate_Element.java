package Stringpreviouspractice.txt_13_01;

import java.util.Scanner;

public class Quetion_18Duplicate_Element {
	
	static Scanner kk=new Scanner(System.in);
	static
	{
		 String Hil;
		 int i,j;
	
		System.out.println("Enter String");
		Hil=kk.nextLine();
		char a[]=Hil.toCharArray();
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				
				if(a[i]==a[j])
				{
					System.out.print(a[j]+" ");
					
				}
			}
			
			
		}
}
	public static void main(String[] args) {
		
	}
}
