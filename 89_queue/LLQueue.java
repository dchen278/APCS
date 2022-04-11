import java.util.LinkedList;

public class LLQueue<T> implements Queue <T>{
    LinkedList<T> _queue = new LinkedList<T>();
    int _end, _front;

    public void enqueue(T x) {
        if (isEmpty()) {
            _queue.add(x);
        }
    } 

    public T peekFront() {

    } 

    public T dequeue() {
        T retVal = _queue.peekLast();

        return retVal;
    }

    public boolean isEmpty() {
        return _queue.size() == 0;
    }
}
