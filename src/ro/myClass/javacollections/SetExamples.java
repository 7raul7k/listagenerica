package ro.myClass.javacollections;

import ro.myClass.comparator.ComparatorAnMasina;
import ro.myClass.models.Masina;

import java.util.*;

public class SetExamples {

    public static void ex1(){
        LinkedHashSet<Masina> masinaLinkedHashSet = new LinkedHashSet<>();

        Masina car = new Masina("Alin","Honda",2009,"benzina");
        Masina car1 = new Masina("Ionut","BMW",2007,"motorina");
        Masina car2 = new Masina("Marius","Opel",2012,"benzina");
        Masina car3 = new Masina("Alex","Volvo",2010,"motorina");
        Masina car4 = new Masina("Rares","Mercedes",2015,"hibrid");

        masinaLinkedHashSet.add(car);
        masinaLinkedHashSet.add(car1);
        masinaLinkedHashSet.add(car2);
        masinaLinkedHashSet.add(car3);
        masinaLinkedHashSet.add(car4);


        Iterator<Masina> masinaIterator = masinaLinkedHashSet.iterator();

        while (masinaIterator.hasNext()){
            Masina m = masinaIterator.next();

            System.out.println(m);
        }


    }

    public static void ex2(){
        Set<Masina> treeSet = new TreeSet(new ComparatorAnMasina());

        Masina car = new Masina("Alin","Honda",2009,"benzina");
        Masina car1 = new Masina("Ionut","BMW",2007,"motorina");
        Masina car2 = new Masina("Marius","Opel",2012,"benzina");
        Masina car3 = new Masina("Alex","Volvo",2010,"motorina");
        Masina car4 = new Masina("Rares","Mercedes",2015,"hibrid");

        treeSet.add(car);
        treeSet.add(car1);
        treeSet.add(car2);
        treeSet.add(car3);
        treeSet.add(car4);


        Iterator<Masina> masinaIterator = treeSet.iterator();


        while (masinaIterator.hasNext()){

            Masina m  = masinaIterator.next();
            System.out.println(m);
        }
    }

}
