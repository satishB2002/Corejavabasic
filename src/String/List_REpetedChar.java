package String;
// List Repeted Character String
public class List_REpetedChar {
	String Str="Satish Barate ";
	char []a=Str.toCharArray();
	int[] b=new int[a.length];
	int c=0;
	int v=-1;
public void name() {
	for (int i = 0; i < a.length; i++) {
		c=1;
		for (int j =i+1; j < a.length; j++) {
			if(a[i]==a[j])
			{
				b[j]=v;
				c++;
			}
		}
		if(b[i]!=v)
		b[i]=c;
		
	}
	int min=b[0];
	for (int i = 0; i < a.length; i++) {
		
		if(b[i]>min && b[i]>0)
		{
			min=b[i];
					
		}
	
}
	System.out.println(min);
	for (int i = 0; i < a.length; i++) {
		if(b[i]==min)
		{
			System.out.println(a[i]);
			//break;
			
		}
	}
	
}
public static void main(String[] args) {
	List_REpetedChar ss=new List_REpetedChar();
	ss.name();
	
}
}
