package Pattern;

public class Star_Nim {
public static void main(String[] args) {
	int i = 1;
	while(i <=4) {
		int j = 1;
		while( j <=2) {
			if (i%2!=0) {
				System.out.print("*");	
			} else if(j%2==0) {
				System.out.print("*");	
			}
			j++;
		}
		i++;
		System.out.println();
	}
}
}
