package com.qniyaz.mycalc;

public class Stack<T> {
    private int size = 0;
    private Node<T> root = null;


    /*
    * It has to return the size of the NodeList
    *
    * @return size
    */
    public int size() {
        return size;
    }
    // add an element to the stack
    public void push(T item) {
        Node<T> oldfirst = root;
        root = new Node<T>(item, oldfirst);
        size++;
    }
    // delete and return the most recently added element
    public T pop() {
        if (isEmpty()) throw new RuntimeException("Stack underflow");
        T item = root.getData();      // save item to return
        root = root.getNext();            // delete first node
        size--;
        return item;                   // return the saved item
    }
    // is the stack empty?
    public boolean isEmpty() { return root == null; }

    // delete and return the most recently added element
    public T peek() {
        if (isEmpty()) throw new RuntimeException("Stack underflow");
        T item = root.getData();      // save item to return
        return item;                   // return the saved item
    }

    //Node Class
    static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        public Node(T data, Node<T> next){
            this.data = data;
            this.next = next;
        }
        public T getData() {
            return data;
        }
        public void setData(T data) {
            this.data = data;
        }
        public String toString() {
            return "Data: "+ data.toString();
        }
        public Node<T> getNext() {
            return next;
        }
        public void setNext(Node<T> next) {
            this.next = next;
        }
    }

}