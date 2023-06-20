package Abstract;

import java.util.Scanner;

public class Hide_2 extends  Hide_1{
int pin,balnce;
Scanner sc=new Scanner(System.in);
	@Override
	void input() {
		
		System.out.println("!!! Check Your Balance !!! ");
		System.out.println("                Enter Your Pin                       ");
		pin=sc.nextInt();
		balnce=10000;
		System.out.println("Your Bank Balnce is ="+balnce);
		
	}

	

}
