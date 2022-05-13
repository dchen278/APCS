import java.util.ArrayList;
public class ArrayPriorityQueue implements PriorityQueue{
    
    private ArrayList<Integer> bruv = new ArrayList<Integer>();
    
    //O(1)
    public boolean isEmpty() {
        return bruv.isEmpty();
    }

    //O(1)
    public Integer peekMin() {
        return bruv.get(bruv.size()-1);
    }

    //O(1)
    public void removeMin() {
        bruv.remove(bruv.size()-1);
    }

    //O(n)
    public void add(Integer value) {
        if (bruv.isEmpty()) {
            bruv.add(value);
        } else {
            for (int i = 0; i < bruv.size(); i++) {
                if (value > bruv.get(i)) {
                    bruv.add(value, i);
                }
            }
        }
    }
}
