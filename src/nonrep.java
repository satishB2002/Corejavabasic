import String.intern_method;

public class nonrep {
	public static void main(String[] args) {
		int a[]= {-1,2,-1,3,2};
		int n=a.length+1,c=1;
		int i;
		for( i=0;i<a.length;i++)
		{
			c=0;
			for(int j=0;j<a.length;j++)
			{
			if(a[i]==a[j])
			{
				
		c++;
			}
			
			}
			if(c==1)
			{
				System.out.println(a[i]);
				break;
		
	
			}}
		
}}
	

	



