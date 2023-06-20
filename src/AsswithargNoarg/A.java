package AsswithargNoarg;

public class A {
	 public static boolean isPalindrome(int x) {
	    	 
	  	    String s=String.valueOf(x);
	  	    StringBuffer sb	= new StringBuffer(s);
	  	String s1= sb.reverse().toString();
	  	if (s.equals(s1)) {
			return true;
		} else {
        return false;
		}
	  
	    }
	    public static void main(String[] args) {
	    	int x=121;
	    	if(isPalindrome(x))
	    	
	    		System.out.println("palindrome");
	    		
	    	else 
				System.out.println("Not Palindrome");
			
		}

}
