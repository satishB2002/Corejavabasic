package Pattern;
/*JAVA program for pyramid/triangle number pattern 22
1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
1 2 3 4 5 6 5 4 3 2 1
1 2 3 4 5 6 7 6 5 4 3 2 1
*/
public class Num_Payte {
public static void main(String[] args) {
	int i,j,n;
	n=7;
	for(i=1;i<=7;i++)
	{

   		for(j=1;j<=i;j++)
		{
				System.out.print(j+" ");
	} 			
   		for(j=i-1;j>=1;j--)
		{
				System.out.print(j+" ");
	} 			

		System.out.println();
	}
}
}
