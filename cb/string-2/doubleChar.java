// Given a string, return a string where for every char in the original, there are two chars.

public class doubleChar {
    public String doubleChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = result + str.charAt(i)+ str.charAt(i);
        }
        return result;
    }
    public static void main(String[] args) {
        doubleChar dc = new doubleChar();
        System.out.println(dc.doubleChar("The"));
        System.out.println(dc.doubleChar("AAbb"));
        System.out.println(dc.doubleChar("Hi-There"));
        System.out.println(dc.doubleChar("Word!"));
        System.out.println(dc.doubleChar("!!"));
    }
}
