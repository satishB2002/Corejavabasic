package Practice;

public class PalindromeStringOrNot {
public static void main(String[] args) {
	String a="naman";
	int i,c=0;
	
	for ( i =0; i<a.length()/2; i++) {
		if (a.charAt(i)!=a.charAt(a.length()-i-1)) {
			c++;
		}
	}
	if (c!=0) {
		System.out.println("Not Palindrome");
	}else {
		System.out.println(" Palindrome");
	}
	
}
}
