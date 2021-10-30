// Given a string and an int n, return a string made of n repetitions of the
// last n characters of the string. You may assume that n is between 0 and the
// length of the string, inclusive.

public class repeatEnd {
    public static void main(String[] args) {
        repeatEnd test = new repeatEnd();
        System.out.println(test.repeatEnd("Hello", 3));
        System.out.println(test.repeatEnd("Hello", 2));
        System.out.println(test.repeatEnd("Hello", 1));
    }   
    
    public String repeatEnd(String str, int n) {
        String repeated = str.substring(str.length() - n);

        for (int i = 0; i < n - 1; i++) {
            repeated += str.substring(str.length() - n);
        }
        return repeated;
    }
    
}
