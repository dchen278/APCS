
/*
Downtown Leopard Rocks: David Chen, Lea Kwok, Raven Tang
APCS
HW29 -- Which Way Do You Roll? - commafying an integer iteratively and recursively
11-02-2021
DISCO
 - There are a variety of wrapper classes for primitive types, such as Integer, Double, etc. They have their own methods, such as parseInt.
 - The enhanced for loop is a good way to iterate over a collection. It doesn't require you to know how many items are in the collection or reference array length.
 - In our summer prework, we used Scanner as a way to take keyboard input. Scanner requires individual input of each piece of information after being prompted. However, in this assignment, iterating through String[] args allows all of the input to be given in the same method call. The two are also different because one actually calls the main method and the other reads file input.
 - In our for loop, if number's length is less than 3, the loop gets skipped because i > 0 is not fulfilled. So, the condition part of a for loop can be used to restrict iterations for certain cases.
 - You can increment by a value other than 1. For example, 
	i -= 3
QCC
 - Is there a way to take in an integer input and output a string without using methods like parseInt or toString?
 - If we were to consider negative inputs, we would use a boolean to record if the input is negative or not, convert the absolute value of the input to a string, and concatenate the negative sign at the end before returning according to the boolean value.
*/

public class Commafier {
    public static void main(String[] args) {
        // System.out.println("Recursive version of commafy");
        // System.out.println(commafyR(1));
        // System.out.println(commafyR(10));
        // System.out.println(commafyR(101));
        // System.out.println(commafyR(1000));
        // System.out.println(commafyR(12345));

        // System.out.println("\nIterative version of commafy");
        // System.out.println(commafyF(1));
        // System.out.println(commafyF(10));
        // System.out.println(commafyF(101));
        // System.out.println(commafyF(1000));
        // System.out.println(commafyF(12345));

        for (String arg : args) {
            System.out.println(commafyF(Integer.parseInt(arg)));
        }
    }

    public static String commafyR(int n) {
        String number = Integer.toString(n);
        if (number.length() <= 3) {
            return number;
        } else {
            return commafyR(Integer.parseInt(number.substring(0, number.length() - 3))) + ","
                    + number.substring(number.length() - 3);
        }
    }

    public static String commafyF(int n) {
        String number = Integer.toString(n);
        for (int i = number.length() - 3; i > 0; i -= 3) {
            number = number.substring(0, i) + "," + number.substring(i);
        }
        return number;
    }
}
