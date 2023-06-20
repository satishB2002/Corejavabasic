package Assignment_27_02;

import java.lang.reflect.Array;
import java.util.Arrays;

//Q12.Wap sort half array in accending and half in decending order
//input= int [] a={9,1,3,5,6,11,22,66,10,19}.
//output={1,3,5,6,9,10,66,22,19,11,10},
public class Q12 {
public static void main(String[] args) {
	 int [] a={9,1,3,5,6,11,22,66,10,19};
	 Arrays.sort(a);
	 for (int i = 0; i < a.length/2+1; i++) {
		System.out.print(a[i]+" ");
	}
	
	 for (int i = a.length-1; i >= a.length/2; i--) {
		 System.out.print(a[i]+" ");
	 }
}
}

