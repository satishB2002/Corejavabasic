package Practice_Most;
//Write a java program to rotate matrix 90 degree  anti clockwise.
public class Rotate_90_Degree_Clockwise {
public void name() {
	int a[][]= {{1,2,3},
				{4,5,6}	,
				{7,8,9}
				};
	System.out.println("Your Orignal Matrix");
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[0].length; j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	
	System.out.println("Your 90 degree clockwise");
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[0].length; j++) {
			System.out.print(a[j][i]+" ");
		}
		System.out.println();
	}
	System.out.println("Your 90 degree  anti clockwise");
	for (int i = a.length-1; i >=0; i--) {
		for (int j = 0; j < a[0].length; j++) {
			System.out.print(a[j][i]+" ");
		}
		System.out.println();
	}
	
}
public static void main(String[] args) {
	Rotate_90_Degree_Clockwise ss=new Rotate_90_Degree_Clockwise();
	ss.name();
}
}
