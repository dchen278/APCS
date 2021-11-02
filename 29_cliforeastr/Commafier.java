/*
Downtown Leopard Rocks: David Chen, Lea Kwok, Raven Tang
APCS
HW29 -- Which Way Do You Roll? - commafying an integer iteratively and recursively
11-02-2021
DISCO
 - There are a variety of wrapper classes for primitive types, such as Integer, Double, etc.
 - The enhanced for loop is a good way to iterate over a collection.
QCC
 -N/A
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
