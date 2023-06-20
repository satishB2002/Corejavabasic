/*Q2.

Java Program to Print Statement without Semicolon.*/
package Practice;


public class PrintstaementWithoutSemicolon {
	public void name() {
		for (int i = 0; i < 1;System.out.println("Print Semicolon  without Semicolon") ) {
			i++;
		}
		
	for (int i = 0;i<1 ; System.out.println(";")) {
		
		i++;
	}
	
	//System.out.println();
	}
	
	
	public static void main(String[] args) {
		PrintstaementWithoutSemicolon ss=new PrintstaementWithoutSemicolon();
		ss.name();
	}
}
