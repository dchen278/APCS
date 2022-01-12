// dot_gitignore : David Chen, Jaylen Zeng, Yat Long Chan
// APCS pd7
// HW54 - All three sorts
// 2022-01-12
// time spent: 0 hrs

import java.util.ArrayList;

public class MySorts {

  public static void bubbleSort(ArrayList<Comparable> data) { // Exit-Early
    boolean sorted = true;
    for (int pass = 0; pass < data.size(); pass++) {
      // iterate thru array from last to pass index
      for (int j = data.size() - 1; j > pass; j--) {
        // compare adjacent elements and swap if needed
        if (data.get(j).compareTo(data.get(j - 1)) < 0) {
          sorted = false;
          Comparable temp = data.get(j);
          data.set(j, data.get(j - 1));
          data.set(j - 1, temp);
        }
      }
      // end loop
      // if no swaps are made, the array is already sorted
      if (sorted) {
        break;
      }
    }
  }

  public static void selectionSort(ArrayList<Comparable> data) {

    // maxPos will point to position of SELECTION (greatest value)
    int maxPos;
    for (int pass = data.size() - 1; pass > 0; pass--) {
      maxPos = pass;
      // iterate thru next-to-last to first element and compare with last.
      for (int i = pass - 1; i >= 0; i--) {
        // if element at i > element at maxPos, new maxPos = i
        if (data.get(i).compareTo(data.get(maxPos)) > 0) {
          maxPos = i;
        }
      }
      // swap last element with element at maxPos.
      Comparable temp = data.get(pass);
      data.set(pass, data.get(maxPos));
      data.set(maxPos, temp);
    }
  }// end selectionV

  public static void insertionSort(ArrayList<Comparable> data) {

    for (int partition = 1; partition < data.size(); partition++) {
      // partition marks first item in unsorted region
      // traverse sorted region from right to left
      for (int i = partition; i > 0; i--) {
        // "walk" the current item to where it belongs
        // by swapping adjacent items
        if (data.get(i).compareTo(data.get(i - 1)) < 0) {
          Comparable temp = data.get(i);
          data.set(i, data.get(i - 1));
          data.set(i - 1, temp);
        } else
          break;
      }
    }

  }// end insertionV

}
