package throw_and_throws;
import java.util.*;
public class Merital_Status {
	Scanner sc=new Scanner(System.in);
	public void merital() {
		int age;
		String maritalstatus,M="m";
		System.out.println("Enter Marital status");
		maritalstatus=sc.nextLine();
		System.out.println("Enter Age");
		age=sc.nextInt();
		
		if(maritalstatus==M && age<23 )
		{
			System.out.println("Eligible for voat");
		}
		else
		{
		throw new MeritalGenrator("Not Eligible for voat");	
		}
		
	}
	public static void main(String[] args) {
		Merital_Status ss=new Merital_Status();
		try {
			ss.merital();
		} catch (MeritalGenrator  e) {
			System.out.println(e);
			
		}
	}
}
