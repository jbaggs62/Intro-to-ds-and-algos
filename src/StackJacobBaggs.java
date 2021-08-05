// Class:     	CS 5040
// Term:       Spring 2021
// Name:       Jacob Baggs
// Program Number: Assignment3 StackADT
// IDE : 	IntelliJ Idea Ultimate
public class StackJacobBaggs<E> {
    //Top node of the stack

    // make node
    public class Node<E> {
        E data;
        Node<E> next;
        Node(E element) {
            data=element;
            next=null;
        }
    }
    //set inital values
    private Node<E> head = null;
    private Node<E> tail= null;
    private int size=0;
    // push using tail as last value with special case if list is empty
    public E push(E element){
        Node<E> newNode = new Node<E>(element);
        if(tail == null){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = tail.next;
        }
        // increasing size of stack
        size++;
        return element;
    }
    // popping out the last value or Top since tail would be last we pop of tail then replace tail
    public  E pop() {
        //cannot pop empty stack
        if(size == 0) return null;
        //if exactly one pop head because head = tail
        if(size == 1) {
            Node<E> temp = head;
            head = tail = null;
            size=0;
            return temp.data;
        }
        // pop code if list is > 1
        Node<E> current = head;
        for (int i =0; i <size-2; i++)
            current = current.next;
        Node<E> temp = tail;
        tail.next = null;
        tail = current;
        size --;
        return temp.data;
    }
    // return the top value if the data the stack isn't empty calling the is empty function
    public E peek() {
        if (!isEmpty()) {
            return tail.data;
        }
        else {
            return null ;
        }
}
// building function to iterate through element to return first element
    public int search(E element){
        Node<E> current=head;
        for (int i=0; i<size; i++) {
            if (current.data.equals(element)){
                return i;
            }
            current=current.next;
        }
            return -1;
        }
// create method to iterate over stack and return the string value in stead of byte info
    public String to_string(){
        Node <E> temp = head;
        String  str = "[";
        for (int i =0; i<size;i++) {
            str += temp.data;
            temp =temp.next;
            if ( i < size-1)
                str += ", ";
        }
        return str + "]";
    }
    // return size of stack
    public int size() {
        return size;
    }
    // returns true if size = 0
    public boolean isEmpty() {
        return (size==0);
    }
}
