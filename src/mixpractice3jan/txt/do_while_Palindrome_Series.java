package mixpractice3jan.txt;

public class do_while_Palindrome_Series {
int i,j,n;
int rem,rev,t;
public void input()
{
	i=1;
	n=100;
	do {
		i++;
		rev=0;
		t=i;
		do
		{
			rem=t%10;
			rev=rev*10+rem;
			t=t/10;
		}while(t!=0);
		if(rev==i)
		System.out.println(i+" ");
	}while(i<n);
	
}
public static void main(String arg[])
{
	do_while_Palindrome_Series ss=new do_while_Palindrome_Series();
	ss.input();
}
}
