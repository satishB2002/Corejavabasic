package String;

public class String_Palindrome {
	public void input()
	{
	 
		 String s=("sss");
	    	System.out.println("String s: "+s);
	    	
	    	StringBuffer sb=new StringBuffer(s);
	    	String s2=sb.reverse().toString();
	    	
	    	
	    	if(s.equals(s2))
	    	{
	    		System.out.println("String is palindrome");
	    	}
	    	else
	    		System.out.println("String is not palindrome");
	    }

	    public static void main(String[] args) {
	    	String_Palindrome ss=new String_Palindrome();
	    	ss.input();
	    }
}
