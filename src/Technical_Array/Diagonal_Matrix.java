package Technical_Array;
//Q9.JAVA program to find the sum of diagonal 
//elements of a matrix

public class Diagonal_Matrix {
	public void name() {
		int sum=0;
		int avg;
		int i,j;
		int a[][]= {{1,2,3},
					{4,5,6},
					{7,8,9}
					};
			i=a.length;
			j=a[0].length;
			
		for (i = 0; i < a.length; i++) {
		for ( j = 0; j < a.length; j++) {
			
			if(i==j)
			{
			sum=sum+a[i][j];
			}
		}	
		}
		System.out.println("Diagonal Matrix Sum="+sum);
		
		
	}
	public static void main(String[] args) {
		Diagonal_Matrix ss=new Diagonal_Matrix();
		ss.name();
	}
}
