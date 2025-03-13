package tkm;
import java.util.Scanner;

class Process{
	String accountNumber;
	String accountHolder;
	double balance;
	double amount;
	
	Process(String accountNumber, String accountHolder, double balance,double amount) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.amount = amount;
    }
	
	public void deposit() {
		balance+=amount;
	}
	
	public void withdraw() {
		if(amount>balance) {
			System.out.println("Insufficient Balance ");
			return;
		}
		balance-=amount;
	}
	
	public void displayAccountInfo() {
		System.out.println();
		System.out.println("--Account Details--");
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Holder: "+accountHolder);
		System.out.println("Account Balance: "+balance);
		
	}
}

public class BankAccount {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Account Number: ");
		String AccNO = sc.nextLine();
		System.out.print("Enter the Account Holder Name: ");
		String AccNa = sc.nextLine();
		System.out.print("Enter the Balance Amount: ");
		int AccBa = sc.nextInt();
		
		System.out.println("If you want to Deposit Click 1 OR Withdraw Click 0");
		int ch = sc.nextInt();
		
		System.out.print("Enter the Amount: ");
		int Amt = sc.nextInt();
		Process p1=new Process(AccNO,AccNa,AccBa,Amt);
		
		if(ch==1) {
			p1.deposit();
		}
		else {
			p1.withdraw();
		}
		
		p1.displayAccountInfo();
	}

}
