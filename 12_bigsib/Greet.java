/*
BDY: David Chen, Yat Long Chan, Ben Belotser, Eugene, Bob, TwoFace
David Chen
APCS
HW12: On Elder Individuality and the Elimination of Radio Fuzz
2021-10-05

DISCO
Instance variables can only be used in non static methods
QCC
None
*/

public class Greet {
	public static void main(String[] args) {
		String greeting;
		
		BigSib David = new BigSib();
		David.setHelloMsg("How are you doing");

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
