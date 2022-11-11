package ro.myClass.structuri_generice;

public class Coada <U extends Comparable<U>>{
    Node<U> coada = null;
    Node<U> head = null;

    public boolean enQueue(U obj){
        if(head == null){
            head = new Node<>();
            head.setNext(null);
            head.setData(obj);
        }else{
            Node<U> aux = new Node<>();
            aux.setData(obj);
            aux.setNext(head);
            head = aux;
            coada = aux;
            return true;
        }
        return false;

    }
    public  Node<U> deQueue(){
        if(head == null){
           return null;
        }else{
            Node<U>aux=head;
         head=head.getNext();
         return aux;
        }


    }
    public  Node<U> peek(){
        Node<U> aux = head;
        while(aux!= null && aux.getNext()!=null){
            aux = aux.getNext();
        }
        return aux;
    }
    public Node<U> getCoada(){

    return coada;
  }
  public Node<U> getHead(){
        return head;
  }
  public boolean isEmpty(){
        return head==null;
  }



}
