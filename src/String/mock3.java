package String;

public class mock3 {
	public static void main(String[] args) {
		String s="guruprasadg";
		System.out.println(s);
		char a[]=s.toCharArray();
		int i,c=0;
	 for(i=0;i<s.length();i++)
	 {
		 if(s.charAt(0)==s.charAt(s.length()-1))
				 {
			         c++;
				 }
	 }
	 
	 if (c>0)
	 {
		 for(i=1;i<s.length()-1;i++)
		 {
			 System.out.print(s.charAt(i));
		 }
	 }
	 else {
		 for(i=0;i<s.length();i++)
		 {
			 System.out.print(s.charAt(i));
		 }
		
	}
		 
	}

}
