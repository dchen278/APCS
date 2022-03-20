/*
Team Incredibly Cohesive: David Chen, Jaylen Zeng, Orion Roven
APCS
HW34: A Pirate's Life for Me
11-14-2021
time elapsed: 0.2 hours

DISCO:
- We can use our own method to convert an array into a string.
QCC:
- N/A
*/

public class Loopier {
    static int[] paul = new int[10];

    public static void main(String[] args) {
        Loopier tim = new Loopier();
        tim.populateArray(paul);
        System.out.println(tim.arrToString(paul));
        System.out.println(tim.linSearch(paul, 14));
        System.out.println(tim.linSearchR(paul, 0, paul[3]));
        System.out.println(tim.linSearchR(paul, 0, 14));
        System.out.println(tim.freq(paul, paul[3]));
        System.out.println(tim.freqRec(paul, 0, paul[2]));
    }

    public void populateArray(int[] a) {
        int i = 0;
        while (i < 10) {
            int x = (int) (Math.random() * 100);
            // System.out.println(x);
            paul[i] = x;
            i++;
        }
    }

    // return a String version of an array of ints.
    public static String arrToString(int[] ary) {
        String ans = "[";
        for (int i = 0; i < ary.length; i++) {
            ans += ary[i];
            if (i != ary.length - 1) {
                ans += ", ";
            }
        }
        return ans + "]";
    }

    public static int linSearch(int[] a, int target) {
        int i = 0;
        while (i < a.length) {
            if (a[i] == target) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int linSearchR(int arr[], int start, int target) {
        if (start > arr.length - 1) {
            return -1;
        }
        if (arr[start] == target) {
            return start;
        }
        return linSearchR(arr, start + 1, target);
    }

    public static int freq(int arr[], int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static int freqRec(int arr[], int start, int target) {
        if (start > arr.length - 1) {
            return 0;
        }
        if (arr[start] == target) {
            return 1 + freqRec(arr, start + 1, target);
        }
        return freqRec(arr, start + 1, target);
    }

}