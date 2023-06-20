package Pattern;
/*
JAVA program for triangle number pattern 18/0,1
1
3   2
6   5   4
10  9   8  7
15  14 13  12  11
*/
public class Number_Pattern_18_0 {
public static void main(String[] args) {
	int k=15;
	int j=21;
	for (int i = 1; i <=5; i++) {
		k++;
		k++;
		k=j;
		k--;
		k--;
		j=k;
		for ( j = 1; j <=i; j++) {
			
			
			System.out.print(" "+" "+k+" ");
			
			
		}
		System.out.println();
	}
}
}
