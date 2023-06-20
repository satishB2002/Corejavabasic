package String;

public class split_Find_length {
public void input()
{
	String s="Satish Barate";
	String []ss=s.split(" ");
	int i;
	
	for(i=0;i<ss.length;i++)
	{
		System.out.println(ss[i]);
	}
	
}
public static void main(String arg[])
{
	split_Find_length ds=new split_Find_length();
	ds.input();
}
}
