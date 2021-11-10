/* Yat Long Chan, David Chen, Jason Yang
APCS
L00 -- Etterbay Odingcay Oughthray Ollaborationcay
11-09-21
time spent: 20 minutes
DISCO
- the String wrapper class has methods for making a string uppercase and lowercase.
QCC
- none
NEW IN v2
- translate words with punc and capitals.
*/

public class Pig {

    private static final String VOWELS = "aeiouy";
    private static final String CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String PUNCS = ".,:;!?";

    public static boolean hasA(String w, String letter) {
        return (w.indexOf(letter) != -1);
    }// end hasA()

    /*
     * ===================================== boolean isAVowel(String) -- tells
     * whether a letter is a vowel precondition: letter.length() == 1
     * =====================================
     */
    public static boolean isAVowel(String letter) {
        return (hasA(VOWELS, letter));
    }

    /*
     * ===================================== int countVowels(String) -- counts
     * vowels in a String pre: w != null post: countVowels("meatball") -> 3
     * =====================================
     */
    public static int countVowels(String w) {
        int count = 0;
        for (int i = 0; i < w.length(); i++) {
            if (isAVowel(w.substring(i, i + 1))) {
                count++;
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
        for (int i = 0; i < w.length(); i++) {
            if (isAVowel(w.substring(i, i + 1))) {
                return true;
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
        String ans = "";
        for (int i = 0; i < w.length(); i++) {
            if (isAVowel(w.substring(i, i + 1))) {
                ans += w.substring(i, i + 1);
            }
        }
        return ans;
    }

    /*
     * ===================================== boolean isPunc(String) -- tells whether
     * a character is punctuation pre: symbol.length() == 1 post: isPunc(".") ->
     * true isPunc("b") -> false =====================================
     */
    public static String firstVowel(String w) {

        String ans = "";

        if (hasAVowel(w)) // Q: Why this necess?
            ans = allVowels(w).substring(0, 1);

        return ans;
    }

    /**
     * boolean beginsWithVowel(String) -- tells whether a String begins with a vowel
     * pre: w != null and w.length() > 0 post: beginsWithVowel("apple") --> true
     * beginsWithVowel("strong") --> false
     **/
    public static boolean beginsWithVowel(String w) {
        return isAVowel(w.substring(0, 1));
    }

    public static int puncIndex(String w) {
        for (int i = 0; i < w.length(); i++) {
            if (isPunc((w.substring(i, i + 1)))) {
                return i;
            }
        }
        return -1;
    }

    /**
     * String engToPig(String) -- converts an English word to Pig Latin pre:
     * w.length() > 0 post: engToPig("apple") --> "appleway" engToPig("strong") -->
     * "ongstray" engToPig("java") --> "avajay"
     **/
    public static String engToPig(String w) {

        String ans = "";
        if (beginsWithVowel(w))
            ans = w + "way";

        else {
            int vPos = w.indexOf(firstVowel(w));
            ans = w.substring(vPos) + w.substring(0, vPos) + "ay";
        }

        return ans;
    }

    public static String puncTranslate(String w) {
        int pIndex = puncIndex(w);
        String p = "";
        String temp = w.substring(0, pIndex);
        p = w.substring(pIndex, pIndex + 1);
        return engToPig(temp) + p;
    }

    public static String wordTranslate(String w) {
        String ans = "";
        if (puncIndex(w) == (w.length() - 1)) {
            ans = puncTranslate(w);
        } else {
            ans = engToPig(w);
        }
        if (beginsWithUpper(w)) {
            ans = ans.substring(0, 1).toUpperCase() + ans.substring(1, ans.length()).toLowerCase();
        }
        return ans;
    }

    public static boolean isPunc(String symbol) {
        return PUNCS.indexOf(symbol) != -1;
    }

    /*
     * ===================================== boolean isUpperCase(String) -- tells
     * whether a letter is uppercase pre: letter.length() == 1 post:
     * isUpperCase("a") -> false isUpperCase("A") -> true
     * =====================================
     */
    public static boolean isUpperCase(String letter) {
        return CAPS.indexOf(letter) != -1;

    }

    /*
     * ===================================== boolean hasPunc(String) -- tells
     * whether a String contains punctuation pre: w != null post: hasPunc("cat") ->
     * true hasPunc("cat") -> false =====================================
     */
    public static boolean hasPunc(String w) {
        for (int i = 0; i < w.length(); i++) {
            if (isPunc(w.substring(i, i + 1))) {
                return true;
            }
        }
        return false;
    }

    /*
     * ===================================== boolean beginsWithUpper(String) --
     * tells whether 1st letter is uppercase pre: w != null and w.length() > 0 post:
     * beginsWithUpper("Apple") -> true beginsWithUpper("apple") -> false
     * =====================================
     */
    public static boolean beginsWithUpper(String w) {

        return isUpperCase(w.substring(0, 1));
    }

    public static void main(String[] args) {

        for (String word : args) {
            System.out.println("allVowels \t" + allVowels(word));
            System.out.println("firstVowels \t" + firstVowel(word));
            System.out.println("countVowels \t" + countVowels(word));
            System.out.println("wordTranslate \t" + wordTranslate(word));
            System.out.println("hasPunc \t" + hasPunc(word));
            System.out.println("---------------------");
        }
    }
}// end class Pig

