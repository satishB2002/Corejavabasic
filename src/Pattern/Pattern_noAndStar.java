package Pattern;

public class Pattern_noAndStar {
public static void main(String[] args) {
	int k=1;
	for (int i = 5; i >=1; i--) {
		
		for (int j = 1; j <=i; j++) {
			System.out.print(j+" ");
			
		}
		for (int j = i+1; j <=5; j++) {
			System.out.print("* ");
		}
		for (int j = 5; j >i; j--) {
			System.out.print("* ");
		}
		for (int j = i; j >=1; j--) {
			System.out.print(j+" ");
			
		}
		
		System.out.println();
	}
}
}
//1 2 3 4 5 5 4 3 2 1 
//1 2 3 4 * * 4 3 2 1 
//1 2 3 * * * * 3 2 1 
//1 2 * * * * * * 2 1 
//1 * * * * * * * * 1 
