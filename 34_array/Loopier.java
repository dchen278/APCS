// Team Incredibly Cohesive

import java.math.*;
import java.util.Arrays;

public class Loopier {
    static int[] paul = new int[10];
    public static void main(String[] args) {
        Loopier tim = new Loopier();
        tim.populateArray(paul);
        System.out.println(Arrays.toString(paul));
    }

    public void populateArray(int[] a) {
        int i = 0;
        while(i < 10) {
            int x = (int) (Math.random() * 100);
            // System.out.println(x);
            paul[i] = x;
            i++;
        }
    }    

    public String[] stringVersion(int[] a) {
        
    }
}