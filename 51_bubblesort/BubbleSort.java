// Team Incredibly Cohesive (David Chen, Orion Roven, Jaylen Zeng)
// APCS pd7
// HW51 -- implementing bubblesort
// 2022-01-03
// time spent: .5hrs

/******************************
 * class BubbleSort -- implements bubblesort algorithm (vanilla)
 *
 * ALGO:
 1)Starting at the right, compare elements adjacent to one another and swap them if necessary for sortedness
 2)Continue this process until you reach the leftmost element
 3)Because the necessary number of passes to ensure sortedness is n-1 where n is the number of elements in the original array, repeat this process n-1 times
 *
 * DISCO:
 * None
 *
 * QCC:
 * q0: If a pass requires no swaps, what do you know?
 * a0: That the list is sorted
 * q1: After pass p, what do you know?
 * a1: We know that the first p elements are sorted and in the right place
 * q2: How many passes are necessary to completely sort?
 * a2: The length of the array - 1 for the worst case (elements were in descending order)
 *
 ******************************/

import java.util.ArrayList;

public class BubbleSort {

    // ~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
    // precond: lo < hi && size > 0
    // postcond: returns an ArrayList of random integers
    // from lo to hi, inclusive
    public static ArrayList populate(int size, int lo, int hi) {
        ArrayList<Integer> retAL = new ArrayList<Integer>();
        while (size > 0) {
            // offset + rand int on interval [lo,hi]
            retAL.add(lo + (int) ((hi - lo + 1) * Math.random()));
            size--;
        }
        return retAL;
    }

    // randomly rearrange elements of an ArrayList
    public static void shuffle(ArrayList al) {
        int randomIndex;
        // setup for traversal fr right to left
        for (int i = al.size() - 1; i > 0; i--) {
            // pick an index at random
            randomIndex = (int) ((i + 1) * Math.random());
            // swap the values at position i and randomIndex
            al.set(i, al.set(randomIndex, al.get(i)));
        }
    }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    // VOID version of bubbleSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void bubbleSortV(ArrayList<Comparable> data) {
        /* YOUR IMPLEMENTATION HERE */
        for (int i = 0; i < data.size(); i++) {
            for (int j = data.size() - 1; j > i; j--) {
                if (data.get(j).compareTo(data.get(j - 1)) < 0) {
                    Comparable temp = data.get(j);
                    data.set(j, data.get(j - 1));
                    data.set(j - 1, temp);
                }
            }
        }
    }

    // ArrayList-returning bubbleSort
    // postcondition: order of input ArrayList's elements unchanged
    // Returns sorted copy of input ArrayList.
    public static ArrayList<Comparable> bubbleSort(ArrayList<Comparable> input) {
        /* YOUR IMPLEMENTATION HERE */
        ArrayList<Comparable> retAL = new ArrayList<Comparable>();
        for (int i = 0; i < input.size(); i++) {
            retAL.add(input.get(i));
        }
        bubbleSortV(retAL);
        return retAL;
    }

    public static void main(String[] args) {

        ArrayList glen = new ArrayList<Integer>();
        glen.add(7);
        glen.add(1);
        glen.add(5);
        glen.add(12);
        glen.add(3);
        System.out.println("ArrayList glen before sorting:\n" + glen);
        bubbleSortV(glen);
        System.out.println("ArrayList glen after sorting:\n" + glen);
        ArrayList coco = populate(10, 1, 1000);
        System.out.println("ArrayList coco before sorting:\n" + coco);
        bubbleSortV(coco);
        System.out.println("ArrayList coco after sorting:\n" + coco);

        glen = new ArrayList<Integer>();
        glen.add(7);
        glen.add(1);
        glen.add(5);
        glen.add(12);
        glen.add(3);
        System.out.println("ArrayList glen before sorting:\n" + glen);
        ArrayList glenSorted = bubbleSort(glen);
        System.out.println("sorted version of ArrayList glen:\n"
                + glenSorted);
        System.out.println("ArrayList glen after sorting:\n" + glen);
        coco = populate(10, 1, 1000);
        System.out.println("ArrayList coco before sorting:\n" + coco);
        ArrayList cocoSorted = bubbleSort(coco);
        System.out.println("sorted version of ArrayList coco:\n"
                + cocoSorted);
        System.out.println("ArrayList coco after sorting:\n" + coco);
        System.out.println(coco);
        /*
         * ==========for AL-returning methods==========
         * ============================================
         */

    }// end main

}// end class BubbleSort
