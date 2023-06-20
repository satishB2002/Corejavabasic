package Practice;

import java.util.Scanner;

import String.intern_method;

public class Arm_Strong_no {
	Scanner sc	=new Scanner(System.in);
	public void input() {
		int num;
		
		
		int k=1;
		int	n=1000;
		while (k<=n) {
			int i=0,rem,res=0;
			int temp=k;
		num=k;
		int num1=k;
		while (num!=0) {
			num=num/10;
			i++;	
		}
		while (num1!=0) {
			rem=num1%10;
			res=res+(int)Math.pow(rem, i);
			num1=num1/10;
			
		}
		if (res==temp) 
			System.out.println(res);
			k++;
		
		}
	}
public static void main(String[] args) {
	Arm_Strong_no ss=new Arm_Strong_no();
	ss.input();
	
}
}
