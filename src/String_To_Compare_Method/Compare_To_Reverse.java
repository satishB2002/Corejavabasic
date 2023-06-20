package String_To_Compare_Method;
import java.util.*;
public class Compare_To_Reverse {
	static Scanner sc=new Scanner(System.in);
static 	String Ag;
public static void  input()
{
	System.out.println("Enter String");
	Ag=sc.nextLine();
	for(int   i=Ag.length()-1;i>=0;i--)
	{
		System.out.print(Ag.charAt(i));
	}
	
}

public static void main(String arg[])
{
	input();
}

}
