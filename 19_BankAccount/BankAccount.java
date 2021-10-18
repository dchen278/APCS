/**
 * Clyde "Thluffy" Sinclair APCS pd0 HW18 -- building a more meaningful class
 * 2021-10-18 instance variables for storing... account holder's full name
 * account password 4-digit PIN 9-digit account number account balance and
 * methods for... setting each attribute printing out all of an account’s info
 * at once depositing money withdrawing money
 **/

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
        if (newAcctNum >= 100000000 && newAcctNum < 999999998) {
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
        System.out.println(ba.setName("DLR"));
        ba.setName("RLD");
        System.out.println(ba.name);
        System.out.println(ba.toString());

        // test setPasswd()
        System.out.println(ba.setPasswd("abcdefghi"));
        ba.setPasswd("6544635");
        System.out.println(ba.passwd);
        System.out.println(ba.toString());

        // test setPin()
        short newPin = 2344;
        System.out.println(ba.setPin(newPin));
        // can a pin be more than 4 digits? (no)
        // newPin = 543444;
        // ba.setPin(newPin);
        // System.out.println(ba.pin);
        // can a pin be less than 4 digits? (yes)
        newPin = 234;
        ba.setPin(newPin);
        System.out.println(ba.pin);
        System.out.println(ba.toString());

        // test setAcctNum()
        System.out.println(ba.setAcctNum(123456789));
        ba.setAcctNum(3424);
        System.out.println(ba.acctNum);
        // can acctNum be more than 9 digits? (no)
        // ba.setAcctNum(0123456789);
        // System.out.println(ba.acctNum);
        // System.out.println(ba.toString());

        // test setBalance()
        System.out.println(ba.setBalance(333));
        ba.setBalance(234.34);
        System.out.println(ba.balance);
        System.out.println(ba.toString());

        // test deposit()
        ba.deposit(3434);
        System.out.println(ba.balance);
        ba.deposit(342.34);
        System.out.println(ba.balance);
        System.out.println(ba.toString());

        // test withdraw()
        ba.withdraw(12);
        System.out.println(ba.balance);
        ba.withdraw(5000);
        System.out.println(ba.balance);
        // can withdrawl amount be neg? (yes)
        ba.withdraw(-343);
        System.out.println(ba.balance);
        ba.withdraw(43243.43);
        System.out.println(ba.balance);
        System.out.println(ba.toString());

        System.out.println(ba.toString());

        // test authenticate()
        System.out.println(ba.authenticate(123456789, "6544635"));
        System.out.println(ba.authenticate(123456789, "6522335"));


    }// end main()

}// end class BankAccount