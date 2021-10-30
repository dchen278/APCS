// Return true if the given string contains an appearance of "xyz" where the xyz
// is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does
// not.

public class xyzThere {
    public boolean xyzThere(String str) {
        int i = 0;
        while (i < str.length() - 2) {
            if (str.charAt(i) == '.') {
                i++;
            } else if (str.substring(i, i + 3).equals("xyz")) {
                return true;
            } 
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        xyzThere xyz = new xyzThere();
        System.out.println(xyz.xyzThere("abcxyz"));
        System.out.println(xyz.xyzThere("abc.xyz"));
        System.out.println(xyz.xyzThere("xyz.abc"));
    }
}
