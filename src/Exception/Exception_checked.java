package Exception;

import java.io.InputStream;

public class Exception_checked {
	 
			public static void main(String[] args) {
				int a=20;
				 int b=0;
				 int n = 0;
	System.out.println("Your A is ="+a);
	System.out.println("Your B is ="+b);
	try {
	 n=a/b;
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println(n);
		System.out.println( e);
		System.out.println("You Are Not Alloweded Divisible by Zero");
	}
	System.out.println("Hello Method");
	}
			
}
