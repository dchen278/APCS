//Given two strings, return true if either of the strings appears at the very
//end of the other string, ignoring upper/lower case differences (in other
//words, the computation should not be "case sensitive"). Note:
//str.toLowerCase() returns the lowercase version of a string.

public class endOther {
    public static void main(String[] args) {
        endOther test = new endOther();
        System.out.println(test.endOther("Hiabc", "abc"));
        System.out.println(test.endOther("AbC", "HiaBc"));
        System.out.println(test.endOther("abc", "abXabc"));
    }

    public boolean endOther(String a, String b) {
        String aLower = a.toLowerCase();
        String bLower = b.toLowerCase();
        if(a.length() < b.length()) {
            return bLower.substring(bLower.length() - aLower.length()).equals(aLower);
        } else {
            return aLower.substring(aLower.length() - bLower.length()).equals(bLower);
        }
    }
    
}
