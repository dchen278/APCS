import javax.xml.namespace.QName;

// Given two strings, a and b, create a bigger string made of the first char of
// a, the first char of b, the second char of a, the second char of b, and so
// on. Any leftover chars go at the end of the result.



public class mixString {
    public static void main(String[] args) {
        mixString test = new mixString();

        System.out.println(test.mixString("abc", "xyz"));
        System.out.println(test.mixString("Hi", "There"));
        System.out.println(test.mixString("xxxx", "There"));
    }

    public String mixString(String a, String b) {
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
    
}
