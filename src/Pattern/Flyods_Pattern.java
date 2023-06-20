package Pattern;
/*
JAVA program for Reverse of Floyd's triangle/number pattern 25
10  9  8  7
6   5  4
3   2  
1
*/
public class Flyods_Pattern {
public static void main(String[] args) {
	int k=10;
	for (int i =1; i <=5; i++) {
		
		for (int j =4; j >=i; j--) {
			System.out.print(k+" ");
			k--;
		}
		System.out.println();
	}
}
}
