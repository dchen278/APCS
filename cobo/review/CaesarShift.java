public class CaesarShift {
    public static void main(String[] args) {
        System.out.println(shift("To be, or not to be, that is the question", 3));
    }

    public static String shift(String s, int key) {
        String shifted = "";
        char[] charArray = new char[s.length()];
        for (int i = 0; i < s.length(); i ++) {
            charArray[i] = s.charAt(i);
        }

        for (char c : charArray) {
            if (c >= 'a' && c <= 'z') {
                int newPos = (c - 'a' + key) % 26;
                shifted += (char) ('a' + newPos);
            } else if (c >= 'A' && c <= 'Z') {
                int newPos = (c - 'A' + key) % 26;
                shifted += (char) ('A' + newPos);
            } else {
                shifted += c;
            }
        }
        return shifted;
    }
}
