// Hand Sanitizers (Yat Long Chan + Diana Akhmedova + David Chen)
// APCS pd8
// HW71 -- Reading for intent, tracing for VICTORY
// 2022-03-07m
// time spent: 0.9 hrs

/***
 * SKEELTON for
 * class Mysterion
 * tests preliminary hypotheses re: utility of mystery algo
 * 
 * <h1>It's a Bird, It's a Plane! It's.... MYSTERION</h1>
 * The Mysterion method ... <YOUR TRIO'S DESCRIPTION HERE> 
 * <p>
 * <b>Note:</b> BLAH blah blah, yakkety schmakketty...
 * @author  Trey Parker, Matt Stone
 * @version 3.1415926535897932384626433
 * @since   2022-03-07m 
 *
 * algo as pseudocode:
 * ------------------------------
 *     v = arr[c]
 *     swap arr[c], arr[b]  
 *     s = a
 *     for i in [a..b-1]
 *         if arr[i] < v
 *             swap arr[s], arr[i]
 *             s+=1
 *     swap arr[b], arr[s] 
 * 
 * DISCO
 * Algo creates a partition within the given array between elements smaller and larger than partition value.
 * When c and b are the last index of the array, the algo swaps the last 2 values if arr[c-1] < arr[c] despite being already partitioned properly.
 * 
 * QCC
 * Possibly run multiple partitions on each side of an array to eventually sort it.
 * 
 * q0: What does it do?
 * a0: Looks through a subarray from index a to b-1 and places all elements < arr[c] to the left and any elements >= arr[c] to the right.
 * 
 * q1: O(?)
 * a1: O(n) b/c algo only iterates through a to b-1 once.
 * 
 ***/


public class Mysterion 
{    
  //--------------v  HELPER METHODS  v--------------
  //swap values at indices x, y in array o
  public static void swap( int x, int y, int[] o )
  {
    int tmp = o[x];
    o[x] = o[y];
    o[y] = tmp;
  }

  //print input array 
  public static void printArr( int[] a )
  {
    for ( int o : a )
      System.out.print( o + " " );
    System.out.println();
  }

  //shuffle elements of input array
  public static void shuffle( int[] d )
  {
    int tmp;
    int swapPos;
    for( int i = 0; i < d.length; i++ ) {
      tmp = d[i];
      swapPos = i + (int)( (d.length - i) * Math.random() );
      swap( i, swapPos, d );
    }
  }
    
  //return int array of size s, with each element fr range [0,maxVal)
  public static int[] buildArray( int s, int maxVal )
  {
    int[] retArr = new int[s];
    for( int i = 0; i < retArr.length; i++ )
      retArr[i] = (int)( maxVal * Math.random() );
    return retArr;
  }
  //--------------^  HELPER METHODS  ^--------------


  /**
   * int partition(int[],int,int,int)
   * Change array so that each element from lo to hi < arr[partIndex] is on the left 
   * and elements >= arr[partIndex] is on the right.
   * 
   * @param arr
   * @param lo | lower bound
   * @param hi | upper bound
   * @param partIndex | index of value to form partition
   * @return int 
   *
   */
  public static int partition( int arr[], int lo, int hi, int partIndex)
  {
    int partition = arr[partIndex];

    swap(partIndex, hi, arr);

    int swapIndex = lo;
    for (int i = lo; i < hi; i++) {
      if (arr[i] < partition) {
        swap(swapIndex, i, arr);
        swapIndex++;
        printArr(arr);
      }
    }
    swap(hi, swapIndex, arr);
    printArr(arr);


    return swapIndex;
  }//end partition


  //main method for testing
  public static void main( String[] args )
  {
    
    //init test arrays of magic numbers
    // int[] arr1 = {7,21,17,69,343};
    // int[] arr3 = {1,28,33,4982,37};
    // int[] arr4 = {5,4,17,9000,6};
    // int[] arr5 = {3,0,16,599,1024};
    int[] arr6 = {13, 7, 29, 26, 3, 8, 9};
    partition(arr6, 0, 6, 3);
    partition(arr6, 0, 4, 2);
    partition(arr6, 0, 2, 1);
    partition(arr6, 0, 1, 1);

    
    // run partition on each array,
    // holding a & b fixed, varying c...
    // for( int testC = 0; testC < 5; testC++ ) {
    //   System.out.println("arr1: ");
    //   printArr(arr1);
    //   partition(arr1,0,4,testC);
    //   System.out.println("after partition w/ a=0,b=4,c=" 
    //   + testC +"...");
    //   printArr(arr1);
    //   System.out.println("-----------------------");
      
    //   System.out.println("arr3:");
    //   printArr(arr3);
    //   partition(arr3,0,4,testC);
    //   System.out.println("after partition w/ a=0,b=4,c=" 
    //   + testC +"...");
    //   printArr(arr3);
    //   System.out.println("-----------------------");
      
    //   System.out.println("arr4:");
    //   printArr(arr4);
    //   partition(arr4,0,4,testC);
    //   System.out.println("after partition w/ a=0,b=4,c=" 
    //   + testC +"...");
    //   printArr(arr4);
    //   System.out.println("-----------------------");
      
    //   System.out.println("arr5:");
    //   printArr(arr5);
    //   partition(arr5,0,4,testC);
    //   System.out.println("after partition w/ a=0,b=4,c=" 
    //   + testC +"...");
    //   printArr(arr5);
    //   System.out.println("-----------------------");
    //   /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    // }
  }//end main
}//end class Mysterion
