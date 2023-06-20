package Interface;
import java.util.*;
class calculator implements interface1

{
static	Scanner ob=new Scanner(System.in);
   int a=200, b=100;
   public void choice()
   {
	   System.out.println("Entrer Your Operation");
	   System.out.println("Enter 1 To  Addition");
		System.out.println("Enter 2 To Substarction");
		System.out.println("Enter 3 To  Multiplication");
		System.out.println("Enter 4 To  Division");
   }
	@Override
	public void add() {
		// TODO Auto-generated method stub
	int sum =a+b;
		System.out.println("Sum="+" "+sum);
	}
	

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		int sub =a-b;
		System.out.println("Sub"+" "+sub);
	
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		int mul =a*b;
		System.out.println("mul"+" "+mul);
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		double div =a/b;
		System.out.println("div"+" "+div);
	}
	
	
	
}

