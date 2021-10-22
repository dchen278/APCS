/**
 * Kosta Dubovskiy APCS pd7 HW19  -- More banking
 **/

public class BankAccount {

    // instance variables
    private String name;
    private String passwd;
    private int pin;
    private int acctNum;
    private double balance;
    // ---------------------------------------------

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

    public int setPin(int newPin) {
        int oldPin = pin;
        if (newPin >= 1000 && newPin < 9999) {
            pin = newPin;
        } else {
            pin = 9999;
            System.out.println("Your pin input was invalid, it has been set to its default value.");
        }
        return oldPin;
    }

    public int setAcctNum(int newAcctNum) {
        int oldAcctNum = acctNum;
        if (newAcctNum >= 100000000 && newAcctNum < 999999999) {
            acctNum = newAcctNum;
        } else {
            acctNum = 999999999;
            System.out.println("Your account number input was invalid, it has been set to its default value.");
        }
        return oldAcctNum;
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
        if (balance < withdrawAmount) {
            System.out.println("Your input was invalid for the present account balance.");
            return false;
        } else {
            balance = balance - withdrawAmount;
            return true;
        }
    }

    public boolean authenticate(int givenAcctNum, String givenPasswd) {
        if (acctNum == givenAcctNum && passwd == givenPasswd) {
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
        // INSERT YOUR METHOD CALLS FOR TESTING HERE
        BankAccount ba = new BankAccount();
        ba.setName("Kosta");
        ba.setAcctNum(777555111);
        ba.setBalance(9);
        ba.setPasswd("tacky");
        ba.setPin(8245);
        ba.toString();
        ba.deposit(5);
        ba.withdraw(20);
        ba.withdraw(5);
        ba.toString();
        ba.authenticate(777555, "tacky");
    }// end main()

}// end class BankAccount
