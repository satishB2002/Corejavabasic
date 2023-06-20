package HoloPattern;

public class Quetion_19 {
public static void main(String[] args) {
	int i,j;
	for(i=1;i<=9;i++)
	{
		for(j=i;j<=9;j++)
		{
			System.out.print(" ");
		}
		for(j=1;j<=i;j++)
		{
			if((i==1||j==1||i==j||i==9)  && i%2!=0)
			
				System.out.print(" *");
			
			else
			
				System.out.print("  ");
			
		}
		System.out.println();
	}
}
}
