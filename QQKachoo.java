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
	DLLNode<E> newVal = new DLLNode<E>(val, null _first);
	_first.setPrev(newVal);
	_first = newVal;
    }

    public String toString()
    {
	String ret = "";
	DLLNode<E> temp = _first;
	
	for (int x = 0; x < _size - 1; x++)
	    {
		ret += temp.toString();
		temp = temp.getNext();
	    }
	return ret;
    }

    
    public static void main(String[] args)
    {}
}
				   
