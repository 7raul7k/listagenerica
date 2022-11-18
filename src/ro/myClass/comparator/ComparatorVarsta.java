package ro.myClass.comparator;

import ro.myClass.models.Student;

import java.util.Comparator;

public class ComparatorVarsta implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getVarsta() < o2.getVarsta() ){
            return -1;
        }else if(o1.getVarsta() > o2.getVarsta()){
            return 1;
        }
            return 0;
    }
}
