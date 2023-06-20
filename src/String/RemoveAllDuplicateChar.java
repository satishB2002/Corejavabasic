package String;
//4.Wap enter a string and remove all duplicate character using class and object.
public class RemoveAllDuplicateChar {
public void name() {
	String Abc="satish barate";
	char a[]=Abc.toCharArray();
	int b[]=new int[a.length];
	int c=0,t,v=-1;
	for (int i = 0; i < a.length; i++) {
		c=1;
		for (int j = i+1; j < a.length; j++) {
			if(a[i]==a[j])
			{
				b[j]=v;
				c++;
			
			}
		}
		if(b[i]!=v)
			b[i]=c;
		
	}
	for (int i = 0; i < a.length; i++) {
		if(b[i]!=v)
		{
			System.out.println(a[i]+" "+b[i]);
		}
	}
	
}
public static void main(String[] args) {
	RemoveAllDuplicateChar ss= new RemoveAllDuplicateChar();
	ss.name();
}
}
