//Q4.Wap find the fabnoscii .
package NORETURNNOARGUMENT_exm;

public class fibnacci {
	int i,n1=0,n2=1,n3,c=10;
	public void input()
	{
		
		
		
		System.out.print(n1+" "+n2+" ");
		for(i=2;i<c;i++)
		{
		n3=n1+n2;
		System.out.print(n3+" ");
		n1=n2;
		n2=n3;
		}
		
		
	}
	public static void main(String arg[])
	{
		fibnacci ss=new fibnacci ();
		ss.input();
	}
	

}
