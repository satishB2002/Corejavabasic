package Assignment_12_Feb;

public class Q11 {
public static void main(String[] args) {
	for (int i = 1; i <=9; i++) {
		for (int j = 1; j <=9; j++) {
			if (i==5||i-j==4||j+i==14) {
				System.out.print("* ");
			} else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
}
}
