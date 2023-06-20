package MixPracticeSimpleMethodCnstructorInheritance;

public class Multiplication 
	{
		 Multiplication()
		 {
			 int i,j,k;
			 int [][]a={
					 {1,2,3},
					 {4,5,6},
					 {7,8,9}
					 };
			 int [][]b={
					 {1,1,1},
					 {4,5,6},
					 {7,8,9}
					 };
			
			 int c[][]= new int[3][3];
			 for(i=0;i<3;i++)
			 {
				 for(j=0;j<3;j++)
				 {
					 c[i][j]=0;
					 for(k=0;k<3;k++)
					 {
						 c[i][j]+=a[i][k]*b[k][j];
					 }

					 System.out.print(c[i][j]+" ");
				 }
				 System.out.println();
			 }
			 }
		 public static void main(String arg[])
		 {
			 Multiplication sc=new Multiplication ();
		 }
	}

