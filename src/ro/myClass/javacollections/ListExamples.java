package ro.myClass.javacollections;

import ro.myClass.models.Masina;

import java.util.*;

public class ListExamples {


    public  static  void ex1(){


        List<Masina>  listaMasini= new ArrayList<>();

        Masina masina = new Masina("Andrei","BMW",2008,"motorina");
        Masina masina1 = new Masina("Flavius","Audi",2009,"bezina");
        Masina masina2 = new Masina("Alex","Mercedes",2013,"benzina");
        Masina masina3 = new Masina("Ionut","Volvo",2007,"benzina");
        Masina masina4 = new Masina("Catalin","Dacia",2011,"benzina");
        listaMasini.add(masina);
        listaMasini.add(masina1);
        listaMasini.add(masina2);
        listaMasini.add(masina3);
        listaMasini.add(masina4);


        Iterator<Masina> masinaIterator=listaMasini.iterator();


        while (masinaIterator.hasNext()){

            Masina m = masinaIterator.next();


            System.out.println(m);
        }





    }

    public static void ex2(){

        List<Masina>  listaMasini= new ArrayList<>();

        Masina masina = new Masina("Andrei","BMW",2008,"motorina");
        Masina masina1 = new Masina("Flavius","Audi",2009,"bezina");
        Masina masina2 = new Masina("Alex","Mercedes",2013,"benzina");
        Masina masina3 = new Masina("Ionut","Volvo",2007,"benzina");
        Masina masina4 = new Masina("Catalin","Dacia",2011,"benzina");
        listaMasini.add(masina);
        listaMasini.add(masina1);
        listaMasini.add(masina2);
        listaMasini.add(masina3);
        listaMasini.add(masina4);

        Iterator<Masina> masinaIterator = listaMasini.listIterator();
        int an = 100;
        boolean flag = true;
        Masina n = new Masina("aa","aa",1,"aa");
        while(masinaIterator.hasNext()  ){
            Masina m= masinaIterator.next();
           if(m.getAn() > an){
               an = m.getAn();
               n = m;
           }

        }

        System.out.println(n);


    }
}
