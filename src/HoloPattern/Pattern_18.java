package HoloPattern;

public class Pattern_18 {
	
public static void main(String[] args) {

	int i,j;
	int n=5;
	int m=5;
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print("  ");
		}
		for(j=i;j<=m;j++)
		{
			if(i==1||j==1 ||i==n||j==m||i==j)
			
				System.out.print(" *");
			
				else
					System.out.print("  ");
		}
		
		System.out.println();
		}
	
	}






}

