package Practice;
//write a java program to segregate all zeros left side and all ones right side
public class Qu1 {
	int i,j,t,c;
	int a[]= {5,1,2,36,9,0,1,4,7,0,8};
	int b[]=new int[a.length];
	public void input() {
		t=0;
		c=0;
		for ( i = 0; i < a.length; i++) {
			for ( j = i+1; j < a.length; j++) {
				if(a[i]>b[i])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
				
			}
			for ( i = 0; i < b.length; i++) {
				if(a[i]==0)
				c++;
				
			}
			for ( i = 0; i < c; i++) {
				b[i]=0;
			}
			int k=c;
			for(i=a.length-1;i>=c;i--)
            {
               b[i]=a[k];
               k++;
            }
			for(i=0;i<b.length;i++)
	         {
	          System.out.print(b[i]);
	         }
			
		}
		
	}
public static void main(String[] args) {
	Qu1 ss=new Qu1();
	ss.input();
}
}
