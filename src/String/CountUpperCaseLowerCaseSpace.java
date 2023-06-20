package String;
/*11.Wap enter a stringa ns find the count of:
	  upper case
	  lower case
	  white space*/
public class CountUpperCaseLowerCaseSpace {
public void name() {
	String Str="Satish Batate in punE";
	int c=0,k=0,l=0,n=0;
	for (int i = 0; i < Str.length(); i++) {
		if(Str.charAt(i)>='A'&&Str.charAt(i)<='Z')
		{
			c++;
		}
		else if(Str.charAt(i)>='a'&&Str.charAt(i)<='z')
		{
			k++;
		}
		else if(Str.charAt(i)>=' ')
		{
			l++;
		}
		else
			n++;
	}
	System.out.println("Count Of Upper Case="+c);
	System.out.println("Count Of Lower Case="+k);
	System.out.println("Count Of  Space="+l);
	System.out.println("Count Of  Special Char="+n);
}
public static void main(String[] args) {
	CountUpperCaseLowerCaseSpace ss=new CountUpperCaseLowerCaseSpace();
	ss.name();
}
}
