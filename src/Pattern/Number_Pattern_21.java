package Pattern;
/*
JAVA program for triangle number pattern 14
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5
*/
public class Number_Pattern_21 {
public static void main(String[] args) {
	for (int i = 1; i <=5; i++) {
		for (int j =5; j >=i; j--) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
}
}
