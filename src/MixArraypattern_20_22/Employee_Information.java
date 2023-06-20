//Q2.Wap to take employe record and show the example of single level inheritence(make class and method as your need)?

package MixArraypattern_20_22;
import java.util.Scanner;
public class Employee_Information {
	public static void main(String arg[])
	{
		Display sb= new Display();
			sb.disp();
			sb.disp1();
			

	}
}
	class Display extends Information
    {
	public void disp1()
	{
		System.out.println(" Empolyee Information");
		System.out.println(" Name     ="+name);
		System.out.println("  ID       "+id);
		System.out.println(" Adddress    ="+addr);
		System.out.println(" Salary     ="+sal);
		System.out.println("  Age  ="+age);
		}
	
	


}


	
	class Information
	
	{
		String name,addr;
		int id ,sal,age;
		Scanner sc=new Scanner(System.in);
		
		public void disp()
		{
		


				System.out.println("Enter Empoloyee name");
				name=sc.next();
				System.out.println("Enter Empoloyee ID");
				id=sc.nextInt();
				System.out.println("Enter Empoloyee Address");
				addr=sc.next();
				System.out.println("Enter Empoloyee salary");
				sal=sc.nextInt();
				System.out.println("Enter Empoloyee age");
				age=sc.nextInt();
				
				
		}
		
		
	}
	
