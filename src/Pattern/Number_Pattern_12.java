package Pattern;
/*
JAVA program for triangle number pattern 12
5
4 5
3 4 5
2 3 4 5
1 2 3 4 5
*/
public class Number_Pattern_12 {
public static void main(String[] args) {
	
	for (int i = 1; i <=5; i++) {
		
		for (int j =1; j<=i; j++) {
			
			System.out.print(i+" ");
			
		}
		
		System.out.println();
	}
}
}
