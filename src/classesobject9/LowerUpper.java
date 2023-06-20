package classesobject9;
/*Q3.Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).*/
import java.util.*;
public class LowerUpper {
	char s;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter character");
		s=sc.next().charAt(0);
		if(s>=97 && s<=123)
		{
			System.out.println("Charater is Lower Case");
		}
		else if(s>=65 && s<=96)
		{
			System.out.println("Charater is Upper Case");
		}
		
	}
	public static void main(String sb[])
	{
		LowerUpper sc=new LowerUpper ();
		sc.input();
	}
}












