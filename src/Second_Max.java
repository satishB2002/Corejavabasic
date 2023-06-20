import java.util.Scanner;

import String.intern_method;

public class Second_Max {
   public static void main(String[] args) {
	   
	int n =456278;
	int r,c=0,i;
	int t=n;
	int max,max1;
	
	while(t!=0) {
		r=t%10;
		c++;
		t=t/10;
		
	}

	 int [] a = new int[c];
	 
	  for(i=0;i<a.length;i++) {
		  r=n%10;
		  a[i]=r;
		  n=n/10;
		  
		  System.out.print(" "+a[i]);
	  }
	  
	  max=a[0];
	  
	  for(i=0;i<a.length;i++) {
		  if(a[i]>max) {
			  max=a[i];
		  }
	  }
	  
	 // System.out.println(max);
	  
	      max1=a[0];
	  for(i=0;i<a.length;i++) {
		  if(a[i]>max1 && a[i]!=max) {
			  max1=a[i];
		  }
	  }
	  
	  System.out.println(max1);
	 
	 
	 
	      
	 
}
}
