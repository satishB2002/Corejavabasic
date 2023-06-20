
package HoloPattern;

public class Ex_1 {public Ex_1() {
	// TODO Auto-generated constructor stub
}public static void main(String[] args) {
	for (int i = 1; i <=9; i++) {
		for (int j = 1; j <=i; j++) {
			System.out.print("*");
		}
		for (int j =9; j >=i; j--) {
			System.out.print(" ");
		}
		for (int j =9; j >=i; j--) {
			System.out.print(" ");
		}
		for (int j = 1; j <=i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	for (int i = 8; i >=1; i--) {
		for (int j = 1; j <=i; j++) {
			System.out.print("*");
		}
		for (int j =9; j >=i; j--) {
			System.out.print(" ");
		}
		for (int j =9; j >=i; j--) {
			System.out.print(" ");
		}
		for (int j = 1; j <=i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
