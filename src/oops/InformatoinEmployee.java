package oops;
/*6-Write a program that would print the information (name, year of joining, salary, address) 
of three employees by creating a class named 'Employee'. 
 The output should be as follows,
       Name        Year of joining        Address
      abcd            1994               aaaaaaa
       xyz               2000             aaaaaa   
       pqr                1999            aaaaaaa   */

public class InformatoinEmployee {
	public void input()
	{
		System.out.println("Name \t\t Yaer of joining\t\t Address\t Salary");
		System.out.println("raj \t\t\t 2022\t\t akole\t\t\t 15000");
		System.out.println("vicky \t\t\t 2018\t\t pune\t\t\t 20000");
		System.out.println("hardik \t\t \t2022\t\t mumbai\t\t\t30000");
		
		
	}
	public static void main(String arg[])
	{
		InformatoinEmployee sc=new InformatoinEmployee();
		sc.input();
	}

}
