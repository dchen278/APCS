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

            BigSib David = new BigSib("Word up");
            BigSib Nicole = new BigSib("Hey ya");
            BigSib Michael = new BigSib("Sup");
            BigSib Grizz = new BigSib("Salutations");

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