// algo: 
// 1. If the next value is less than the root of maxHeap, add the value to maxheap, else add to minHeap.
// 2. If the difference in the size of the heaps is 2 or greater, you need to balance the heap by removing from the larger heap and adding that value to the smaller heap (-this can be accomplished as the remove() method retuurns the value removed)
// 3. find med by: 
// a. if heap sizes equal: med is mean of roots
// b. if heap sizes !equal: med is the root of higher heap

public class RunMed {
    
    ALHeapMin bigVals; 
    ALHeapMax lilVals;

    public RunMed() {
        
        ALHeapMin bigVals = new ALHeapMin(); 
        ALHeapMax lilVals = new ALHeapMin(); 

    }

    public int getMedian() {

    }

    public add(Integer newVal) {

    }
}
