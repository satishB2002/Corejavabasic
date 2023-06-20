package Practice_Most;
/*Q5. WAP to Convert Days into Years, Months and Days.
Output:
Enter the number of days:756
No. of years:2
No. of weeks:3
No. of days:5*/
import java.util.Scanner;

public class Convert_Days_Years {
	Scanner sc= new Scanner(System.in);
public void input() {
	System.out.println("Enter Your Days");
	int days =sc.nextInt();
	int days_in_week=7;
	int year=(days /365);
	int week=(days %365)/days_in_week;
	int ndays=(days %365)%days_in_week;
	System.out.println("No. of years:"+year);
	System.out.println("No. of Weeks:"+week);
	System.out.println("No. of Days:"+ndays);
	
}
public static void main(String[] args) {
	Convert_Days_Years ss=new Convert_Days_Years();
	ss.input();
}
}
