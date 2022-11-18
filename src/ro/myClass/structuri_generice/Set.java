package ro.myClass.structuri_generice;

//-->elementele trebuie sa fie unice
//-->adaugate intro-anumita ordine

import java.util.Comparator;

public class Set<U extends Comparable<U>> {

    private Node<U> head = null;

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

    public void set(int pos,U data) {
            Node<U> aux = head;
            int ct = 0;
            while (aux != null && ct != pos) {
                ct++;
                aux = aux.getNext();
            }
            aux.setData(data);
    }
    public U get(int pos){
        Node<U> aux = head;
        int ct = 0;
        while(aux!= null&& ct!= pos){
            ct++;
            aux = aux.getNext();
        }

        return aux.getData();
    }
    public void sortareDupaComparator(Comparator comparator){
        boolean flag = false;
        do{
            flag = false;
            for(int i = 0;i < this.size() - 1 ;i++){
                if(comparator.compare(this.get(i),this.get(i+1))>0) {
                    U data = this.get(i);
                    this.set(i,this.get(i+1));
                    this.set(i+1,data);
                    flag = true;
                }
            }
        }while(flag==true);
    }
}