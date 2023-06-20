package Technical_Array;
//Q8.JAVA program to find the average of all the elements 
//of a matrix

public class MatriX_Average {
	public void name() {
		int sum=0;
		int avg;
		int i,j;
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
			i=a.length;
			j=a[0].length;
			int size=i*j;
		for (i = 0; i < a.length; i++) {
		for ( j = 0; j < a.length; j++) {
			System.out.println(a[i][j]);
			sum=sum+a[i][j];
		}	
		}
		
		avg=sum/size;
		System.out.println("Average Of Matrix="+avg);
	}
	public static void main(String[] args) {
		MatriX_Average ss=new MatriX_Average();
		ss.name();
		
	}

}
