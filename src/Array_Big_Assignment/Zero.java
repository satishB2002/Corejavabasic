package Array_Big_Assignment;

public class Zero {
public static void main(String[] args) {
	int i,j,t=0;
	int a[]= {0,1,5,3,7,8,0,1,0,1,0,1};
	for (i = 0; i < a.length; i++) {
		for ( j = i+1; j< a.length; j++) {
			if(a[i]>a[j])
			{
				t=a[i];
				a[i]=a[j];
				a[j]=t;
				
			}
		}
	}
	int c=0;
    for(i=0;i<a.length;i++)
    {
        if(a[i]==0)
         c++;    
    }
       for(i=0;i<c;i++)
    {
       a[i]=0;
        
    }
       int  f=0;
       for(i=0;i<a.length;i++)
       {
    	   if(a[i]!=0 || a[i]!=1)
    		   f++;
    		   
       }
       for(i=c;i<(c+f);i++)
       {
    	   a[i]=a[i];
       }
       int g=0;
       for(i=c;i<a.length;i++)
       {
    	   if(a[i]==1)
    		   g++;
    		   
       }
     
       
       for(i=a.length-1;i>(g+f);i--)
       {
          a[i]=1;
           
       }
       
      
     for(i=0;i<a.length;i++)
    {
     System.out.print(a[i]);
    }
}
}

 
