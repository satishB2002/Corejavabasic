package Pattern;
/*
JAVA program for Pascal's triangle/number pattern 20
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
*/
public class Pascal_triangle {
public static void main(String[] args) {
	int m=1;
	for (int i =1; i <=5; i++) {
		
		for (int j =1; j <=i; j++) {
			if(i==0||j==2)
			{
				m++;
			}
			System.out.print(m);
			if(i==4||j==2)
			{
				m++;
			}
			
			
		}
		System.out.println();
	}
}
}
