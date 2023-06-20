package Technical_Array;

public class Infinity {
public static void main(String[] args) {
	
	for (int i = 1; i <=5; i++) {
		for (int j =1; j <=i; j++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.print("*");
		}
		
			for (int j =5; j >=i;j--) {
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO: handle exception
				}
				System.out.print(" ");
			}
			for (int j =5; j >=i; j--) {
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO: handle exception
				}
				System.out.print(" ");
			}
			for (int j =1; j <=i; j++) {
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO: handle exception
				}
				System.out.print("*");
			}
			
			
			
			System.out.println();
			
		
	}
	for (int i = 5; i >=1; i--) {
		for (int j =1; j <=i; j++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.print("*");
			
		}
		for (int j =5; j >=i; j--) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.print(" ");
			
		}
		for (int j =5; j >=i; j--) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.print(" ");
			
		}
		for (int j =1; j <=i; j++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.print("*");
			
		}
		System.out.println();
	}

}
}
