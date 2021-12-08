/*
Team Incredibly Cohesive (David Chen, Jaylen Zeng, Orion Roven)
APCS pd7
HW45: Array of Titanium
12/8/21
time elapsed: 0.1 hours
DISCO:
 - Interfaces act like a blueprint for classes. They are used to define the behavior of a class.
 - Interfaces makes sure that each class that implements it has the required methods.
QCC:
 - n/a
*/

/***************************
 * class SuperArray version 2.0
 * Wrapper class for array. Facilitates resizing,
 * getting and setting element values.
 * expansion
 * get, add, remove, set elements in array
 * making SuperArray compliant to interface ListInt
 ***************************/

public class SuperArray implements ListInt {

    private int[] _data; // underlying container
    private int _size; // number of elements in this SuperArray

    // default constructor – initializes 10-item array
    public SuperArray() {
        /* YOUR IMPLEMENTATION HERE */
        this._data = new int[10];
        this._size = 0;
    }

    // output SuperArray in [a,b,c] format
    public String toString() {
        String foo = "[";
        for (int i = 0; i < this._size; i++) {
            foo += this._data[i] + ",";
        }
        if (foo.length() > 1)
            // shave off trailing comma
            foo = foo.substring(0, foo.length() - 1);
        foo += "]";
        return foo;
    }

    // double capacity of SuperArray
    private void expand() {
        /* YOUR IMPLEMENTATION HERE */
        int[] temp = new int[_data.length * 2];
        for (int i = 0; i < _data.length; i++) {
            temp[i] = _data[i];
        }
        this._data = temp;
        // this._size *= 2;
    }

    // accessor -- return value at specified index
    public int get(int index) {
        /* YOUR IMPLEMENTATION HERE */
        return this._data[index];
    }

    public int size() {
        return this._size;
    }

    // mutator -- set value at index to newVal,
    // return old value at index
    public int set(int index, int newVal) {
        /* YOUR IMPLEMENTATION HERE */
        int oldVal = this._data[index];
        this._data[index] = newVal;
        return oldVal;
    }

    public void add(int num) {
        /* YOUR IMPLEMENTATION HERE */
        if (this._size == this._data.length) {
            expand();
        }
        this._data[this._size] = num;
        this._size++;
    }

    public void add(int index, int num) {
        /* YOUR IMPLEMENTATION HERE */
        if (this._size == this._data.length) {
            expand();
        }
        for (int i = this._size; i > index; i--) {
            this._data[i] = this._data[i - 1];
        }
        this._data[index] = num;
        this._size++;
    }

    public void remove() {
        int[] temp = new int[_data.length - 1];
        for (int i = 0; i < _data.length - 1; i++) {
            temp[i] = _data[i];
        }
        this._data = temp;
        this._size--;
    }

    public void remove(int index) {
        for (int i = index; i < _size; i++) {
            this._data[i] = this._data[i + 1];
        }
        this._size--;
    }

    // main method for testing
    public static void main(String[] args) {
        SuperArray mayfield = new SuperArray();
        System.out.println("Printing empty SuperArray mayfield...");
        System.out.println(mayfield);

        mayfield.add(5);
        mayfield.add(4);
        mayfield.add(3);
        mayfield.add(2);
        mayfield.add(1);

        System.out.println("Printing populated SuperArray mayfield...");
        System.out.println(mayfield);

        mayfield.remove(3);
        System.out.println("Printing SuperArray mayfield post-remove...");
        System.out.println(mayfield);
        mayfield.remove(3);
        System.out.println("Printing SuperArray mayfield post-remove...");
        System.out.println(mayfield);

        mayfield.add(3, 99);
        System.out.println("Printing SuperArray mayfield post-insert...");
        System.out.println(mayfield);
        mayfield.add(2, 88);
        System.out.println("Printing SuperArray mayfield post-insert...");
        System.out.println(mayfield);
        mayfield.add(1, 77);
        System.out.println("Printing SuperArray mayfield post-insert...");
        System.out.println(mayfield);

    }// end main()

}
// end class
