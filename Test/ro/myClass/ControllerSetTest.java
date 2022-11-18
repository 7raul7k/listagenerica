package ro.myClass;

import org.junit.Test;
import ro.myClass.comparator.ComparatorNumeStudent;
import ro.myClass.comparator.ComparatorPrenume;
import ro.myClass.controllers.ControllerSetStudent;
import ro.myClass.models.*;

import static org.junit.Assert.assertEquals;

public class ControllerSetTest {

    @Test
    public void size(){
        ControllerSetStudent set = new ControllerSetStudent<>();
        int size = set.size();
        Student student = new Student("Pietrosu","Stefan",22,6.40,2);
        set.add(student);
        assertEquals(size+1,set.size());

    }

    @Test
    public void add(){
        ControllerSetStudent set = new ControllerSetStudent<>();
        Student student = new Student("Iancu","Dragos",20,8.90,2);
        int size = set.size();
        set.add(student);
        assertEquals(size+1,set.size());
    }

    @Test
    public void delete(){
        ControllerSetStudent set = new ControllerSetStudent<>();
        Student student = new Student("Pietrosu","Stefan",22,6.40,2);
        Student student1 = new Student("Andrei","Ilie",21,8,1);
        set.add(student);
        set.add(student1);
        int size = set.size();
        set.delete(1);
        assertEquals(size-1,set.size());
    }

    @Test
    public void contains(){
        ControllerSetStudent set = new ControllerSetStudent<>();
        Student student = new Student("Pietrosu","Stefan",22,6.40,2);
        Student student1 = new Student("Andrei","Ilie",21,8,1);
        set.add(student);
        assertEquals(true,set.contains(student));
        assertEquals(false,set.contains(student1));

    }

    @Test
    public void isEmpty(){
        ControllerSetStudent set = new ControllerSetStudent<>();
        Student student = new Student("Pietrosu","Stefan",22,6.40,2);
        ControllerSetStudent<Masina> set2 = new ControllerSetStudent<>();
        set.add(student);
        assertEquals(false,set.isEmpty());
        assertEquals(true,set2.isEmpty());
    }

    @Test
    public void afisare(){
        ControllerSetStudent set = new ControllerSetStudent<>();
        Student student = new Student("Pietrosu","Stefan",22,6.40,2);
        Student student1 = new Student("Andrei","Ilie",21,8,1);
        set.add(student);
        set.add(student1);

        set.afisare();
    }

    @Test
    public void sortaredupacomparator(){
        ControllerSetStudent set = new ControllerSetStudent<>();
        Student student = new Student("Pietrosu","Stefan",22,6.40,2);
        Student student1 = new Student("Andrei","Ilie",21,8,1);
        set.add(student);
        set.add(student1);

        set.sortareDupaComparator(new ComparatorNumeStudent());

        set.afisare();

    }


}
