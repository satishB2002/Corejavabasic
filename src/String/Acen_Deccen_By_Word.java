//Q4.Wap enter a string and sort each word of string in accending and decending order by the length of each word.
package String;

public class Acen_Deccen_By_Word {
	String Str="I am form Ahmednagar";
public void name() {
	String []a=Str.split(" ");
	String t;
	for (int i = 0; i < a.length; i++) 
	{
		
			for (int j = 0; j < a.length; j++) 
			{
				if(a[i].length()<a[j].length())
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
	System.out.println("Accending Order =");
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	String k;
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			if(a[i].length()>a[j].length())
			{
				k=a[i];
				a[i]=a[j];
				a[j]=k;
				
			}
		}
	}
	System.out.println("Deccen Order =");
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	}

public static void main(String[] args) {
	Acen_Deccen_By_Word  ss=new Acen_Deccen_By_Word ();
	ss.name();
}
}
