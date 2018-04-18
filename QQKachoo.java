public class QQKachoo<E> implements Deque<E>
{
    private DLLNode _head;
    private DLLNode _tail;
    private int _size;

    public QQKachoo()
    {
	_head = null;
	_tail = null;
	_size = 0;
    }

    public void addFirst()
    {
	
    }

    public String toString()
    {
	String ret = "";
	DLLNode temp = _head;
	
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
				   
