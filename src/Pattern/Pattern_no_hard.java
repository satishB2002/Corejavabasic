package Pattern;

public class Pattern_no_hard {
public static void main(String[] args) {
	for (int i = 1; i <=5; i++) {
		for (int j = 1; j <=5; j++) {
							
			if (i==j) {
				System.out.print(j);
			}
				else {
					System.out.print(" ");
				}
			
		}
		for (int j = 4; j >=1; j--) {
			
			if (i==j) {
				System.out.print(j);
			}
			else {
				System.out.print(" ");
			}
			
		}
		System.out.println();
	}
}
}
//1       1
//2     2 
// 3   3  
//  4 4   
//   5    
