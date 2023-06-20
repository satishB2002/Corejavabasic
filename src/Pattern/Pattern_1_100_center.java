package Pattern;

import String.intern_method;

public class Pattern_1_100_center {
public static void main(String[] args) {
	int	k=36,m=28,l=11,n=44;
	for (int i = 1; i <=10; i++) {
		for (int j = 1; j <=10; j++) {
			if (i==1) {
				System.out.print(j+" ");
			} else if (j==10) {
				System.out.print(l+++" ");
			} else if (i==10) {
				System.out.print(m--+" ");
			} else if (j==1) {
				System.out.print(k--+" ");
			} else if (i==2) {
				System.out.print(k+++" ");
			} else if (j==9) {
				System.out.print(n+++" ");
			} else {

			} {
				System.out.print("  ");	
			
			

			}
		}
		System.out.println();
	}
}
}
