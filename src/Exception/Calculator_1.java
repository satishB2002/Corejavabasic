package Exception;
import java.util.*;
public abstract class Calculator_1 {
	public abstract  void input();
public abstract void Addition();
public abstract void Substaction();
public abstract void Multiplication();
public abstract void Division();
public static void main(String[] args) {
	Calculator_2  ss=new Calculator_2 ();
	ss.input();
	int a;
	Scanner ob=new Scanner(System.in);
	a=ob.nextInt();
	switch(a)
	{
	case 1:
	ss.Addition();
	break;
	case 2:
	ss.Substaction();
	break;
	case 3:
	ss.Multiplication();
	break;
	case 4:
	ss.Division();
	break;
	default:
		System.out.println("!!!!! Wrong Choice Enter Valid Number !!!!!");
	}
}
}
