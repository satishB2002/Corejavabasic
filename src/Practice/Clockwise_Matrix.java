package Practice;

public class Clockwise_Matrix {
public static void main(String[] args) {
	System.out.println("Orignal Matrix");
	int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("Clock wise Rotation Matrix");
	for (int i = 0; i < a.length; i++) {
		for (int j = a.length-1; j >=0; j--) {
			System.out.print(a[j][i]+" ");
		}
		System.out.println();
	}
	System.out.println("Anticlock wise Rotation Matrix");
	for (int i = a.length-1; i >=0; i--) {
		for (int j = 0; j <a.length; j++) {
			System.out.print(a[j][i]+" ");
		}
		System.out.println();
	}
	
	}
}