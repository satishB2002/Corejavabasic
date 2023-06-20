package String;
//Q6.Wap enter a string and print first non repeating character using class and object.
public class FirstNonRepetingChar {
String Str="satish";
public void name() {
	
	char a[]=Str.toCharArray();
	int c=0;
	for (int i = 0; i < a.length; i++) {
		
	
			
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j])
				{
					c++;
				}
				
			}
			if(c==0)
			{
				System.out.println(a[i]);
				break;
			}
		}
}
public static void main(String[] args) {
	FirstNonRepetingChar ss=new FirstNonRepetingChar();
	ss.name();
}
}
