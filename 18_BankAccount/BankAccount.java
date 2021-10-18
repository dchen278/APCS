/*
Downtown Leopard Rocks: David Chen, Lea Kwok, Raven Tang
APCS
HW18: CPA-One
2021-10-16

DISCO
- UML diagrams are very helpful for understanding and creating methods.
- We can print out instance variables of an object. Methods within a class can simply reference instance variables of the same class.

QCC
- We were thinking of how to limit PINs to 4 digits and account numbers to 9 digits. Our initial idea was to check if 999 < pin < 10000, but we realized that this condition doesn’t allow for PINs that start with 0s. Another idea would be to simply check if pin < 10000, but we then realized that using the datatype int for PIN wouldn’t store 0001 as 0001. It would instead be stored as 1. What other methods of checking the 4 digit requirement or other datatypes would help resolve this issue?
- We did develop part of a test for Q3. However, we are uncertain what the exact indicator of failure in this test would be. Would it be a compile time error, a runtime error, a specific printed message, or something else?
- For methods that set values of instance variables (such as setHolderName, setPassword), we found it tedious and slightly inefficient to make a separate name for the parameters. For example, to set holderName’s value, we had to name the parameter “name.” Is there another way to reference instance variables and parameters while still making it clear which is the instance variable and which is the parameter?

Team Downtown Leopard Rocks’s Latest and Greatest Q2 Response: 
A class can still be initialized with `new className()` without a default constructor and that means that Java does provide a default constructor

Team Downtown Leopard Rocks’s Latest and Greatest Q3 Response: 
You can output a string representation of an object by using the `toString()` method. 
Ex. `System.out.println(myObject.toString());`
And then check forr errors and the printed output
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
		if (accountNum == accNum && password == pass) {
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
		if (accountNum == accNum && inputtedPin == pin) {
			if (balance >= amount) {
				balance -= amount;
				System.out.println("Successfully withdrew. Your balance is $" + balance);
			} else {
				System.out.println("Insufficient funds");
			}
		} else {
			System.out.println("Your account number or pin doesn't match");
		}
	}

	public String info(Object obj) {
		return obj
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

		bofa.deposit(282, 123456789);
		bofa.printInfo(123456789, "abc123");
		bofa.withdraw(21, 123456789, 1234);
		bofa.withdraw(23, 123456789, 12324); // wrong pin
		bofa.withdraw(300, 123456789, 1234); // insufficient funds
	}
}
