/*
Downtown Leopard Rocks: David Chen, Lea Kwok, Raven Tang
APCS
HW19: Mo Money Mo Problems ...MORE AWESOME
10-18-2021

DISCO
- We can overwrite the built-in methods of a class. Ex. We can override the toString() method with our own.
- We learned that we can also withdraw negative amounts.
- It is helpful to add comments with expected values forr test cases
- It is also helpful to have a separate line for each test case for each method.

QCC
- Does Java allow for a way to check if an account number is already associated with another instance of the class?
- 
*/

public class BankAccount {

    // instance variables
    private String name;
    private String passwd;
    private short pin;
    private int acctNum;
    private double balance;
    // ---------------------------------------------

    public BankAccount(int accountNum, short pin) {
        // initialize instance variables
        setAcctNum(accountNum);
        setPin(pin);
    }

    // mutators
    public String setName(String newName) {
        String oldName = name;
        name = newName;
        return oldName;
    }

    public String setPasswd(String newPasswd) {
        String oldPasswd = passwd;
        passwd = newPasswd;
        return oldPasswd;
    }

    public short setPin(short newPin) {
        if (newPin >= 1000 && newPin < 9999) {
            short oldPin = pin;
            pin = newPin;
            return oldPin;
        } else {
            // set pin to 9999
            pin = 9999;
            System.out.println("Invalid PIN. PIN set to 9999.");
            return pin;
        }
    }

    public int setAcctNum(int newAcctNum) {
        if (newAcctNum >= 100000000 && newAcctNum <= 999999998) {
            int oldAcctNum = acctNum;
            acctNum = newAcctNum;
            return oldAcctNum;
        } else {
            // set acctNum to 999999999
            acctNum = 999999999;
            System.out.println("Invalid account number. Account number set to 999999999.");
            return acctNum;
        }
    }

    public double setBalance(double newBalance) {
        double oldBalance = balance;
        balance = newBalance;
        return oldBalance;
    }
    // ---------------------------------------------

    public void deposit(double depositAmount) {
        balance = balance + depositAmount;
    }

    public boolean withdraw(double withdrawAmount) {
        if (withdrawAmount <= balance) {
            balance = balance - withdrawAmount;
            return true;
        } else {
            System.out.println("Insufficient funds.");
            return false;
        }
    }

    public boolean authenticate(int accountNum, String password) {
        if (accountNum == acctNum && password == passwd) {
            return true;
        } else {
            return false;
        }
    }

    // overwritten toString()
    public String toString() {
        String retStr = "\nAccount info:\n=======================";
        retStr = retStr + "\nName: " + name;
        retStr = retStr + "\nPassword: " + passwd;
        retStr = retStr + "\nPIN: " + pin;
        retStr = retStr + "\nAccount Number: " + acctNum;
        retStr = retStr + "\nBalance: " + balance;
        retStr = retStr + "\n=======================";
        return retStr;
    }

    // main method for testing
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();

        // test setName()
        System.out.println(ba.setName("DLR")); // expected: null
        ba.setName("RLD");
        System.out.println(ba.name); // expected: RLD
        System.out.println(ba.toString());

        // test setPasswd()
        System.out.println(ba.setPasswd("abcdefghi")); // expected: null
        ba.setPasswd("6544635");
        System.out.println(ba.passwd); // expected: 6544635
        System.out.println(ba.toString());

        // test setPin()
        short newPin = 2344;
        System.out.println(ba.setPin(newPin)); // expected: 0
        newPin = 234;
        ba.setPin(newPin); // expected: "Pin number must be 4 digits and start with 1"
        System.out.println(ba.pin); // expected: 9999
        System.out.println(ba.toString());

        // test setAcctNum()
        System.out.println(ba.setAcctNum(123456789)); // expected: 0
        ba.setAcctNum(3424); // expected: "Account number must be 9 digits and start with 1"
        System.out.println(ba.acctNum); // expected: 999999999

        // test setBalance()
        System.out.println(ba.setBalance(333)); // expected: 0
        ba.setBalance(234.34);
        System.out.println(ba.balance); // expected: 234.34
        System.out.println(ba.toString());

        // test deposit()
        ba.deposit(3434);
        System.out.println(ba.balance); // expected: 3668.34
        ba.deposit(342.34);
        System.out.println(ba.balance); // expected: 4010.68
        System.out.println(ba.toString());

        // test withdraw()
        ba.withdraw(12);
        System.out.println(ba.balance); // expected: 3998.68
        ba.withdraw(-343);
        System.out.println(ba.balance); // expected: 4341.68
        ba.withdraw(43243.43); // expected: Insufficient funds.
        System.out.println(ba.balance); // expected: 4341.68
        System.out.println(ba.toString());

        /*
         * expected: Name: RLD Password: 6544635 PIN: 9999 Account Number: 999999999
         * Balance: 4341.68
         */
        System.out.println(ba.toString());

    }// end main()
}// end class BankAccount