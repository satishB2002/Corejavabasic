package Pattern;
/*
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
*/
public class Pattern_20 {
public static void main(String[] args) {
	int k=1;
	for (int i =1; i <=5; i++) {
		k++;
		for (int j =1; j <=i; j++) {
			k++;
			System.out.print(k+" ");
			k++;
			k--;
	
			
		}
		System.out.println();
	}
}
}
