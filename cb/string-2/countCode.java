/* Return the number of times that the string "code" 
appears anywhere in the given string, except we'll 
accept any letter for the 'd', so "cope" and "cooe" count. */

public class countCode {
    public static void main(String[] args) {
        countCode c = new countCode();
        System.out.println(c.countCode("aaacodebbb"));
        System.out.println(c.countCode("codexxcode"));
        System.out.println(c.countCode("cozexxcope"));
    }

    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }

}
