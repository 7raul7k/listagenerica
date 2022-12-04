package ro.myClass.javacollections;

import ro.myClass.models.Masina;

import java.util.ArrayDeque;
import java.util.*;




public class QueueExamples {

    public static void ex1(){

        Queue<Masina> masinaQueue = new ArrayDeque<>();

        Masina car = new Masina("Alin","Honda",2009,"benzina");
        Masina car1 = new Masina("Ionut","BMW",2007,"motorina");
        Masina car2 = new Masina("Marius","Opel",2012,"benzina");
        Masina car3 = new Masina("Alex","Volvo",2010,"motorina");
        Masina car4 = new Masina("Rares","Mercedes",2015,"hibrid");

        masinaQueue.add(car);
        masinaQueue.add(car1);
        masinaQueue.add(car2);
        masinaQueue.add(car3);
        masinaQueue.add(car4);


        Iterator<Masina> masinaIterator = masinaQueue.iterator();

        while(masinaIterator.hasNext()){
            Masina m = masinaIterator.next();

            System.out.println(m);
        }
    }

    public static void ex2(){
        String text ="Ana are mere!";

        ArrayDeque<Character> queue = new ArrayDeque<>();

        for(int i = 0; i < text.length();i++){
            char aux = text.charAt(i);
                 queue.push(aux);
        }

        String ct = "";

        while(!queue.isEmpty()){
            ct += queue.getFirst();
            queue.pop();
        }

        System.out.println(ct);


    }
}

