package throw_and_throws;

import java.rmi.AccessException;

public class throw_1 {
	
	public void disp()  {
		int a=19;
		if(a<18){
			throw new ArithmeticException();
			
		}else
		{
			throw new NullPointerException();
			
		}
		
		
	}
public static void main(String[] args) {
	throw_1 ss=new throw_1 ();
	try {
		ss.disp();
		
	} catch (Exception e) {
		System.out.println(e);
	}
	finally {
		System.out.println();
	}
	
	
}
}
