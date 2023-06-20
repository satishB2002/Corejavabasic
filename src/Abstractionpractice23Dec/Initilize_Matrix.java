package Abstractionpractice23Dec;
abstract class PQR
{
	public abstract void MAtrix();
}
public class Initilize_Matrix extends PQR{

	int i,j;
	int [][]a= {{1,2,3},{4,5,6},{7,8,9}};
	public void MAtrix() {
		System.out.println("Your Matrix");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
public static void main(String arg[])
		{
	Initilize_Matrix ss=new Initilize_Matrix();
	ss.MAtrix();
		}
	

}
