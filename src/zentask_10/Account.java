package zentask_10;
import java.util.Scanner;

public class Account {

	private double balance;

	Account(){
		balance=0.0;
	}

	Account(double bal){
		balance=bal;
	}
	
	public double getbalance() {
		return balance;
	}
	
	public void setbalance(double bal) {
		balance=bal;
	}
	
	public void withdraw(double amount) {
	
		if(amount>0 && amount<=balance)
		{
			balance=balance-amount;
			System.out.println("The withdrawn amount is:" + amount);
		}
		
		else
		{
			System.out.println("You dont have enough amount");
		}
		
	}

	public void depositBalance(double amount) {
	
		if(amount>0)
		{
			balance=balance+amount;
			System.out.println("The deposited amount is:" + amount);
		}
		
		else 
		{
			System.out.println("Invalid Deposit");	
		}
		
	}
	public double balance1() {
		return balance;
	}
	public static void main(String[] args) {

		Account a=new Account();

		// create a circle object using the constructor with no arguments
		System.out.println("Initial Balance is :" + a.balance1());

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount to deposit :");
		double inr=sc.nextDouble();
		a.depositBalance(inr);
		System.out.println("Your new balance after deposit is : "+ a.balance1());

		System.out.println("Enter the amount to withdraw :");
		double wd=sc.nextDouble();
		a.withdraw(wd);
		System.out.println("Your balance after withdrawn is : " + a.balance1());

		// create a circle object using the constructor with one arguments\
		System.out.println("enter your new balance:");
		double inr2=sc.nextDouble();
		Account a2=new Account(inr2);
		System.out.println("Your Balance is : " +a2.balance1());

		System.out.println("Enter the amount to Deposit:");
		double depo=sc.nextDouble();
		a2.depositBalance(depo);
		System.out.println("Your new balance after Deposit is : "+ a2.balance1());

		System.out.println("Enter the amount to be withdrawn :");
		double draw1=sc.nextDouble();
		a2.withdraw(draw1);
		System.out.println("Your balance after withdraw is: " + a2.balance1());

	}

}

/*
 * Output:
Initial Balance is :0.0
Enter the amount to deposit :
90
The deposited amount is:90.0
Your new balance after deposit is : 90.0
Enter the amount to withdraw :
9
The withdrawn amount is:9.0
Your balance after withdrawn is : 81.0
enter your balance:
90
Your Balance is : 90.0
Enter the amount to Deposit:
90
The deposited amount is:90.0
Your new balance after Deposit is : 180.0
Enter the amount to be withdrawn :
90
The withdrawn amount is:90.0
Your balance after withdraw is: 90.0


 */


