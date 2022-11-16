package ro.myClass.comparator;

import ro.myClass.models.Student;

import java.util.Comparator;

public class ComparatorNume<U extends Comparable<U>>{

    public int compare(U o1, U o2) {
     if(o1.compareTo(o2) < 0 ){
         return -1;
     }else if(o1.compareTo(o2) > 0){
         return 1;
     }
     return 0;
    }
}

