public interface Deque<E>
{
    //-----------v CORE METHODS v-----------
    void addFirst(E val);
    void addLast(E val);

    E pollFirst();
    E pollLast();

    E peekFirst();
    E peekLast();
    //-----------^ CORE METHODS ^-----------

    //-----------v PHASE TWO EXCEPTION METHODS v-----------
    E removeFirst();
    E removeLast();

    E getFirst();
    E getLast();
    //-----------^ PHASE TWO EXCEPTION METHODS ^-----------

    //-----------v ENCAPSULATING METHODS v-----------
    void add(E val);
    E remove();
    E poll();
    E element();
    E peek();

    void push(E val);
    E pop();
    //-----------^ PHASE TWO EXCEPTION METHODS ^-----------
    
    
}
