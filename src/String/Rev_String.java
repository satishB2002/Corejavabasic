package String;

public class Rev_String {
	private static boolean isPalindrome (String Str){
		int len=Str.length();
		int i,j;
		j=len-1;
		for ( i = 0; i <=(len-1)/2; i++) {
			
			if(Str.charAt(i)!= Str.charAt(j))
				return false;
				j--;
			}
		
		return true ;
		
	}
public static void main(String[] args) {
	String Str="aba";
	 
	 isPalindrome(Str);
	

}
}
