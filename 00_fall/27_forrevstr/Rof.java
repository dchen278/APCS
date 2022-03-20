/* Triumphrate Computer Team - David, Ariel, Orion
   APCS
   HW27: FOR the Love of Strings
   2021-10-27
   time spent: 0.5 hours
   DISCO: substring() returns a new string that is a substring of the given string.
   length() returns the length of the given string.
   QCC: N/A
 */

public class Rof {
    public String fenceF(int posts) {
        String fence = "|";
        for (int i = 0; i < posts; i++) {
            fence += "--|";
        }
        return fence;
    }

    public String reverseF(String s) {
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.substring(i, i + 1);
        }
        return reverse;
    }

    public String reverseR(String s) {
        if (s.length() == 1) {
            return s;
        } else {
            return s.substring(s.length() - 1) + reverseR(s.substring(0, s.length() - 1));
        }
    }

    public static void main(String[] args) {
        Rof rof = new Rof();
        System.out.println("---- For Fence -----");
        System.out.println(rof.fenceF(5));
        System.out.println(rof.fenceF(3));
        System.out.println(rof.fenceF(7));

        System.out.println("---- For Reverse -----");
        System.out.println(rof.reverseF("stressed"));
        System.out.println(rof.reverseF("APCS"));
        System.out.println(rof.reverseF("hello"));

        System.out.println("---- Recursive Reverse -----");
        System.out.println(rof.reverseR("stressed"));
        System.out.println(rof.reverseR("APCS"));
        System.out.println(rof.reverseR("hello"));
    }
}
