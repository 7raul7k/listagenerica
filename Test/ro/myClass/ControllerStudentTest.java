package ro.myClass;

import org.junit.Test;
import ro.myClass.controllers.ControllerStudent;
import ro.myClass.models.Student;
import ro.myClass.structuri_generice.Node;

import static org.junit.Assert.assertEquals;

public class ControllerStudentTest {
    @Test
    public void stergerePrimulNod(){
        ControllerStudent lista = new ControllerStudent();
        int size = lista.size();
        lista.stergerePrimulNod();
        assertEquals(size-1,lista.size());
    }
    @Test
    public void addNod(){
        ControllerStudent lista = new ControllerStudent();
        int size = lista.size();
        Student student = new Student("Popovici","Alin",23,8.90,2);
        lista.addNod(student);
        assertEquals(size+1,lista.size());
    }
    @Test
    public void addNodSfarsit(){
        ControllerStudent lista = new ControllerStudent();
        int size = lista.size();
        Student student = new Student("Popovici","Alin",23,8.90,2);
        lista.addNodSfarsit(student);
        assertEquals(size,lista.size());
    }
    @Test
    public void addNodeonPosition(){
        ControllerStudent lista = new ControllerStudent();
        int size = lista.size();
        Student student = new Student("Popovici","Alin",23,8.90,2);
        lista.addNodeOnPosition(student,3);
        assertEquals(true,lista.contains(student));
    }
    @Test
    public void stergereUltimulNod(){
        ControllerStudent lista = new ControllerStudent();
        int size = lista.size();
        lista.stergereUltimulNod();
        assertEquals(size-1,lista.size());
    }
    @Test
    public void stergereAnumitNod(){
        ControllerStudent lista = new ControllerStudent();
        int size = lista.size();
        lista.stergereAnumitNod(1);
        assertEquals(size-1,lista.size());
    }
    @Test
    public void contains(){
        ControllerStudent lista = new ControllerStudent();
        int size = lista.size();
        Student student = new Student("Popovici","Alin",23,8.90,2);
         lista.addNod(student);
         assertEquals(true,lista.contains(student));
    }
    @Test
    public void get(){
        ControllerStudent lista = new ControllerStudent();
        int size = lista.size();
        Student student = new Student("Popovici","Alin",23,8.90,2);
        lista.addNod(student);
        assertEquals(student,lista.get(0));
    }
    @Test
    public void set(){
        ControllerStudent lista = new ControllerStudent();
        int size = lista.size();
        Student student = new Student("Popovici","Alin",23,8.90,2);
        lista.set(student,1);
        assertEquals(student,lista.get(1));
    }
    @Test
    public void sortare(){
        ControllerStudent lista = new ControllerStudent();
        lista.sortare();
        assertEquals(true,lista.sortare());
    }
    @Test
    public void addPrimaPozitie(){
        ControllerStudent lista = new ControllerStudent();
        int size = lista.size();
        Student student = new Student("Popovici","Alin",23,8.90,2);
        lista.addPrimaPozitie(student);
        assertEquals(true,lista.contains(student));
    }
    @Test
    public void isEmpty(){
        ControllerStudent lista = new ControllerStudent();
        assertEquals(false,lista.isEmpty());
    }
    @Test
    public void gethead(){
        ControllerStudent lista = new ControllerStudent();
        Node node = lista.getHead();
        assertEquals(node,lista.getHead());
    }
    @Test
    public void afisare(){
        ControllerStudent lista = new ControllerStudent();
        assertEquals(true,lista.afisare());
    }


}
