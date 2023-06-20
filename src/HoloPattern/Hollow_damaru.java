package HoloPattern;

import String.intern_method;

public class Hollow_damaru {
	public static void main(String[] args) {
	int i=1;
		do {
			int j = 1;
			do {
				if (i==1||i==9||i==j||i+j==10) {
					System.out.print("* ");
				} else {
                     System.out.print("  ");
				}
				j++;
			}while( j <=9);
			System.out.println();
			 i++;
		}while( i <=9);
	}
}
