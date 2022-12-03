package ro.myClass.structuri_generice;

import ro.myClass.models.Student;

import java.util.Comparator;

public class Node<T> {

    private Node next=null;
    private T data=null;

    public Node() {
    }

    public Node(Node next, T data) {
        this.next = next;
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }



}
