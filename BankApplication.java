/*
	Bank Abstract Class
	Problem: Create an abstract class Bank with the following methods:
	deposit(double amount) — allows depositing an amount.
	withdraw(double amount) — allows withdrawing an amount.
	getBalance() — returns the current balance.
	Then, create two subclasses:
	SavingsBank — charges a fixed fee of $2 per transaction.
	CurrentBank — charges a fixed fee of $5 per transaction.
	Write a program that deposits and withdraws money from both types of banks and displays the balance after each transaction.
	Explanation:
	The abstract class Bank defines the common structure for the deposit, withdraw, and balance methods.
	Each subclass applies a different transaction fee.
	Logical operation: Use method overriding to show different transaction fees for each type of bank.
*/

import java.util.*;
abstract class Bank
{
	protected double balance;
	private String tranHistory;
	
	public Bank(){
		this.balance=0;
		this.tranHistory="";
	}
	public abstract void deposit(double amount);
	
	public abstract void withdraw(double amount);
	
	public double getBalance(){
		return balance;
	}
	
	protected void addTransaction(String transaction)
	{
		this.tranHistory=tranHistory+transaction+"\n";
	}
	public void PrintTransaction(){
		System.out.println("========= Tarnsaction history is  =========");
		if(tranHistory.isEmpty()){
			System.out.println("No transaction has been done");
		}
		else{
			System.out.println(tranHistory);
		}
	}
}
class SavingsBank extends Bank
{
	private final double tracsactionFees=2.0;
	public void deposit(double amount){
		if(amount > 0)
		{
			balance +=amount;
			balance-=tracsactionFees;
			addTransaction("Deposite :"+amount+", Fees -"+tracsactionFees);
			System.out.println("Deposited: $" + amount + ". Fee: $" + tracsactionFees + ". New balance: $" + balance);
		}
		else{
			System.out.println("Invalid deposit amount.");
		}
	}
	public void withdraw(double amount){
		if(amount >0 && balance >= amount+tracsactionFees)
		{
			balance=balance-amount;
			balance=balance-tracsactionFees;
			addTransaction("Withdraw :"+amount+", Fees -"+tracsactionFees);
			System.out.println("withdrawing: $" + amount + ". Fee: $" + tracsactionFees + ". New balance: $" + balance);
		}
		else{
			System.out.println("Not sufficient Fund");
		}
	}
}

class CurrentBank extends Bank
{
	private final double tracsactionFees=5.0;
	public void deposit(double amount){
		if(amount > 0)
		{
			balance +=amount;
			balance-=tracsactionFees;
			addTransaction("Deposite :"+amount+", Fees -"+tracsactionFees);
			System.out.println("Deposited: $" + amount + ". Fee: $" + tracsactionFees + ". New balance: $" + balance);
		}
		else{
			System.out.println("Invalid deposit amount.");
		}
	}
	public void withdraw(double amount){
		if(amount >0 && balance >= amount+tracsactionFees)
		{
			balance=balance-amount;
			balance=balance-tracsactionFees;
			addTransaction("Withdraw :"+amount+", Fees -"+tracsactionFees);
			System.out.println("withdrawing: $" + amount + ". Fee: $" + tracsactionFees + ". New balance: $" + balance);
		}
		else{
			System.out.println("Not sufficient Fund");
		}
	}
	
}
public class BankApplication
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		SavingsBank sv=new SavingsBank();
		
		
		System.out.println("Enter deposite amount");
		int dm=s.nextInt();
		
		System.out.println("Enter Withdrawl amount");
		int wd=s.nextInt();
		
		System.out.println("--------- Saving Bank Transaction ------------");
		sv.deposit(dm);
		sv.withdraw(wd);
		System.out.println("Saving account balance: "+sv.getBalance());
		
		sv.PrintTransaction();
		
		CurrentBank cb=new CurrentBank();
		
		System.out.println("Enter deposite amount");
		int ddm=s.nextInt();
		
		System.out.println("Enter Withdrawl amount");
		int wwd=s.nextInt();
		System.out.println("--------- Current Bank Transaction ------------");
		cb.deposit(ddm);
		cb.withdraw(wwd);
		
		System.out.println("Current account balance: "+cb.getBalance());
		
		cb.PrintTransaction();
	}
}