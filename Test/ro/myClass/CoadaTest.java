package ro.myClass;

import org.junit.Test;
import ro.myClass.models.Student;
import ro.myClass.structuri_generice.Coada;

import static org.junit.Assert.assertEquals;

public class CoadaTest {

    @Test
    public void enQueue(){
        Coada<Student> coada = new Coada<>();
        Student student1 = new Student("Campeanu","Robert",21,6.80,2);
        Student student2 = new Student("Florescu","Narcis",24,9,3);
        Student student3 = new Student("Dumitrescu","Rares",21,7.68,2);
        Student student4 = new Student("Andrei","Stefan",19,8.20,1);
      coada.enQueue(student1);
      coada.enQueue(student2);
      coada.enQueue(student3);
      coada.enQueue(student4);
    }
    @Test
    public void deQueue(){
        Coada<Student> coada = new Coada<>();
        Student student1 = new Student("Campeanu","Robert",21,6.80,2);
        Student student2 = new Student("Florescu","Narcis",24,9,3);
        Student student3 = new Student("Dumitrescu","Rares",21,7.68,2);
        Student student4 = new Student("Andrei","Stefan",19,8.20,1);
        coada.enQueue(student1);
        coada.enQueue(student2);
        coada.enQueue(student3);
        coada.enQueue(student4);

        coada.deQueue();

    }
    @Test
    public void peek(){
        Coada<Student> coada = new Coada<>();
        Student student1 = new Student("Campeanu","Robert",21,6.80,2);
        Student student2 = new Student("Florescu","Narcis",24,9,3);
        Student student3 = new Student("Dumitrescu","Rares",21,7.68,2);
        Student student4 = new Student("Andrei","Stefan",19,8.20,1);
        coada.enQueue(student1);
        coada.enQueue(student2);
        coada.enQueue(student3);
        coada.enQueue(student4);

        System.out.println(coada.peek().getData());
    }
}
