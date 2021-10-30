//We'll say that a String is xy-balanced if for all the 'x' chars in the string,
//there exists a 'y' char somewhere later in the string. So "xxy" is balanced,
//but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given
//string is xy-balanced.

public class xyBalance {

    public boolean xyBalance(String str) {
        boolean x = false;
        boolean y = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x' && y) {
                y = false;
                x = true;
            } else if (str.charAt(i) == 'x') {
                x = true;
            } else if (str.charAt(i) == 'y' && x) {
                y = true;
            }
        }
        if (x == false) {
            y = true;
        }
        return y;
    }

    public static void main(String[] args) {
        xyBalance xyBalance = new xyBalance();
        System.out.println(xyBalance.xyBalance("aaxbby"));
        System.out.println(xyBalance.xyBalance("aaxbb"));
        System.out.println(xyBalance.xyBalance("yaaxbb"));
        System.out.println(xyBalance.xyBalance("bbb"));
    }
}