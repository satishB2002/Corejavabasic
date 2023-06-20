//WAP to extract last two digit of a Given Year.
package Practice_Most;

public class Extract_Year_Last_2 {
public void input() {
	int year=2023;
	System.out.println("Your Year is ="+year);
	
	System.out.println(year%100);
	
}
public static void main(String[] args) {
	Extract_Year_Last_2 ss=new Extract_Year_Last_2();
	ss.input();
}
}
