package Practice;
//Q8.Wap enter a string and print most repeated character in string.
public class Most_Repeted_ {
public void name() {
	int a[]= {2,3,4,5,6,7,7,7,7};
	int i,j;
	int c=0,Count=0,t=0;
	for ( i = 0; i < a.length;i ++) {
		for ( j= i+1; j< a.length; j++) {
			if(a[i]==a[j])
			{
				c++;
			}
		}
		if(Count>c)
		{
			c=Count;
		    t=a[i];
		
		}
		
	}
	System.out.println(t);
}
public static void main(String[] args) {
	Most_Repeted_  ss=new Most_Repeted_ ();
	ss.name();
}
}
