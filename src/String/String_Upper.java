package String;

public class String_Upper {
	String Str="satish barate";
	
	public void input()
	{
		int i;
		for(i=0;i<Str.length();i++)
		{
			if(i%2==0)
			
					Str=Str.toUpperCase();
			else
				Str=Str.toLowerCase();
			System.out.println(Str.charAt(i)+" ");
				
			
		}
		
	}
	public static void main(String[] args) {
		String_Upper ss=new String_Upper();
		ss.input();
	}

}
