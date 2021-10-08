/*
BDY: David Chen, Yat Long Chan, Ben Belotser, Eugene, Bob, TwoFace
David Chen
APCS
HW14: Customize Your Creation
2021-10-07

DISCO
If no argument is provided to the constructor, all instances created will have the same
initialization and greeting.
QCC
None
*/

public class Greet {
    public static void main(String[] args) {
            String greeting;

            BigSib David = new BigSib();
            BigSib Nicole = new BigSib();
            BigSib Michael = new BigSib();
            BigSib Grizz = new BigSib();

            greeting = David.greet("Mr. Mykolyk");
            System.out.println(greeting);

            greeting = Nicole.greet("freshie");
            System.out.println(greeting);

            greeting = Michael.greet("Fanny");
            System.out.println(greeting);

            greeting = Grizz.greet("sophomores");
            System.out.println(greeting);
    }
}