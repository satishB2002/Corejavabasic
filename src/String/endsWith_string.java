package String;
import java.util.*;
public class endsWith_string {
	String s="prashant";
	public boolean endswith()
	{
		if(s.endsWith("nt"))
			return true;
		else
			return false;
	}
	
public static void main(String[] args) {
	endsWith_string ob=new endsWith_string();
	
   if(ob.endswith())
	   System.out.println("found");
   else
	   System.out.println("not found");
   
   
   
	   
}
}