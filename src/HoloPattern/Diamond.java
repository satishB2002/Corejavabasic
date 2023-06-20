package HoloPattern;

public class Diamond {
public static void main(String[] args) {

	for (int i =1; i <=9; i++) {
		for (int j =i; j <=9; j++) {
			System.out.print("*");
			
		}
		for (int j =1; j <=i; j++) {
			if((i==1||j==1||i==j )&& i%2!=0)
			{
			System.out.print(" *");
			}
			else
				System.out.print("  ");
			
		}
		for (int j =i; j <=9; j++) {
			System.out.print("*");
			
		}
		System.out.println();
		
		
}
	for (int i =8; i >=1; i--) {
		for (int j =i; j <=9; j++) {
			System.out.print("*");
			
		}
		for (int j =1; j <=i; j++) {
			if((i==1||j==1||i==j )&& i%2!=0)
			{
				System.out.print(" *");
			}
			else
				System.out.print("  ");
			
		}
		for (int j =i; j <=9; j++) {
			System.out.print("*");
			
		}
		System.out.println();
		
		
	}
}
}
