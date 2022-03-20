// dot_gitignore : David Chen, Jaylen Zeng, Yat Long Chan
// APCS pd7
// HW55 - Time complexities for oal methods
// 2022-01-12
// time spent:  0.4 hrs
/**
 * DISCO
 * Big-O is dependent on iterations
 * QCC
 * none
 **/

import java.util.ArrayList;

public class OrderedArrayList {
    private ArrayList<Integer> _list;

    public OrderedArrayList() {
        _list = new ArrayList<Integer>();
    }

    // return the string representation of the list
    public String toString() {
        return _list.toString();
    }

    // gets the value at the specified index
    // No best case or worst case
    // O(1) because it will only take constant time to get the value at the specified index
    public Integer get(int index) {
        return _list.get(index);
    }

    // remove the value at the specified index
    // Best case: O(1) when the value removed is the last value in the list because there would not be any shifting
    // Worst case: O(n) when the value removed is the first value in the list because there would be a shifting of n - 1 elements
    public Integer remove(int index) {
        return _list.remove(index);
    }

    // returns the size of the list
    // no best case or worst case
    // O(1) because it will only take constant time to get the size of the list
    public int size() {
        return _list.size();
    }

    // No best case or worst case O(n)
    // If the elemented added belongs to the first index, it will take n time to shift the elements
    // If the element added belongs to the last index, it will iterate through the list and shift the element once
    public boolean addLinear(Integer value) {
        int i = 0;
        while (i < _list.size()) {
            if (value.compareTo(_list.get(i)) < 0) {
                _list.add(i, value);
                return true;
            }
            i++;
        }
        _list.add(value);
        return true;
    }

    // use binary search to find the correct index and add newVal

    // Best case: O(n) when the value added belongs in the middle, because it will take n time to shift the elements
    // Worst case: O(n) when the value added belongs to the first or last index, it will take log_2(n) time to search and shift the elements
    public boolean addBinary(Integer newVal) {
        int low = 0;
        int high = _list.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            int compare = newVal.compareTo(_list.get(mid));
            if (compare == 0) {
                _list.add(mid, newVal);
                return true;
            } else if (compare < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        _list.add(low, newVal);
        return true;
    }

    public static void main(String[] args) {
        OrderedArrayList list = new OrderedArrayList();
        System.out.println("Printing empty OrderedArrayList: \n" + list);

        for (int i = 0; i < 10; i++) {
            list.addLinear((int) (Math.random() * 100));
        }

        // list.addBinary(76);

        System.out.println("Printing OrderedArrayList with 10 random values from 1 to 100: \n" + list);

        System.out.println("Removing value at index 3: \n" + list.remove(3));

        System.out.println("Printing OrderedArrayList after removing value at index 3: \n" + list);

        OrderedArrayList list2 = new OrderedArrayList();
        for (int i = 0; i < 10; i++) {
            list2.addBinary((int) (Math.random() * 100));
        }
        System.out.println("Printing OrderedArrayList with 10 random values from 1 to 100: \n" + list2);
    }
}
