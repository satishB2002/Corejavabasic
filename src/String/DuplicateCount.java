package String;



//Q3.Java Program to Count Number of Duplicate Words in Given String

public class DuplicateCount {
	public static void input(String s)
	  {
		  int c;
		  System.out.println("String s: "+s);
		  
		  String[] s1=s.split(" ");
		  
		  for(int i=0;i<s1.length;i++)
		  { c=1;
			  for(int j=i+1;j<s1.length;j++)
			  {
				  if(s1[i].equals(s1[j]))
				  {
					  c++;
					  s1[j]="0";
				  }
			  }
		  
		  if(c>1 && s1[i]!="0")
		  System.out.println("Count of Duplicate words in Given String: "+c);
		  } 
	  }
	  public static void main(String args[])
	  {
		  input("words in the words");
	  }
	}