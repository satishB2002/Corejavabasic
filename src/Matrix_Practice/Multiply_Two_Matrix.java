package Matrix_Practice;
//Write a Java Program to multiply two matrices.
public class Multiply_Two_Matrix {
public void name() {
	int a[][]= {    {1,1,1},
			        {2,2,2},
		         	{3,3,3}
	            };
	int b[][]= {    {1,2,3},
			        {1,2,3},
			        {1,2,3}
			        
	};
	int size=a.length+b.length;
	int c[][]=new int[3][3];
	
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < b.length; j++) {
					for (int k = 0; k < b.length;k++) {
						c[i][j]=c[i][j]+a[i][k]*b[k][j];
					}
				}
			}
			System.out.println("Your Multiplication");
			for (int i = 0; i < c.length; i++) {
				for (int j = 0; j < c.length; j++) {
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
	}

public static void main(String[] args) {
	Multiply_Two_Matrix ss=new Multiply_Two_Matrix();
	ss.name();
}
}
