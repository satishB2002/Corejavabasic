/*Q15. WAP to replace all negative value with its immediate left elements square. Means 
     arr[] = [12, 3, -19, 29, 5, -61, 44, 7, -9] 
     Output array will be [12, 3, 9, 29, 5, 25, 44, 7, 49].*/

package Array_Big_Assignment;

public class Quetion_15 {
	int i,j;
	int a[]= {12, 3, -19, 29, 5, -61, 44, 7, -9};
	protected void square() {
		for ( i = 0; i < a.length; i++) {
					
					if(a[i]<0)
					{
		     
		    	  		a[i]=a[i-1]*a[i-1];
		    	  	}
		  
		}
		for ( i = 0; i < a.length; i++) {
			System.out.println(a[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		Quetion_15 ss=new Quetion_15();
		ss.square();
	}

}
