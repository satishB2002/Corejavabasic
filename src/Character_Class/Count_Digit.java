package Character_Class;

public class Count_Digit {
public static void main(String[] args) {
	int i,c=0;
	String Str="WelcomeIndia251Times";
	char []a=Str.toCharArray();
	for(i=0;i<a.length;i++)
	{
		if(Character.isDigit(a[i]))
		{
		c++;
		}
	}
	System.out.println("Count is Digit="+c);
	
}
}
