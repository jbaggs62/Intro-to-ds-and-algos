// Class:     	CS 5040
// Term:       Spring 2021
// Name:       Jacob Baggs
// Program Number: Assignment2 LinkedListGGGG
// IDE : 	IntelliJ Idea Ultimate

public class LinkedListJacobBaggs<E> {
        private int size = 0;
        private Node head = null;
        private Node tail = null;


        public class Node {
             E data;
            Node next;

            //Node constructor
            public Node(E element) {
                data = element;
                next = null;
            }

            //Node toString method to print Node element
            public String toString() {
                return String.valueOf(this.data);
            }
        }

        public void add(int index, E element) {
            if (index == 0) addFirst(element); // if zero elements we add to beginning
            else if (index >= size) addLast(element); // if index is zero then add the element  to the end
            else {
                Node current = head; // setting new cursor to beginning
                for (int i = 1; i < index; i++) // iterating over that process to specific index location
                    current = current.next; // setting current to next index
                Node temp = current.next; // setting temp to the value of that index
                current.next = new Node(element); // set the new node element to the value at the right index
                (current.next).next = temp; // setting the index of the new value to the one ahead of it
                size++;
            }
        }

        public void addFirst(E element) {
            Node newNode = new Node(element); // creates new node element
            newNode.next = head; // link the node to the head
            head = newNode; // connect head to the node
            size++; // increase size in increments of 1
            if (tail == null) // if then for when tail is null
                tail = head; // set tail = head if the list is exactly one value
        }

        public void addLast(E element) {
            Node newNode = new Node(element); // create new node using element
            if(tail == null){
                head = tail = newNode;
            }
            else {
                tail.next = newNode; // link the new node with the last node
                tail = tail.next;  // tail now points to the last note
            }
            size++; // increase size
        }

        public E getFirst() {
            if (size==0){
                return null;
            }
            else {
                return head.data;
            }
        }

        public E getLast() {
            if (size==0){
                return null;
            }
            else {
                return tail.data;
            }
        }

        public E remove(int index) {
            if(index < 0 || index >= size) {
                System.out.println("Index is out of range");
                return null;
            }
            else if (index == 0) return removeFirst();
            else if (index == size-1) return removeLast();
            else{
                Node previous = head;
                for (int i = 1; i < index; i++){
                    previous = previous.next;
                };
                Node current = previous.next;
                previous.next = current.next;
                size--;
                return current.data;
            }
        }

        public E removeFirst() {
            if (size == 0){
                System.out.println("This list is empty");
                return null;
            }       // cannot delete if nothing exist
            else {
                Node temp = head; // keep first node as temp value
                head = head.next; // move head to point to the next node
                size--; // reduce size by 1
                if (head == null) tail = null; // list is now empty
                return temp.data; // return the deleted element
            }
        }

        public E removeLast() {
            if (size == 0){
                System.out.println("This list is empty");
                return null;
            }   // cannot remove if nothing exist
            else if (size == 1) {
                Node temp = head;
                head = null;
                tail= null; // list is now empty
                size = 0;
                return temp.data;

            }
            else {
                Node current = head;
                for ( int i = 0 ; i < size - 2; i++)
                    current= current.next;
                Node temp = tail;
                tail = current;
                tail.next = null;
                size--;
                return temp.data;
            }
        }


        public int size() {
            if(size==0) {
                System.out.println("The size of the linked list is zero");
            }
                Node temp = head;
                int size = 0;
                if (size>0) {

                    while (temp.next != null) {
                        size++;
                        temp = temp.next;
                    }
                    size++;
                }
                return size;
        }

        public String toString() {
            Node temp = head;
            String str = "[";
            if(size>0) {
                while (temp.next != null) {
                    str = str + temp.data + ", ";
                    temp = temp.next;
                }

                str = str + temp.data;
            }
            return str + "]";
        }

}

