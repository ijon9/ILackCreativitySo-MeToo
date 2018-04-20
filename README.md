# Team I Lack Creativity So... (Me Too)
## T. Fabiha, Nadine Jackson, Isaac Jon

# Plan:
### Underlying container: doubly-linked nodes
With doubly-linked nodes, all our runtimes for adding, removing, and getting will be constant time. We have already seen in class that singularly-linked nodes proved to be more efficient that ArrayLists when we were implementing the Queue interface. However, that only goes one way. With singularly-linked nodes we cannot move directly from the pointer at the last node to the node right before it. We must traverse through all the nodes from the first node to get to it. If we implemented singularly-linked nodes, this would be a problem for the runtime of removeLast(). We would get a linear runtime. A doubly-linked node allows us to have a direct access to the node before the last node, which means removeLast() would be constant runtime. Although the implementation for doubly-linked nodes will be slightly more complex than that of singularly-linked nodes, it will be worth the effort for the minimal runtime we will achieve after implmentation.  

# To-Do List:
## 1. Implement core methods
Since DLLNodes have two equally accessible ends, performing actions on the front and the end of the Deque should be similar.
### addFirst() and addLast() will be almost the same as the add method in LLQueue()
### pollFirst() and pollLast() will be almost the same as the remove() method in LLQueue()
### peekFirst() and peekLast() will just return the private instance variables _first and _last, respectively, 

## 2. Implement exception handling in the methods that are stated to handle exceptions.

## 3. If time left, add other methods, which all perform similar actions to the methods already written.

## 3a. Implement the exceptions in the add method of Deque, which are the ClassCastException and the NullPointerException 

# Core Methods in Deque:
### addFirst()
### addLast()
### pollFirst()
### pollLast()
### peekFirst()
### peekLast()
### size()

