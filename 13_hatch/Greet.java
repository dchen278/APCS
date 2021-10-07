/*
BDY: David Chen, Yat Long Chan, Ben Belotser, Eugene, Bob, TwoFace
David Chen
APCS
HW13: Where do BigSibs Come From?
2021-10-06

DISCO
Constructors are used to initialize objects and set initial values for
object attributes. It should be the first method in the class. This \
constructor is called when the Class is first created.
QCC
None
*/

public class Greet {
    public static void main(String[] args) {
            String greeting;

            BigSib David = new BigSib();
            //David.setHelloMsg("How are you doing");

            greeting = David.greet("Mr. Mykolyk");
            System.out.println(greeting);

            BigSib Nicole = new BigSib();
            Nicole.setHelloMsg("It's nice to meet you");

            greeting = Nicole.greet("freshie");
            System.out.println(greeting);

            BigSib Michael = new BigSib();
            Michael.setHelloMsg("Morning");

            greeting = Michael.greet("Fanny");
            System.out.println(greeting);

    }
}