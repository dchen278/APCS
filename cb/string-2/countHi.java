//Return the number of times that the string "hi" appears anywhere in the given string.

public class countHi {
    public static void main(String[] args) {
        countHi hi = new countHi();
        System.out.println(hi.countHi("abc hi ho"));
        System.out.println(hi.countHi("ABChi hi"));
        System.out.println(hi.countHi("hihi"));
    }

    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        return count;
    }
}
