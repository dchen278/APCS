/*
Team Incredibly Cohesive (David Chen, Jaylen Zeng, Orion Roven)
APCS pd7
HW43 -- Array of Steel
12/6/21
time elapsed: 0.3 hours
DISCO:
*We can change the size of our arrays by creating a completely new one.
Ex: Assuming _data orginally has 10 indices, _data = new int[20];
Now _data should have 20 indices.
*
QCC:
*/

/***************************
 * class SuperArray
 * Wrapper class for array. Facilitates resizing,
 * getting and setting element values.
 ***************************/

public class SuperArray {

    private int[] _data; // underlying container
    private int _size; // number of elements in this SuperArray

    // default constructor – initializes 10-item array
    public SuperArray() {
        /* YOUR IMPLEMENTATION HERE */
        this._data = new int[10];
        this._size = this._data.length;
    }

    // output SuperArray in [a,b,c] format
    public String toString() {
        String result = "[";
        for (int i = 0; i < _data.length; i++) {
            result += _data[i];
            if (i != _data.length - 1) {
                result += ", ";
            }
        }
        return result + "]";
    }

    // double capacity of SuperArray
    private void expand() {
        /* YOUR IMPLEMENTATION HERE */
        int[] temp = new int[_data.length * 2];
        for (int i = 0; i < _data.length; i++) {
            temp[i] = _data[i];
        }
        this._data = temp;
        this._size *= 2;
    }

    // accessor -- return value at specified index
    public int get(int index) {
        /* YOUR IMPLEMENTATION HERE */
        return this._data[index];
    }

    // mutator -- set value at index to newVal,
    // return old value at index
    public int set(int index, int newVal) {
        /* YOUR IMPLEMENTATION HERE */
        int oldVal = this._data[index];
        this._data[index] = newVal;
        return oldVal;
    }

    // main method for testing
    public static void main(String[] args) {
        SuperArray curtis = new SuperArray();
        System.out.println("Printing empty SuperArray curtis...");
        System.out.println(curtis);
        for (int i = 0; i < curtis._data.length; i++) {
            curtis.set(i, i * 2);
        }
        System.out.println("Printing populated SuperArray curtis...");
        System.out.println(curtis);
        for (int i = 0; i < 3; i++) {
            curtis.expand();
            System.out.println("Printing expanded SuperArray curtis...");
            System.out.println(curtis);
        }
    }// end main()

}
// end class
