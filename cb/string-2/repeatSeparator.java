// Given two strings, word and a separator sep, return a big string made of
// count occurrences of the word, separated by the separator string.

public class repeatSeparator {
    public static void main(String[] args) {
        repeatSeparator rs = new repeatSeparator();
        System.out.println(rs.repeatSeparator("Word", "X", 3));
        System.out.println(rs.repeatSeparator("This", "And", 2));
        System.out.println(rs.repeatSeparator("This", "And", 1));
    }

    public String repeatSeparator(String word, String sep, int count) {
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

}
