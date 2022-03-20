/*
Downtown Leopard Rocks: David Chen, Lea Kwok, Raven Tang
APCS
HW20: External Audit
10-19-2021
DISCO
- Private instance variables cannot be accessed from outside of their class. For example, in Teller, we cannot directly access pin. However, we can still use mutator methods to change the values of and interact with private instance variables.
- Arguments can be expressions. For ex: System.out.println(leopard.setBalance(19*2.0))
QCC
- If the instance variables are private, can toString() still run? (since it needs the vars to print them) We think the answer connects to our DISCO about directly accessing private instance vars.
*/

public class Teller {
    public static void main(String[] args) {
        BankAccount leopard = new BankAccount();

        // test setName
        System.out.println(leopard.setName("Leopards")); // expected: null
        // System.out.println(leopard.name); //expected: Leopards

        // test setPasswd
        System.out.println(leopard.setPasswd("password")); // exppected: null
        System.out.println(leopard.setPasswd("password")); // expected: password, trying to break by setting same
                                                           // password twice

        // test setPin
        System.out.println(leopard.setPin(1234)); // expected: 0
        System.out.println(leopard.setPin(1000)); // expected: 1234
        System.out.println(leopard.setPin(9999)); // expected: Your pin input was invalid, it has been set to its
                                                  // default value. 1000
        System.out.println(leopard.setPin(9)); // expected: Your pin input was invalid, it has been set to its default
                                               // value. 9999
        System.out.println(leopard.setPin(-9999)); // expected: Your pin input was invalid, it has been set to its
                                                   // default value. 9999
        System.out.println(leopard.setPin(1234)); // expected: 9999, reset pin

        // test setAcctNum
        System.out.println(leopard.setAcctNum(123456789)); // expected: 0
        System.out.println(leopard.setAcctNum(100000000)); // expected: 123456789
        System.out.println(leopard.setAcctNum(999999999)); // expected: Your account number input was invalid, it has
                                                           // been set to its default value. 1000000000
        System.out.println(leopard.setAcctNum(9)); // expected: Your account number input was invalid, it has been set
                                                   // to its default value. 999999999
        // System.out.println(leopard.setAcctNum(leopard.pin*100000)); //expected:
        // 999999999
        System.out.println(leopard.setAcctNum(123456789)); // expected: 999999999, resetting acctNum

        // test setBalance
        System.out.println(leopard.setBalance(123456789)); // expected: 0
        System.out.println(leopard.setBalance(-123456789)); // expected: 123456789, testing negative input
        System.out.println(leopard.setBalance(19 * 2.0)); // expected: -123456789, testing operations in argument
        System.out.println(leopard.setBalance(100)); // expected 38.0 (setting the balance for the next method)

        // test withdraw
        System.out.println(leopard.withdraw(-232)); // expected true, testing negative withdrawal
        System.out.println(leopard.withdraw(123)); // expected true

        // test deposit
        leopard.deposit(-233);
        // System.out.println(leopard.balance); //expected: -24
        leopard.deposit(300);
        // System.out.println(leopard.balance); //expected: 276

        // test authenticate
        System.out.println(leopard.authenticate(123456789, "password")); // expected: true
        System.out.println(leopard.authenticate(123456789, "password")); // expected: false, testing wrong acctNum
        System.out.println(leopard.authenticate(123456789, "passwor")); // expected: false, testing wrong passwd
        System.out.println(leopard.authenticate(12345678, "passwor")); // expected: false, testing wrong acctNum and
                                                                       // passwd

        // test toString()
        System.out.println(leopard.toString());
        /*
         * expected: Name: Leopards Password: password PIN: 1234 Account Number:
         * 123456789 Balance: 276.0
         */
    }
}