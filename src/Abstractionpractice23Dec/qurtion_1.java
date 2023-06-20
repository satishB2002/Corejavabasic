/*1.## Printing the pattern ##
*****
**** 
***  
**   
* */  
package Abstractionpractice23Dec;
abstract class Pattern
{
	public abstract void Patrern1();
	public abstract void Patrern2();
	public abstract void Patrern3();
	public abstract void Patrern4();
	public abstract void Patrern5();
}
public class qurtion_1 extends Pattern
{
	int i,j;

	@Override
	/*****
	 **** 
	 ***  
	 **   
	 */  
	public void Patrern1() {
		for(i=0;i<5;i++)
		{
			for(j=i;j<5;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		
		
	}
	}
	@Override
	   /*
	   **
	  ***
	 ****
	*****/
	public void Patrern2() {
			
		
		for(i=1;i<=5;i++)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*");	
			}
			System.out.println();
		
		
	}
		
	}

	@Override
	/*****
	  ****
	   ***
	    **
	     */
	public void Patrern3() {
		 for(int i=1; i<=5;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(" ");
				}
					for(int j=5;j>=i;j--)
					{
					System.out.print("*");
					}
						
				System.out.println();
}
}
	@Override
	   /*
	   ***
	  *****
	 *******
	*********/
	public void Patrern4() {
		
		  for(int i=1; i<=4;i++)
			{
				for(int j=5;j>=i;j--)
				{
				System.out.print(" ");
				}
					for(int j=1;j<=i;j++)
					{
					System.out.print("*");
					}
						for(int j=2;j<=i;j++)
						{
						System.out.print("*");
						}
			System.out.println();
			}
	}

	@Override
	public void Patrern5() {
		
		
	}

	public static void main(String arg[])
	{
		qurtion_1 ss=new qurtion_1 ();
		ss.Patrern1();
		ss.Patrern2();
		ss.Patrern3();
		ss.Patrern4();
		ss.Patrern5();
	}
	

	
	
	
}
