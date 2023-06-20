package Pattern;

import String.intern_method;

public class Pattern_Round {
public static void main(String[] args) {
	int	k=6,l=13,m=16;
	for (int i = 1; i <=5; i++) {
		
		for (int j = 1; j <=5; j++) {
			
			if (i==1) {
				System.out.print(j+"  ");
			} else if (j==5) {
		System.out.print(k++);
			} else if (i==5) {
				System.out.print(l--+" ");
			} else if (j==1) {
				System.out.print(m--+" ");
			
			}else{
				System.out.print("   ");
			
			}
		}
		
		System.out.println();
	}
}
}
//1  2  3  4  5  
//16          6
//15          7
//14          8
//13 12 11 10 9

