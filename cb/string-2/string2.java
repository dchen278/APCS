/**
 * string2
 */
public class string2 {
    public static void main(String[] args) {
        // test bobthere
        System.out.println("\nTesting bobthere");
        System.out.println(bobThere("abcbob"));
        System.out.println(bobThere("b9b"));
        System.out.println(bobThere("bac"));

        // test catDog
        System.out.println("\nTesting catDog");
        System.out.println(catDog("catdog"));
        System.out.println(catDog("catcat"));
        System.out.println(catDog("1cat1cadodog"));

        // test countCode
        System.out.println("\nTesting countCode");
        System.out.println(countCode("aaacodebbb"));
        System.out.println(countCode("codexxcode"));
        System.out.println(countCode("cozexxcope"));

        // test countHi
        System.out.println("\nTesting countHi");
        System.out.println(countHi("abc hi ho"));
        System.out.println(countHi("ABChi hi"));
        System.out.println(countHi("hihi"));

        // test doubleChar
        System.out.println("\nTesting doubleChar");
        System.out.println(doubleChar("The"));
        System.out.println(doubleChar("AAbb"));
        System.out.println(doubleChar("Hi-There"));

        // test endOther
        System.out.println("\nTesting endOther");
        System.out.println(endOther("Hiabc", "abc"));
        System.out.println(endOther("AbC", "HiaBc"));
        System.out.println(endOther("abc", "abXabc"));

        // test mixString
        System.out.println("\nTesting mixString");
        System.out.println(mixString("abc", "xyz"));
        System.out.println(mixString("Hi", "There"));
        System.out.println(mixString("xxxx", "There"));

        // test repeatEnd
        System.out.println("\nTesting repeatEnd");
        System.out.println(repeatEnd("Hello", 3));
        System.out.println(repeatEnd("Hello", 2));
        System.out.println(repeatEnd("Hello", 1));

        // test repeatFront
        System.out.println("\nTesting repeatFront");
        System.out.println(repeatFront("Chocolate", 4));
        System.out.println(repeatFront("Chocolate", 3));
        System.out.println(repeatFront("Ice Cream", 2));

        // test repeatSeparator
        System.out.println("\nTesting repeatSeparator");
        System.out.println(repeatSeparator("Word", "X", 3));
        System.out.println(repeatSeparator("This", "And", 2));
        System.out.println(repeatSeparator("This", "And", 1));

        // test xyBalance
        System.out.println("\nTesting xyBalance");
        System.out.println(xyBalance("aaxbby"));
        System.out.println(xyBalance("aaxbb"));
        System.out.println(xyBalance("yaaxbb"));

        // test xyzThere
        System.out.println("\nTesting xyzThere");
        System.out.println(xyzThere("abcxyz"));
        System.out.println(xyzThere("abc.xyz"));
        System.out.println(xyzThere("xyz.abc"));
    }

    // Return true if the given string contains a "bob" string, but where the middle
    // 'o' char can be any char.
    public static boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }

    // Return true if the string "cat" and "dog" appear the same number of times in
    // the given string.
    public static boolean catDog(String str) {
        int cat = 0;
        int dog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                cat++;
            }
            if (str.substring(i, i + 3).equals("dog")) {
                dog++;
            }
        }
        return cat == dog;
    }

    /*
     * Return the number of times that the string "code" appears anywhere in the
     * given string, except we'll accept any letter for the 'd', so "cope" and
     * "cooe" count.
     */
    public static int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }

    // Return the number of times that the string "hi" appears anywhere in the given
    // string.
    public static int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        return count;
    }

    // Given a string, return a string where for every char in the original, there
    // are two chars.
    public static String doubleChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = result + str.charAt(i) + str.charAt(i);
        }
        return result;
    }

    // Given two strings, return true if either of the strings appears at the very
    // end of the other string, ignoring upper/lower case differences (in other
    // words, the computation should not be "case sensitive"). Note:
    // str.toLowerCase() returns the lowercase version of a string.

    public static boolean endOther(String a, String b) {
        String aLower = a.toLowerCase();
        String bLower = b.toLowerCase();
        if (a.length() < b.length()) {
            return bLower.substring(bLower.length() - aLower.length()).equals(aLower);
        } else {
            return aLower.substring(aLower.length() - bLower.length()).equals(bLower);
        }
    }

    // Given two strings, a and b, create a bigger string made of the first char of
    // a, the first char of b, the second char of a, the second char of b, and so
    // on. Any leftover chars go at the end of the result.
    public static String mixString(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();
        int length = Math.min(aLen, bLen);
        String result = "";

        for (int i = 0; i < length; i++) {
            result += a.substring(i, i + 1);
            result += b.substring(i, i + 1);
        }

        return result + a.substring(length) + b.substring(length);
    }

    // Given a string and an int n, return a string made of n repetitions of the
    // last n characters of the string. You may assume that n is between 0 and the
    // length of the string, inclusive.
    public static String repeatEnd(String str, int n) {
        String repeated = str.substring(str.length() - n);

        for (int i = 0; i < n - 1; i++) {
            repeated += str.substring(str.length() - n);
        }
        return repeated;
    }

    // Given a string and an int n, return a string made of the first n characters
    // of the string, followed by the first n-1 characters of the string, and so on.
    // You may assume that n is between 0 and the length of the string, inclusive
    // (i.e. n >= 0 and n <= str.length()).
    public static String repeatFront(String str, int n) {
        String result = "";

        for (int i = n; i > 0; i--) {
            result += str.substring(0, i);
        }
        return result;
    }

    // Given two strings, word and a separator sep, return a big string made of
    // count occurrences of the word, separated by the separator string.
    public static String repeatSeparator(String word, String sep, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            if (i < count - 1) {
                result += word + sep;
            } else {
                result += word;
            }
        }
        return result;
    }

    // We'll say that a String is xy-balanced if for all the 'x' chars in the
    // string,
    // there exists a 'y' char somewhere later in the string. So "xxy" is balanced,
    // but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given
    // string is xy-balanced.
    public static boolean xyBalance(String str) {
        boolean x = false;
        boolean y = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x' && y) {
                y = false;
                x = true;
            } else if (str.charAt(i) == 'x') {
                x = true;
            } else if (str.charAt(i) == 'y' && x) {
                y = true;
            }
        }
        if (x == false) {
            y = true;
        }
        return y;
    }

    // Return true if the given string contains an appearance of "xyz" where the xyz
    // is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does
    // not.
    public static boolean xyzThere(String str) {
        int i = 0;
        while (i < str.length() - 2) {
            if (str.charAt(i) == '.') {
                i++;
            } else if (str.substring(i, i + 3).equals("xyz")) {
                return true;
            }
            i++;
        }
        return false;
    }
}