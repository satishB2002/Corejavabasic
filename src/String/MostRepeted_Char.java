package String;
//Q6.Write a Java program to find most repetitive character or maximum occurring character in the given string. 

public class MostRepeted_Char {
public void name() {
	String Str="Satisssh";
	char []a=Str.toCharArray();
	int []b=new int[a.length];
	int c,v=-1;
	int i,j;
	for ( i = 0; i < a.length; i++) {
		c=1;
		for (j = i+1; j < a.length; j++) {
			if(a[i]==a[j])
			{
				b[j]=v;
				c++;
			}
			
		}
		if(b[i]!=v)
		{
		b[i]=c;
		}
	}
		
			int max=b[0],maxEle=a[0];
			for ( i = 0; i < a.length; i++) {
				if(b[i]>max)
				{
					max=b[i];
					maxEle=a[0];
				}
			}
			
			System.out.println("Most REpeted  Char is="+(char)maxEle);
			System.out.println("Count of Char ="+max);
		}
		
	

public static void main(String[] args) {
	MostRepeted_Char ss=new MostRepeted_Char();
	ss.name();
}
}
