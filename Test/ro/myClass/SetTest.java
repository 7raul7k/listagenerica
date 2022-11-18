package ro.myClass;

import org.junit.Test;
import ro.myClass.comparator.ComparatorAnStudiu;
import ro.myClass.comparator.ComparatorNumeStudent;
import ro.myClass.comparator.ComparatorPrenume;
import ro.myClass.comparator.ComparatorVarsta;
import ro.myClass.models.Student;
import ro.myClass.structuri_generice.Set;

import static org.junit.Assert.assertEquals;

public class SetTest {


    @Test
    public void add(){
        Set<Student> set = new Set<>();
        Student student = new Student("Popescu","Marcel",23,6.80,3);
        Student student1 = new Student("Florian","Cristian",21,8.20,1);
        Student student2 = new Student("Cristescu","Marian",22,9,2);
        Student student3 = new Student("Andrei","Ionut",25,5.80,1);
        Student student4 = new Student("Tudor","Eduard",24,9.30,3);
        Student student5 = new Student("Zamfir","Dragos",26,6.50,4);
        set.add(student);
        set.add(student1);
        set.add(student2);
        set.add(student3);
        set.add(student4);
        set.add(student5);
        set.afisare();
    }

    @Test
    public void delete(){
        Set<Student> set = new Set<>();
        Student student = new Student("Popescu","Marcel",23,6.80,3);
        Student student1 = new Student("Florian","Cristian",21,8.20,1);
        Student student2 = new Student("Cristescu","Marian",22,9,2);
        Student student3 = new Student("Andrei","Ionut",25,5.80,1);
        Student student4 = new Student("Tudor","Eduard",24,9.30,3);
        Student student5 = new Student("Zamfir","Dragos",26,6.50,4);
        set.add(student);
        set.add(student1);
        set.add(student2);
        set.add(student3);
        set.add(student4);

        set.delete(3);

        set.afisare();

    }

    @Test
    public void isEmpty(){
        Set<Student> set = new Set<>();
        Student student = new Student("Popescu","Marcel",23,6.80,3);
        Student student1 = new Student("Florian","Cristian",21,8.20,1);
        Student student2 = new Student("Cristescu","Marian",22,9,2);
        Student student3 = new Student("Andrei","Ionut",25,5.80,1);
        Student student4 = new Student("Tudor","Eduard",24,9.30,3);
        Student student5 = new Student("Zamfir","Dragos",26,6.50,4);
        set.add(student);
        set.add(student1);
        set.add(student2);
        set.add(student3);
        set.add(student4);
        set.add(student5);
        Set<Student> set2 = new Set<>();
        assertEquals(false,set.isEmpty());
        assertEquals(true,set2.isEmpty());

    }

    @Test
    public void size(){
        Set<Student> set = new Set<>();
        Student student = new Student("Popescu","Marcel",23,6.80,3);
        Student student1 = new Student("Florian","Cristian",21,8.20,1);
        Student student2 = new Student("Cristescu","Marian",22,9,2);
        Student student3 = new Student("Andrei","Ionut",25,5.80,1);
        Student student4 = new Student("Tudor","Eduard",24,9.30,3);
        Student student5 = new Student("Zamfir","Dragos",26,6.50,4);
        set.add(student);
        set.add(student1);
        set.add(student2);
        set.add(student3);
        set.add(student4);
        int size = set.size();
        set.add(student5);
        assertEquals(size+1,set.size());
    }

    @Test
    public void contains(){
        Set<Student> set = new Set<>();
        Student student = new Student("Popescu","Marcel",23,6.80,3);
        Student student1 = new Student("Florian","Cristian",21,8.20,1);
        Student student2 = new Student("Cristescu","Marian",22,9,2);
        Student student3 = new Student("Andrei","Ionut",25,5.80,1);
        Student student4 = new Student("Tudor","Eduard",24,9.30,3);
        Student student5 = new Student("Zamfir","Dragos",26,6.50,4);
        set.add(student);
        set.add(student1);
        set.add(student2);
        set.add(student3);
        set.add(student4);
        set.add(student5);

        assertEquals(true,set.contains(student));
    }

    @Test
    public void afisare(){
        Set<Student> set = new Set<>();
        Student student = new Student("Popescu","Marcel",23,6.80,3);
        Student student1 = new Student("Florian","Cristian",21,8.20,1);
        Student student2 = new Student("Cristescu","Marian",22,9,2);
        Student student3 = new Student("Andrei","Ionut",25,5.80,1);
        Student student4 = new Student("Tudor","Eduard",24,9.30,3);
        set.add(student);
        set.add(student1);
        set.add(student2);
        set.add(student3);
        set.add(student4);

        set.afisare();
    }

    @Test
    public void sortareDupaComparator(){
        Set<Student> set = new Set<>();
        Student student = new Student("Popescu","Denis",20,6.80,3);
        Student student1 = new Student("Florian","Cristian",21,8.20,1);
        Student student2 = new Student("Cristescu","Marian",22,9,2);
        Student student3 = new Student("Andrei","Ionut",25,5.80,1);
        Student student4 = new Student("Tudor","Eduard",24,9.30,3);
        set.add(student);
        set.add(student1);
        set.add(student2);
        set.add(student3);
        set.add(student4);

        set.sortareDupaComparator(new ComparatorPrenume());

        set.afisare();

    }

    @Test
    public void set(){
        Set<Student> set = new Set<>();
        Student student = new Student("Popescu","Marcel",23,6.80,3);
        Student student1 = new Student("Florian","Cristian",21,8.20,1);
        Student student2 = new Student("Cristescu","Marian",22,9,2);
        Student student3 = new Student("Andrei","Ionut",25,5.80,1);
        Student student4 = new Student("Tudor","Eduard",24,9.30,3);
        set.add(student);
        set.add(student1);
        set.add(student2);
        set.add(student3);
        set.add(student4);
        Student student5 = new Student("Alin","Alin",20,9.10,1);
        set.set(4,student5);
        set.afisare();
    }

    @Test
    public void get(){
        Set<Student> set = new Set<>();
        Student student = new Student("Popescu","Marcel",23,6.80,3);
        Student student1 = new Student("Florian","Cristian",21,8.20,1);
        Student student2 = new Student("Cristescu","Marian",22,9,2);
        Student student3 = new Student("Andrei","Ionut",25,5.80,1);
        Student student4 = new Student("Tudor","Eduard",24,9.30,3);
        set.add(student);
        set.add(student1);
        set.add(student2);
        set.add(student3);
        set.add(student4);

        System.out.println(set.get(4));

    }

}
