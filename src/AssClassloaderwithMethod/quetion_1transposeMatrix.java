package AssClassloaderwithMethod;
/*Q1.Wap initialise a 3*3 matrix and find the transpose.*/
public class quetion_1transposeMatrix {
	int i,j;
	int [][]a= {
			{1,3,4},
			{2,4,3},
			{3,4,5}};
	quetion_1transposeMatrix()
	{
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String arg[])
	{
		quetion_1transposeMatrix sc=new quetion_1transposeMatrix();
	}
}
