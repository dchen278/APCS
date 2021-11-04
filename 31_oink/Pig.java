/*
Downtown Leopard Rocks: David Chen, Lea Kwok, Raven Tang
APCS
HW31: Otnay Ybay ethay Airhay Onway Ymay Inneechay Inchay Inchay
11-03-2021
Time Spent: 20 minutes
DISCO
  - The final keyword is used to indicated that a method or variable cannot be changed after
    it has been declared.
  - Instead creating String variables for each vowel, combining all of them into one instance variable that cannot be changed saved a lot of time and space.
  - When testing cases of a method that return an empty String, if the output is printed in Terminal, it is still apparent that the correct output is displayed because there is an empty line.
  - We can also use indexOf to find the index of a substring in a string.  
  - We can call upon methods that we already wrote in the new methods we're creating.
QCC
  - When we check if a letter is in a String, we have to state the precondition that letter.length() == 1 because we don't know how to compare chars and Strings yet.
- Why is VOWELS in all caps? Is that a convention for naming final instance variables?
- Why do we have a countVowel() and a hasVowel() method if a positive countVowel() return value implies a true return for hasVowel()?

*/

public class Pig {
    // Q: How does this initialization make your life easier?
    private static final String VOWELS = "aeiou";

    /*
     * ===================================== boolean hasA(String,String) -- checks
     * for a letter in a String pre: w != null, letter.length() == 1 post:
     * hasA("cat", "a") -> true hasA("cat", "p") -> false
     * =====================================
     */
    public static boolean hasA(String w, String letter) {
        return w.indexOf(letter) != -1;
    }// end hasA()

    /*
     * ===================================== boolean isAVowel(String) -- tells
     * whether a letter is a vowel precondition: letter.length() == 1
     * =====================================
     */
    public static boolean isAVowel(String letter) {
        /* YOUR IMPLEMENTATION HERE */
        return hasA(VOWELS, letter);
    }

    /*
     * ===================================== int countVowels(String) -- counts
     * vowels in a String pre: w != null post: countVowels("meatball") -> 3
     * =====================================
     */
    public static int countVowels(String w) {
        int count = 0;
        if (w != null) {
            for (int i = 0; i < w.length(); i++) {
                if (isAVowel(w.substring(i, i + 1))) {
                    count++;
                }
            }
        }
        return count;
    }

    /*
     * ===================================== boolean hasAVowel(String) -- tells
     * whether a String has a vowel pre: w != null post: hasAVowel("cat") -> true
     * hasAVowel("zzz") -> false =====================================
     */
    public static boolean hasAVowel(String w) {
        if (w != null) {
            for (int i = 0; i < w.length(); i++) {
                if (isAVowel(w.substring(i, i + 1))) {
                    return true;
                }
            }
        }
        return false;
    }

    /*
     * ===================================== String allVowels(String) -- returns
     * vowels in a String pre: w != null post: allVowels("meatball") -> "eaa"
     * =====================================
     */
    public static String allVowels(String w) {
        /* YOUR IMPLEMENTATION HERE */
        String result = "";
        if (w != null) {
            for (int i = 0; i < w.length(); i++) {
                String letter = w.substring(i, i + 1);
                if (isAVowel(letter)) {
                    result += letter;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        /* YOUR TEST CALLS HERE */
        System.out.println("Does cat contain the letter a? " + hasA("cat", "a"));
        System.out.println("Does cat contain the letter p? " + hasA("cat", "p"));

        System.out.println("Is a vowel? " + isAVowel("a"));
        System.out.println("Is b vowel? " + isAVowel("b"));

        System.out.println("How many vowels in cat? " + countVowels("cat"));
        System.out.println("How many vowels in zzz? " + countVowels("zzz"));

        System.out.println("Does cat have a vowel? " + hasAVowel("cat"));
        System.out.println("Does zzz have a vowel? " + hasAVowel("zzz"));

        System.out.println("All vowels in cat? " + allVowels("cat"));
        System.out.println("All vowels in spaghetti? " + allVowels("spaghetti"));

    }// end main()

}// end class Pig
