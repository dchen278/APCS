/*
Downtown Leopard Rocks: David Chen, Lea Kwok, Raven Tang
APCS
HW18: CPA-One
2021-10-16

DISCO
UML diagrams are very helpful for understanding and creating methods.
QCC
None

Downtown Leopard Rocks 
*/

public class BankAccount {
	private String holderName;
	private static String password;
	private int pin;
	private int accountNum;
	private double balance;

	public void setHolderName(String name) {
		holderName = name;
	}

	public void setPassword(String pass) {
		password = pass;
	}

	public void setPin(int newPin) {
		pin = newPin;
	}

	public void setAccountNum(int num) {
		accountNum = num;
	}

	public void setBalance(float newBal) {
		balance = newBal;
	}

	public void printInfo(int accNum, String pass) {
		if(accountNum == accNum && password == pass) {
			System.out.println("Your name is " + holderName);
			System.out.println("Your balance is " + balance);
			System.out.println("Your account number is " + accountNum);

		} else {
			System.out.println("Something doesn't match");
		}
	}

	public void deposit(int amount, int accNum) {
		if (accountNum == accNum) {
			balance += amount;
			System.out.println("Successfully deposited. Your balance is $" + balance);
		} else {
			System.out.println("Your account number doesn't match");
		}
	}

	public void withdraw(int amount, int accNum, int inputtedPin) {
		if (accountNum == accNum && inputtedPin == pin ) {
			balance -= amount;
			System.out.println("Successfully withdrawn. Your balance is $" + balance);
		} else {
			System.out.println("Your account number or pin doesn't match");
		}
	}

	public static void main(String[] args) {
		BankAccount bofa = new BankAccount();
		bofa.setHolderName("David");
		System.out.println(bofa.holderName);

		bofa.setPassword("abc123");
		System.out.println("Password is " + password);

		bofa.setPin(1234);
		bofa.setAccountNum(123456789);
		bofa.setBalance(0);

		bofa.deposit(420000, 123456789);
		bofa.printInfo(123456789, "abc123");
		bofa.withdraw(12090, 123456789, 1234);
		bofa.withdraw(12090, 123456789, 12324); //wrong pin
	}
}
