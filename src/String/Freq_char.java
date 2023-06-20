package String;

public class Freq_char {
public static void main(String[] args) {
	String S1="My name is satish";
	char a[]=S1.toCharArray();
	int b[]=new int[a.length];
	int v=-1;
	int c=0;
	for (int i = 0; i < b.length; i++) {
		c=1;
		for (int j = i+1; j < b.length; j++) {
			if (a[i]==a[j]) {
				b[j]=v;
				c++;
			}
		}
		if(b[i]!=v)
			b[i]=c;
		
	}
	for (int i = 0; i < b.length; i++) {
		if(b[i]!=v)
		{
			System.out.println(a[i]+" "+b[i]);
		}
	}
}
}
