package Assignment_12_Feb;

public class Q10 {
public static void main(String[] args) {
	for (int i = 1; i <=9; i++) {
		for (int j = 1; j <=9; j++) {
			if (i+j==6||j-i==4||i==5) {
				System.out.print("* ");
			} else {
             System.out.print("  ");
			}
		}
		System.out.println();
	}
}
}
