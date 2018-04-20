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

    public void addFirst(E val)
    {
	DLLNode<E> newVal = new DLLNode<E>(val, null, null);

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
				   
