package ro.myClass.structuri_generice;

import ro.myClass.models.Student;

public class ListaGenerica<U extends Comparable<U> >{


    private  Node<U> head=null;



    public void addStart(U obj) {

        if (head == null) {
            head = new Node<>();
            head.setNext(null);
            head.setData(obj);

        } else {

            Node<U> aux = new Node();
          aux.setNext(head);
          aux.setData(obj);
          head=aux;
        }
    }

    public void afisare(){

        Node<U>aux=head;
            while(aux!=null){
                System.out.println(aux.getData());
                aux = aux.getNext();

        }

    }

    public void addNodSfarsit(U obj) {
        if (head == null) {
            head = new Node<U>();
            head.setNext(null);
            head.setData(obj);
        } else {
            Node<U> aux = head;
            while (aux.getNext().getNext() != null) {
                aux = aux.getNext();
            }
            Node<U> nou = new Node();
           nou.setNext(null);
           nou.setData(obj);
           aux.setNext(nou);
        }
    }

    public void addNodeonPosition(U obj,int pos){
        if(head == null){
            head = new Node<U>();
            head.setNext(null);
        }else{
            Node<U> aux = head;
            int ct = 0;
            while(aux!= null && ct!= pos-1){
                aux = aux.getNext();
                ct++;
            }
            Node<U> nou = new Node();
            nou.setNext(null);
            nou.setData(obj);
            aux.setNext(nou);
        }
        }
    public void addPrimaPozitie(U obj){
        if(head == null){
            head = new Node<>();
            head.setData(obj);
            head.setNext(null);
        }else {
            Node<U> aux = new Node<>();
            aux.setNext(head.getNext());
            aux.setData(obj);
            head = aux;
        }
    }
    public Node getHead(){
        return head;
    }
    public void stergerePrimulNod(){
        if(head == null){
            System.out.println("Nu exista nod");
        }else{

            head = head.getNext();
        }

    }
    public void stergereUltimaPozitie(){
        if(head == null){
            System.out.println("Nu exista nod");
        }else{
            Node<U> aux = head;
            while(aux.getNext().getNext()!=null){
                aux = aux.getNext();
            }
            aux.setNext(null);
        }
    }
    public void stergereNodAnumitaPozitie(int pos){
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
    public U get(int pos){
        Node<U> aux = head;
        int ct = 0;

        while(aux !=null&&ct!=pos){
            ct++;
            aux = aux.getNext();
        }
        return aux.getData();

    }

    public void set(U obj,int pos){
        Node<U> aux = head;
        int ct= 0;
        while(aux!= null && ct!=pos){
            ct++;
            aux = aux.getNext();
        }
        aux.setData(obj);
    }

    public boolean sortare() {
        boolean flag = true;
        do {
            flag = true;
            for (int i = 0; i < this.size() - 1; i++) {

                if (this.get(i).compareTo(this.get(i + 1)) > 0) {
                    U nod = this.get(i);
                    this.set(this.get(i + 1), i);
                    this.set(nod, i + 1);

                    flag = false;
                }
            }
        }  while (flag == false) ;
        return true;
    }

    public U celMaiMareElement(){
       Node<U> aux = new Node<>();
       aux.setNext(null);
        boolean flag = this.sortare();

        do{

            for(int i  = 0 ; i < this.size()-1 ;i++){

                if(this.get(i).compareTo(this.get(i+1))>0){

                    U x = this.get(i);
                    aux.setData(x);
                    flag = true;

                }  if (this.get(i).compareTo(this.get(i+1))<0) {

                    U x = this.get(i+1);
                    aux.setData(x);
                    flag = true;

                }

            }


        }while(flag != true);

   return aux.getData();

    }



}
