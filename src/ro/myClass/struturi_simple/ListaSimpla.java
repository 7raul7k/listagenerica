package ro.myClass.struturi_simple;

import ro.myClass.structuri_generice.Node;
import ro.myClass.models.Student;

public class ListaSimpla {

    private Node head = null;

    public void addStart(Student student) {

        if (head == null) {
            head = new Node();
            head.setNext(null);
            head.setData(student);
        } else {
            Node node = new Node();
            head.getNext();
            node.setNext(head);
            node.setData(student);
            head = node;

        }

    }

    public void addNodSfarsit(Student student) {
        if (head == null) {
            head = new Node();
            head.setNext(null);
            head.setData(student);
        } else {

            //etapa1 gasim ultimul nod

            Node aux = head;
            while (aux.getNext() != null) {

                aux = aux.getNext();

            }

            Node nou = new Node();

            nou.setNext(null);
            nou.setData(student);

            aux.setNext(nou);
        }
    }

    //addPozitie
    public void addNodeonPosition(Student student, int pos) {

        if (head == null) {
            head = new Node();
            head.setNext(null);
            head.setData(null);
        }
        int ct = 0;
        Node aux = head;
        while (aux != null && ct != pos - 1) {

            aux = aux.getNext();
            ct++;

        }

        Node nou = new Node();
        nou.setData(student);
        nou.setNext(aux.getNext());
        aux.setNext(nou);

    }

    public Node getHead() {
        return head;
    }

    public void afisare() {

        Node aux = head;

        while (aux != null) {

            System.out.println(aux.getData());
            aux = aux.getNext();

        }

    }


    public void stergerePrimulNod() {

        if (head == null) {

            System.out.println("Nu exista nod");

        }

        head = head.getNext();


    }

    public void stergereultimaPozitie() {
        if (head == null) {
            System.out.println("Nu exista nod");
        } else {
            Node aux = head;

            while (aux.getNext().getNext() != null) {

                aux = aux.getNext();

            }

            aux.setNext(null);
        }

    }

    public void stergereNodAnumitaPozitie(int pos) {

        if (head == null) {

            System.out.println("Nu exista noduri");

        } else {
            Node aux = head;
            int ct = 0;
            while (aux != null && ct == pos - 1) {
                aux = aux.getNext();
                ct++;
            }
            aux.setNext(aux.getNext().getNext());
        }

    }


    public boolean contains(Student student) {

        Node aux = head;

        while (aux != null) {

            if (aux.getData().equals(student)) {

                return true;

            }

            aux = aux.getNext();


        }

        return false;

    }

    public boolean isEmpty() {

        if (head == null) {

            head = new Node();
            head.setNext(null);
            return true;

        } else {

            return false;

        }

    }

    public int size() {

        int size = 0;

        if (head == null) {

            head = new Node();
            head.setNext(null);

        }

        while (head != null) {

            size++;
            head = head.getNext();

        }

        return size;

    }

    public int indexOf(Student student) {

        Node aux = head;
        int ct = 0;

        while (aux!=null) {

            if (aux.getData().equals(student)) {

                return ct;

            }

                ct++;
                aux = aux.getNext();

        }

        return -1;

    }

    public Student get(int pos){

        Node aux = head;
        int ct = 0;

        while(aux!= null&&ct!=pos){

            ct++;
            aux = aux.getNext();

        }

        return (Student) aux.getData();

    }


}
