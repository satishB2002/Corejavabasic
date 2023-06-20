package Mixpracticequestion21jan.txt;

import java.util.Iterator;

/*Q6.Write a java program to separate zeros from non-zeros in the given array. You have to move zeros either to end of the array or bring them to beginning of the array. For example, if {14, 0, 5, 2, 0, 3, 0} is the given array, 
then moving zeros to end of the array will result {14, 5, 2, 3, 0, 0, 0} and bringing zeros
 to front will result {0, 0, 0, 14, 5, 2, 3}.*/
public class ZeroMovesEnd {
public void name() {
	int i,j,t;
	int a[]= {0, 0, 0, 14, 5, 2, 3};
	for ( i = 0; i< a.length; i++) {
		for (int k = i+1; k < a.length; k++) {
			if(a[i]<a[k])
			{
				t=a[i];
				a[i]=a[k];
				a[k]=t;
				
				
				
			}
		}
		}
		for ( i = 0; i < a.length; i++) {
			
			
			System.out.print(a[i]+" ");
		}

	}
	

public static void main(String[] args) {
	ZeroMovesEnd  ss=new ZeroMovesEnd ();
	ss.name();
}
}
