package ro.myClass.comparator;

import ro.myClass.models.Student;

import java.util.Comparator;

public class ComparatorPrenume implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getPrenume().compareTo(o2.getPrenume()) < 0) {
            return -1;
        } else if (o1.getPrenume().compareTo(o2.getPrenume())>0) {
            return 1;
        } else {
            return 0;

        }
    }
}
