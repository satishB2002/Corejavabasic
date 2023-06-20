package Practice;
//write a java program to segregate all zeros left side and all ones right side
public class Zero_left_one_right {
	
	    public static void main(String arg[])
	    {
	        int a[]={0,1,1,0,1,0,0,5,1,6,7,8};
	        int b[]=new int[a.length];
	        int c=0;
	          
	        int i,l=0,m=a.length-1;
	        for(i=0;i<a.length;i++)
	        {
	            int k=0,j;
	        for(j=i+1;j<a.length;j++)
	            
	        {
	            if(a[i]>a[j])
	            {
	                k=a[i];
	                a[i]=a[j];
	                a[j]=k;
	            }
	        }
	        }
	        for(i=0;i<b.length;i++)
	         {
	             if(a[i]==0)
	              c++;    
	         }
	            for(i=0;i<c;i++)
	         {
	            b[i]=0;
	             
	         }
	            int w=c;
	            for(i=a.length-1;i>=c;i--)
	            {
	               b[i]=a[w];
	               w++;
	            }
	          for(i=0;i<b.length;i++)
	         {
	          System.out.print(b[i]);
	         }
	}
	}

