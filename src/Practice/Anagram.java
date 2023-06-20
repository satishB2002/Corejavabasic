package Practice;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String s="Peek";
	String s1="keep";
	s=s.toLowerCase();
	s1=s1.toLowerCase();
	if(s.length()==s1.length())
	{
	char []a=s.toCharArray();
	char []	b=s1.toCharArray();
	Arrays.sort(a);
	Arrays.sort(b);
		
	

	if(Arrays.equals(a, b))
	{
		System.out.println("Anagram Possible");
	}
	else
		System.out.println("Anagram not Possible");
	}
	
	
}
}
