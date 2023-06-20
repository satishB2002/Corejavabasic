package Pattern;
/*
JAVA program for pyramid/triangle number pattern 21
1
2 1 2
3 2 1 2 3
4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
6 5 4 3 2 1 2 3 4 5 6
7 6 5 4 3 2 1 2 3 4 5 6 7
*/
public class Pyramid {
public static void main(String[] args) {
	int n=5;
	for (int i = 1; i <=n; i++) {
		
		for (int j =1; j <=n-i; j++) {
			System.out.print("  ");
		}
		for (int j =1; j>0; j--) {
			
			System.out.print(j+" ");
		}
	
		for (int j =2; j<=i; j++) {
			
			System.out.print(j+" ");
			
		}
		
		
		
			System.out.println();
		}
		
	}
}

