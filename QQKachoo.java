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
    public int size()
    {
	return _size;
    }
    
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

    public E peekFirst()
    {
	if (_size == 0)
	    return null;

	return _first.getCargo();
    }

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

    public E removeFirst()
    {
	if (_size == 0)
	    throw new NoSuchElementException();

	return pollFirst();
    }

    public E removeLast()
    {
	if (_size == 0)
	    throw new NoSuchElementException();

	return pollLast();
    }

    public E getFirst()
    {
	if (_size == 0)
	    throw new NoSuchElementException();

	return peekFirst();
    }
        
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
    public void add(E val) {addLast(val);}
    public E remove() {return removeFirst();}
    public E poll() {return pollFirst();}
    public E element() {return getFirst();}
    public E peek() {return peekFirst();}

    public void push(E val) {addFirst(val);}
    public E pop() {return removeFirst();}
    /////////////////////////////////////////////////
    //-----------v ENCAPSULATING METHODS v-----------
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
				   
