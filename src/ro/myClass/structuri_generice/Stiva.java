package ro.myClass.structuri_generice;

public class Stiva <U extends Comparable<U>>{
    Node<U> head = null;

    public void push(U obj) {
        if (head == null) {
            head = new Node<>();
            head.setNext(null);
            head.setData(obj);
        } else {
             Node<U> aux = new Node<>();
             aux.setData(obj);
             aux.setNext(head);
             head = aux;
         }
    }
    public Node<U> peek() {
      return head;
    }
    public void pop() {
        if (head == null) {
            System.out.println("Stiva este goala");
        } else {
            head = head.getNext();
        }
    }


    public boolean isEmpty(){

        return head==null;
    }


}
