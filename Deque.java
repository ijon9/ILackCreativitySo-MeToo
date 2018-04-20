//Team ILackCreativitySo-MeToo - T. Fabiha, Nadine Jackson, Isaac Jon
//APCS2 pd2
//L #02: All Hands on Deque!
//2018-04-20

public interface Deque<E>
{
    //-----------v CORE METHODS v-----------
    void addFirst(E val);
    void addLast(E val);

    E pollFirst();
    E pollLast();

    E peekFirst();
    E peekLast();

    int size();
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
    //-----------^ ENCAPSULATION METHODS ^-----------

    //-----------v EXTRA METHODS v-----------
    boolean removeFirstOccurance(E val);
    boolean removeLastOccurance(E val);
    //-----------^ EXTRA METHODS ^-----------
    
    
}
