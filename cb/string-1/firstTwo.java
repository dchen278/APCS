public class firstTwo {
    public String firstTwo(String str) {
        if (str.length() < 2) {
            return str;
        } else if (str.length() >= 2) {
            String firstChars = str.substring(0, 2);
            return firstChars;
        }
        return "";
    }
}