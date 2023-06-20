package Pattern;
/*1010101
10101 
 101  
  1*/
public class Pattern__Zero {
public static void main(String[] args) {
	for (int i = 1; i <=7; i++) {
		for (int j =1; j <=i; j++) {
			System.out.print("  ");
		}
		for (int j =7; j >=i; j--) {
			
			 if(i%3==0)
			{
			System.out.print(" "+0+" ");
			}
			 else
				 System.out.print(" "+1+" ");
		}
		System.out.println();
		
	}
}
}
