/***
 * TBD TNPG - David, Jacc, Kosta 
 * APCS HW25 -- Do I repeat myself? - while loops cont., recursion, and fences 
 * 2021-10-27 
 * time spent: 0.5 hours
 * 
 * DISCO: You can invoke a method in the return statement of another method.
 * - You can use -- or ++ to increment or decrement a variable.
 * QCC: N/A
 ***/

public class Repeater {
    public static String fenceW(int n) {
        int counter = 1;
        String fence = "|";
        while (counter < n) {
            fence += "--|";
            counter++;
        }
        return fence;
    }

    public static String fenceR(int numPosts) {
        if (numPosts == 1) {
            return "|";
        } else {
            return fenceR(numPosts - 1) + "--|";
        }
    }

    public static void main(String[] args) {
        System.out.println("Making a fence using a while loop \n");
        System.out.println(fenceW(1));
        System.out.println(fenceW(2));
        System.out.println(fenceW(3));

        System.out.println("Making a fence using a recursive function \n");
        System.out.println(fenceR(1));
        System.out.println(fenceR(2));
        System.out.println(fenceR(3));
    }
}
