package Practice;
//Write a Java program to check if an array of integers without 0 and -1
public class Searchperticulartwo {
	
	static 
	{
	    int a[]= {1,2,3,4,1,2};
	    int i,k=0,c=0;
	    for(i=0;i<a.length;i++)
	    {
	    	if(a[i]==0)
	    	{
	    		k=1;
	    	}
	    	if(a[i]==-1)
	    	{
	    		c=1;
	    	}
	    }
	    if(k==1 && c==1)
	    {
	      System.out.println("0 and -1 found");	
	    }
	    else if(k!=1 && c==1)
	    {
	    	System.out.println("0 not found and -1 found ");
	    }
	    else if(k==1 && c!=1)
	    {
	    	System.out.println("0 found and -1 not found ");
	    }
	    else if(k!=1 && c!=1)
	    {
	    	System.out.println("0 and  -1 not found ");
	    }
	    
	}
	
	public static void main(String[] args) {
		Searchperticulartwo ss=new Searchperticulartwo();
	}

}
