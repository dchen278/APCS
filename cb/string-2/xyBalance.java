//We'll say that a String is xy-balanced if for all the 'x' chars in the string,
//there exists a 'y' char somewhere later in the string. So "xxy" is balanced,
//but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given
//string is xy-balanced.

public class xyBalance {

    public boolean xyBalance(String str) {
        
    }

    public static void main(String[] args) {
        xyBalance xyBalance = new xyBalance();
        System.out.println(xyBalance.xyBalance("xxy"));
        System.out.println(xyBalance.xyBalance("xyx"));
    }
}