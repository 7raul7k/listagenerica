package ro.myClass.structuri_generice;

//-->elementele trebuie sa fie unice
//-->adaugate intro-anumita ordine

import ro.myClass.comparator.ComparatorNume;

public class Set<U extends Comparable<U>> {

    private Node<U> head = null;

    ComparatorNume<U> comparatorNume = new ComparatorNume<>();
    public boolean add(U obj) {

        if (head == null) {
            head = new Node<>();
            head.setNext(null);
            head.setData(obj);

        } else {
            Node<U> aux = head;

            Node<U> prev = aux;

            while (aux != null && aux.getData().compareTo(obj) < 0) {
                if (aux.getData().equals(obj)) {

                    return false;
                }
                prev = aux;
                aux = aux.getNext();
            }
            if (aux == null) {
                prev.setNext(new Node(null, obj));//il punem ultimu
            } else if (aux == head) {
                Node<U> nod = new Node<>();
                nod.setData(obj);
                nod.setNext(head);
                head=nod;//il punem primul
            } else {
                Node<U> node = new Node<>();
                node.setNext(aux);
                node.setData(obj);
                prev.setNext(node);//il punem  interior
            }

        }
        return true;
        }
    public void afisare(){
        Node<U> aux = head;
        while(aux !=null){
            System.out.println(aux.getData());
            aux = aux.getNext();
        }


    }

    public void delete(int pos ){
        if(head == null){
            head = new Node<>();
            head.setNext(null);
        }else{
            Node<U> aux = head;
            int ct = 0;
            while(aux!=null&&ct!=pos-1){
                ct++;
                aux= aux.getNext();
            }
            aux.setNext(aux.getNext().getNext());
        }
    }
    public boolean contains(U obj){
        if(head == null){
            System.out.println("Nu exista nod");
        }else{
            Node<U> aux = head;
            while(aux != null){
                if(aux.getData().equals(obj)){
                    return true;
                }
                aux = aux.getNext();
            }


        }
        return false;
    }
    public boolean isEmpty(){
        if(head == null){
        return true;
    }
        return false;
    }
    public int size(){
        Node<U> aux = head;
        int size = 0;
        while(aux!= null){
            size++;
            aux = aux.getNext();
        }
        return size;
    }
    

}
