package Practice;

public class Print_max {
	int max=0;
	public int input(int a,int b,int c)
	{
		
				
		if(a>b &&  a>c)
            return a;
		else  if(b>a&&b>c)
              return b;
		else 
		return c;
			
	}
	public static void main(String arg[])
	{
		int a=5,b=6,c=9;
		Print_max ss=new Print_max();
		ss.input(10,20,30);
		//System.out.println("Max"+ss.input(10));
	}

}
