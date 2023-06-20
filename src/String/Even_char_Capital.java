package String;
import java.util.*;
public class Even_char_Capital {
static String Str="satish  Barate";
static Scanner sc=new Scanner(System.in);
public static   void input()
{
	System.out.println("Enter Your String");
//String Str=sc.nextLine();

for(int i=0;i<Str.length();i++)
{
    

if(i%2==0)

	{char []a=Str.toCharArray();
	
	System.out.print(Character.toUpperCase(a[i]));
	}
	else
	{
		System.out.print(Str.charAt(i));
	}
}
	
}

public static void main(String[] args) {
	input();
}
}