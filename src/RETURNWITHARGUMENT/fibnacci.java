//Q4.Wap find the fabnoscii .
package RETURNWITHARGUMENT;
public class fibnacci {
	;
	public int input(int n1,int n2,int c)
	{
		
		
		
		System.out.print(n1+" "+n2+" ");
		for(int i=2;i<c;i++)
		{
		int n3=n1+n2;
		System.out.print(n3+" ");
		n1=n2;
		n2=n3;
		}
		return 0;
		
	}
	public static void main(String arg[])
	{
		int i,n1=0,n2=1,n3,c=10;
		fibnacci ss=new fibnacci ();
		ss.input(n1,n2,c);
	}
	

}

