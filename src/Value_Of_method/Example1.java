package Value_Of_method;

public class Example1 {
	public static String valueOf(char c)
	{
		String s=String.valueOf(c);
		System.out.println("The value of="+s);
		return null;
		
	}
	public static String valueOf(char[]data)
	{
		String s=String.valueOf(data);
		
		System.out.println("The value of="+s);
		return null;
		
		
	}
	public static String valueOf(char []data,int count)
	{
		String s=String.valueOf(data);
		System.out.println("The (String Count)value of="+s);
		return null;
		
	}
	public static String valueOf(double d)
	{
		String s=String.valueOf(d);
		
		System.out.println("The double value of="+s);
		return null;
		
	}
	public static String valueOf(float f)
	{
		String s=String.valueOf(f);
		System.out.println("The float value of="+s);
		return null;
		
	}
	public static String valueOf(boolean r)
	{
		String s=String.valueOf(r);
		System.out.println("The boolean value of="+s);
		return null;
		
	}
	public static void main(String arg[])
	{
		int i=100;
		boolean r=true;
		String s=String.valueOf(i);
		String s1=String.valueOf(r);
		System.out.println("The value of="+s);
		Example1  ss=new Example1 ();
		ss.valueOf(10);
		ss.valueOf(true);
		ss.valueOf('s');
		ss.valueOf(10000.0f);
		ss.valueOf(5000.0d);
		
	}

}
