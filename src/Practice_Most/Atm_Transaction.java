/*Q4.Java Program to Display the ATM Transaction.

Output:
Automated Teller Machine
Choose 1 for Withdraw
Choose 2 for Deposit
Choose 3 for Check Balance
Choose 4 for EXIT
Choose the operation you want to perform:1
Enter money to be withdrawn:2000
Please collect your money
 
Automated Teller Machine
Choose 1 for Withdraw
Choose 2 for Deposit
Choose 3 for Check Balance
Choose 4 for EXIT
Choose the operation you want to perform:3
Balance : 3000
 
Automated Teller Machine
Choose 1 for Withdraw
Choose 2 for Deposit
Choose 3 for Check Balance
Choose 4 for EXIT
Choose the operation you want to perform:4*/

package Practice_Most;

import java.util.Scanner;

public class Atm_Transaction {
	Scanner sc=new Scanner(System.in);
	int amt,total_bal=10000,balance;
public void input() {
		System.out.println("Automated Teller Machine");
		System.out.println("Choose 1 for Withdraw");
		System.out.println("Choose 2 for Deposit");
		System.out.println("Choose 3 for Check Balance");
		System.out.println("Choose 4 for EXIT");
					}
public void Withdraw() {
	System.out.println("Enter money to be withdrawn:");
	amt=sc.nextInt();
	System.out.println("Please collect your money");
						}
public void Deposit() {
	
}
public void Check_Balance() {
	balance=total_bal-amt;
	System.out.println("Balance :"+balance);
}
public void Exit() {
	System.out.println(" !! Thank You Visit Again !!");
}
public static void main(String[] args) {
	
	Atm_Transaction ss=new Atm_Transaction();
	ss.input();
	Scanner sd=new Scanner(System.in);
	int n;
	System.out.println("Choose the operation you want to perform:");
	n=sd.nextInt();
	switch(n)
	{
	case 1:
	ss.Withdraw();
	break;
	case 2:
	ss.Deposit();
	break;
	case 3:
	ss.Check_Balance();
	break;
	case 4:
	ss.Exit();
	break;
	default : 
		System.out.println("Wrong Choice Choose Again !! ");
		
	}
}
}
