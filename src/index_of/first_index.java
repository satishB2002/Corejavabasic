package index_of;

public class first_index {
	public static void input()
	{
		String s2="Satish barate";
		int formindex=s2.indexOf("b",3);
		System.out.println("The form  index of a="+formindex);
		System.out.println("Char Array==");
		char []ch =s2.toCharArray();
		int i;
		for(i=0;i<ch.length;i++)
			System.out.print(ch[i]+" ");
	}
	public static void main(String arg[])
	{
		String s="Codenera";
		String s1="vjnhnhofv";
		int index=s.indexOf('d');
		System.out.println("The first index of a="+index);
		int lastindex=s.lastIndexOf('a');
		System.out.println("The last index of a="+lastindex);
		int formindex=s1.indexOf("v",5);
		System.out.println("The form  index of a="+formindex);
		first_index  ss=new first_index ();
		ss.input();
	}

}
