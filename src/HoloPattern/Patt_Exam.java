package HoloPattern;

public class Patt_Exam {
public static void main(String[] args) {
	int i,j;
	/*for ( i = 1; i <=9; i++) {
		for (j =1; j <=9; j++) {
			if(i==1||i==5||i==9||(j==1&&i>=1&&i<=5)||(j==9&&i>=5&&i<=9))
				System.out.print("*");
			else
				System.out.print(" ");
		}
		for (j =1; j <=9; j++) {
			if(i+j==10||(i==6&&j>=5&&j<=15)||i-j==i)
			System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}*/
	for ( i = 1; i <=5; i++) {
		for ( j = 1; j <=5; j++) {
			if(i==1&&j>=2&&j<=5||(j==1&&i>=2&&i<=4)||i==5&&j>=2&&j<=5||j==6&&i>=2&&i<=4)
			System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
}
