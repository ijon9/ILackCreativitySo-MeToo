//Team ILackCreativitySo-MeToo - T. Fabiha, Nadine Jackson, Isaac Jon
//APCS2 pd2
//L #02: All Hands on Deque!
//2018-04-20

import java.util.*;

public class QQKachoo<E> implements Deque<E>
{
    private DLLNode<E> _first;
    private DLLNode<E> _last;
    private int _size;
    
    public QQKachoo()
    {
	_first = null;
	_last = null;
	_size = 0;
    }
    ////////////////////////////////////////
    //-----------v CORE METHODS v-----------
    ////////////////////////////////////////

	public boolean isEmpty(){
		return size() == 0;
	}

    public int size()
    {
	return _size;
    }

    //Adds val at the front of the Deque
    public void addFirst(E val)
    {
	DLLNode<E> newVal = new DLLNode<E>(val, null, null);
	if(val == null)
	    {
		throw new NullPointerException();
	    }
	if (_size == 0)
	    {
		_first = newVal;
		_last = newVal;
	    }
	else
	    {
		newVal.setNext(_first);
	        _first.setPrev(newVal);

		_first = newVal;
	    }

	_size += 1;
    }

    //Adds val at the end of the Deque
    public void addLast(E val)
    {
	DLLNode<E> newVal = new DLLNode<E>(val, null, null);

	if(val == null)
	    {
		throw new NullPointerException();
	    }
	if (_size == 0)
	    {
		_first = newVal;
		_last = newVal;
	    }
	else
	    {
		newVal.setPrev(_last);
	        _last.setNext(newVal);

		_last = newVal;
	    }

	_size += 1;
    }

    //Returns the element at the front of Deque if one exists
    //If empty, return null
    public E peekFirst()
    {
	if (_size == 0)
	    return null;

	return _first.getCargo();
    }

    //Returns the element at the back of Deque if one exists
    //If empty, return null
    public E peekLast()
    {
	if (_size == 0)
	    return null;

	return _last.getCargo();
    }
    ////////////////////////////////////////
    //-----------^ CORE METHODS ^-----------
    ////////////////////////////////////////

    
    ///////////////////////////////////////////////////////
    //-----------v PHASE TWO EXCEPTION METHODS v-----------
    ///////////////////////////////////////////////////////

    //Removes the element at the front of Deque if one exists
    //Returns the removed element
    //If empty, return null
    public E pollFirst()
    {
	if (_size == 0)
	    return null;

	E temp = _first.getCargo();

	_first = _first.getNext();

	if (_size > 1)
	    _first.setPrev(null);
	
	_size -= 1;
	return temp;
    }

    //Removes the element at the end of Deque if one exists
    //Returns the removed element
    //If empty, return null
    public E pollLast()
    {
	if (_size == 0)
	    return null;

	E temp = _last.getCargo();

	_last = _last.getPrev();

	if (_size > 1)
	    _last.setNext(null);
	
	_size -= 1;
	return temp;
    }

    //Same function as pollFirst(), but throws an exception if the Deque is empty
    public E removeFirst()
    {
	if (_size == 0)
	    throw new NoSuchElementException();

	return pollFirst();
    }
    
    //Same function as pollLast(), but throws an exception if the Deque is empty
    public E removeLast()
    {
	if (_size == 0)
	    throw new NoSuchElementException();

	return pollLast();
    }

    //Same function as peekFirst(), but throws an exception if the Deque is empty
    public E getFirst()
    {
	if (_size == 0)
	    throw new NoSuchElementException();

	return peekFirst();
    }

    //Same function as peekLast(), but throws an exception if the Deque is empty
    public E getLast()
    {
	if (_size == 0)
	    throw new NoSuchElementException();

	return peekLast();
    }
    ///////////////////////////////////////////////////////
    //-----------^ PHASE TWO EXCEPTION METHODS ^-----------
    ///////////////////////////////////////////////////////
    

    /////////////////////////////////////////////////
    //-----------v ENCAPSULATING METHODS v-----------
    /////////////////////////////////////////////////
    public void add(E val) {addLast(val);} //Adds value to end of Deque
    public E remove() {return removeFirst();} //Same function as removeFirst()
    public E poll() {return pollFirst();} //Same function as pollFirst()
    public E element() {return getFirst();} //Same function as getFirst()
    public E peek() {return peekFirst();} //Same function as peekFirst()

    public void push(E val) {addFirst(val);} //Same function as addFirst()
    public E pop() {return removeFirst();} //Same function as removeFirst()
    /////////////////////////////////////////////////
    //-----------v ENCAPSULATING METHODS v-----------
    /////////////////////////////////////////////////


    /////////////////////////////////////////////////
    //-----------v EXTRA METHODS v-----------
    /////////////////////////////////////////////////
    
    //Removes the first occurrence of val, and return true
    //Returns false if the Deque is empty
    public boolean removeFirstOccurrence(E val)
    {
	if (_size == 0)
	    return false;
	else if (val.equals(_first.getCargo()))
	    removeFirst();
	else
	    {
		DLLNode<E> temp = _first;
		while (temp != _last)
		    {
			temp = temp.getNext();
			if (temp.getCargo().equals(val))
			    break;
		    }
		
		if (temp != _last)
		    removeMid(temp);
		else if (temp.getCargo().equals(val))
		    removeLast();
		else
		    return false;
		    
	    }
	return true;
    }

    //Removes the last occurrence of val, and return true
    //REturns false if the Deque is empty
    public boolean removeLastOccurrence(E val)
    {
	if (_size == 0)
	    return false;
	else if (val.equals(_last.getCargo()))
	    removeLast();
	else
	    {
		DLLNode<E> temp = _last;
		while (temp != _first)
		    {
			temp = temp.getPrev();
			if (temp.getCargo().equals(val))
			    break;
		    }
		
		if (temp != _first)
		    removeMid(temp);
		else if (temp.getCargo().equals(val))
		    removeFirst();
		else
		    return false;
		    
	    }
	return true;
    }

    //Helper method for remove Last and First Occurrence
    //If the value is not head or a tail, then it removes it
    private E removeMid(DLLNode<E> n)
    {
	n.getNext().setPrev(n.getPrev());
	n.getPrev().setNext(n.getNext());

	_size -= 1;
	return n.getCargo();
    }
    /////////////////////////////////////////////////
    //-----------^ EXTRA METHODS ^-----------
    /////////////////////////////////////////////////
    public String toString()
    {
	String ret = "";
	DLLNode<E> temp = _first;
	
	for (int x = 0; x < _size; x++)
	    {
		ret += temp.toString() + " ";
		temp = temp.getNext();
	    }
	return ret;
    }
    
    public static void main(String[] args)
    {
    }
}
				   
