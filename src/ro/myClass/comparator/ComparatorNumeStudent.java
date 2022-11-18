package ro.myClass.comparator;

import ro.myClass.models.Student;

import java.util.Comparator;

public class ComparatorNumeStudent implements Comparator<Student> {

    public int compare(Student o1,Student o2){
         if(o1.getNume().equals(o2.getPrenume())){
             return 0;
         }else if(o1.getNume().charAt(0) > o2.getNume().charAt(0)){
             return 1;
         }else{
             return -1;
         }

    }

}
