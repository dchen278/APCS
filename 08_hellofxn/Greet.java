/*
David Chen
APCS
HW08 -- Refactor Freshie Zero - Changed method for string concatenation and invoked it in main method
2021-9-31

DISCOVERIES
A method signature consists the method name and the method parameters in order

UNRESOLVED QUESTIONS
No questions were unresolved
*/


public class Greet {
	public static void main(String[] args) {
		greet("Jason");
		greet("Jaylen");
		greet("Mr. Mykolyk");
	}

	public static void greet(String name) {
		System.out.println("What's up " + name +". How is your day?");
	}
}
