package Practice;

public class mock_1 {
	public void input() {
	String Str="My Name Is Satish";
	String a[]=Str.split(" ");
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
	for (int i = 0; i < a.length; i++) 
	{
		
		for (int j = 0; j < a.length; j++) 
		{
			if(a[i].length()>a[j].length())
			{
				t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
	}
	System.out.println("Deccending Order =");
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	}
public static void main(String[] args) {
	mock_1 ssMock_1=new mock_1();
	ssMock_1.input();
	
}
}
