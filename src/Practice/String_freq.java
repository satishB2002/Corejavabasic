package Practice;

import String.intern_method;

public class String_freq {
	public void freq() {
		String str="At Ptunen ee";
		char a[]=str.toCharArray();
		int b[]= new int [a.length];
		int	c,v=-1;
		for (int i = 0; i < b.length; i++) {
			c=1;
			for (int j = i+1; j < b.length; j++) {
				if (a[i]==a[j]) {
					b[j]=v;
					c++;
					}
					
				}
			if (b[i]!=v) {
				b[i]=c;
				
				
			}
			
			}
		for (int i = 0; i < b.length; i++) {
			if (b[i]!=v) {
				System.out.println(a[i]+" "+b[i]);
			}
		}
		
	}
public static void main(String[] args) {
	String_freq ss	=new String_freq();
	ss.freq();
}
}
