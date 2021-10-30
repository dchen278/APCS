// Return true if the given string contains a "bob" string, but where the middle
// 'o' char can be any char.


public class bobThere {
    public boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
    }
    return false;
}
    
    public static void main(String[] args) {
        bobThere b = new bobThere();
        System.out.println(b.bobThere("abcbob"));
        System.out.println(b.bobThere("b9b"));
        System.out.println(b.bobThere("bac"));
    }
}
