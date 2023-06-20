package String;
/*5.Wap to show 1-1 example of these string methods:
charAt
CompareTo
CompareToignore
Concat

Contains
trim*/
public class MethodsExample  {
public void input() 
{
	String Str="Pune";
	for (int j = 0; j < Str.length(); j++) {
		System.out.print(Str.charAt(j));
	}
	System.out.println();
	
}
public int disp() {
	String Abc="Satish";
	String Xyz="satish";
	if(Abc.compareTo(Xyz)==0)
	{
		return 1;
	}
	else
	
	return 0;
	
}
public int  result() {
	String Abc="Satish";
	String Xyz="satish";
	if(Abc.compareToIgnoreCase(Xyz)==0)
	{
		return 1;
	}
	else
	return 0;
}
public void concat() {
	String Abc="Satish";
	String Xyz="Barate";
	System.out.println(Abc.concat(Xyz));
	
}
public void contain() {
	String Abc="Satish";
	String Xyz="Barate";
	System.out.println(Abc.contains(Xyz));
	
}
public void trim() {
	String Str="       Satish Barate      ";
	System.out.println(Str.trim());
	//System.out.println(Str);
}
public static void main(String[] args) {
	MethodsExample ss=new MethodsExample();
	ss.input();
	if(ss.disp()==1)
	{
		System.out.println("String Are Equal");
	}
	else
		System.out.println("String Are Not Equal");
	if(ss.result()==1)
	{
		System.out.println("String Are Equal");
	}
	else
		System.out.println("String Are Not Equal");
	ss.concat();
	ss.contain();
	ss.trim();
}
}
