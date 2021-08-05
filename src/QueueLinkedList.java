public class QueueLinkedList {

	private Node first;
	private Node last;
	private int size;
	
	public QueueLinkedList(){
		first = null;
		last = null;
		size = 0;
	}
	
    private class Node{
        private Object data;
        private Node next;
        
        public Node(Object input) {
            this.data = input;
            this.next = null;
        }
        public String toString(){
            return String.valueOf(this.data);
        }
    }
    
    public boolean isEmpty() {
    	return size == 0;
    }
    
    public Object dequeue() throws QueueException{
    	if(isEmpty()) {
    		throw new QueueException("Queue is Empty");
    	}
    	else {
    		Node current = first;
    		first = first.next;
    		size--;
    		return current.data;
    	}
    }
    
    public Object front() throws QueueException{
    	if(isEmpty()) {
    		throw new QueueException("Queue is Empty");
    	}
    	else {
    		return first.data;
    	}
    }
    
    public void enqueue(Object item) throws QueueException{
    	
    	Node newNode = new Node(item);
    	if(isEmpty())
    	{
    		first = newNode;
    		last = newNode;
    	}
    	else {
    		last.next = newNode;
    		last = newNode;
    	}
    	size++;
    }
    
    public String toString() {
    	String str = "[";
    	Node current = first;
    	
    	if(first != null)
    	{
	    	while(current.next!=null) {
	    		str = str + current.data + ", ";
	    		current = current.next;
	    	}
	    	str = str + current.data;
    	}
    	return str + "]";
    }
	
}
