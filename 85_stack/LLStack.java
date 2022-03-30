import java.util.LinkedList;

public class LLStack<PANCAKES> implements Stack {
    LinkedList stack = new LinkedList<PANCAKES>();

    public LLStack() {

    }

    public boolean isEmpty() {
        return stack.size() == 0;
    } 

}
