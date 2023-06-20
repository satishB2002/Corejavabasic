package Interface;

import java.util.Scanner;

public interface interface1 
{

	public void add();
	public void sub();
	public void mul();
	public void div();

 	public static void main(String[] args) {
		int i;
		Scanner ss1=new Scanner(System.in);
		calculator ss=new calculator();
		char ch;
		do
		{
			ss.choice();
			System.out.println("Enter Your Choice");
			int n=ss1.nextInt();
		switch(n)
		{
		
		case 1:
		ss.add();
		break;
		case 2:
		ss.sub();
		break;	
		case 3:
		ss.mul();
		break;
		case 4:
		ss.div();
		break;
		default:
			System.out.println("Wrong choice");
		}
		
			 System.out.println("\n Do you want to continue the task?"+"\nIf yes press 'Y'or 'y'"+"\nIf No press 'N'or 'n'");
	         ch=ss1.next().charAt(0);
		}while(ch=='Y' || ch=='y');
		if(ch!='Y' || ch!='y')
        	System.out.println("operation Exit");
	}
 }

