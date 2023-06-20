package Practice;

import String.intern_method;

public class Pattern_1234 {
	
	public static void main(String[] args) {
		int	m=1;
		for (int i = 1; i <4; i++) {
			for (int j = 0; j <i; j++) {
				System.out.print(i*m+" ");
				m=m+++2;
			}
			System.out.println();
		}
	}

}
