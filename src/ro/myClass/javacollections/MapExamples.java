package ro.myClass.javacollections;

import ro.myClass.models.*;
import ro.myClass.structuri_generice.Entry;
import ro.myClass.structuri_generice.Set;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExamples {

    public static void ex1() {
        HashMap<String, Masina> masinaMap = new HashMap<>();

        Masina car = new Masina("Alin", "Honda", 2009, "benzina");
        Masina car1 = new Masina("Ionut", "BMW", 2007, "motorina");
        Masina car2 = new Masina("Marius", "Opel", 2012, "benzina");
        Masina car3 = new Masina("Alex", "Volvo", 2010, "motorina");
        Masina car4 = new Masina("Rares", "Mercedes", 2015, "hibrid");

        masinaMap.put("Alin", car);
        masinaMap.put("Ionut", car1);
        masinaMap.put("Marius", car2);
        masinaMap.put("Alex", car3);
        masinaMap.put("Rares", car4);


        Iterator<Masina> iterator = masinaMap.values().iterator();

        while (iterator.hasNext()) {
            Masina m = iterator.next();
            System.out.println(m);
        }


    }

    public static void ex2() {
        HashMap<String, Masina> masinaMap = new HashMap<>();

        Masina car = new Masina("Alin", "Honda", 2009, "benzina");
        Masina car1 = new Masina("Ionut", "BMW", 2007, "motorina");
        Masina car2 = new Masina("Marius", "Opel", 2012, "benzina");
        Masina car3 = new Masina("Alex", "Volvo", 2010, "motorina");
        Masina car4 = new Masina("Rares", "Mercedes", 2015, "hibrid");

        masinaMap.put("Alin", car);
        masinaMap.put("Ionut", car1);
        masinaMap.put("Marius", car2);
        masinaMap.put("Alex", car3);
        masinaMap.put("Rares", car4);

        System.out.println(masinaMap.get("Alex"));

    }

    public static void ex3() {
        HashMap<String, Student> hashMap = new HashMap<>();

        Student student = new Student("Popescu", "Alin", 23, 6.90, 3);
        Student student1 = new Student("Dumitrescu", "Dragos", 21, 8.10, 1);
        Student student2 = new Student("Andrei", "Ionut", 20, 7.30, 2);
        Student student3 = new Student("Ionescu", "Cristian", 22, 9.02, 2);
        Student student4 = new Student("Filip", "Marian", 24, 8.45, 1);

        hashMap.put("Alin", student);
        hashMap.put("Dragos", student1);
        hashMap.put("Ionut", student2);
        hashMap.put("Cristian", student3);
        hashMap.put("Marian", student4);

        for(String key : hashMap.keySet()){
            System.out.println(key);
        }

    }

    public static void ex4(){

        HashMap<String, Student> hashMap = new HashMap<>();

        Student student = new Student("Popescu", "Alin", 23, 6.90, 3);
        Student student1 = new Student("Dumitrescu", "Dragos", 21, 8.10, 1);
        Student student2 = new Student("Andrei", "Ionut", 20, 7.30, 2);
        Student student3 = new Student("Ionescu", "Cristian", 22, 9.02, 2);
        Student student4 = new Student("Filip", "Marian", 24, 8.45, 1);

        hashMap.put("Alin", student);
        hashMap.put("Dragos", student1);
        hashMap.put("Ionut", student2);
        hashMap.put("Cristian", student3);
        hashMap.put("Marian", student4);

        for(Student m : hashMap.values()){
            System.out.println(m);
        }
    }

    public static void ex5(){
        HashMap<String, Student> hashMap = new HashMap<>();

        Student student = new Student("Popescu", "Alin", 23, 6.90, 3);
        Student student1 = new Student("Dumitrescu", "Dragos", 21, 8.10, 1);
        Student student2 = new Student("Andrei", "Ionut", 20, 7.30, 2);
        Student student3 = new Student("Ionescu", "Cristian", 22, 9.02, 2);
        Student student4 = new Student("Filip", "Marian", 24, 8.45, 1);

        hashMap.put("Alin", student);
        hashMap.put("Dragos", student1);
        hashMap.put("Ionut", student2);
        hashMap.put("Cristian", student3);
        hashMap.put("Marian", student4);

        for(Map.Entry<String,Student> entry : hashMap.entrySet()){
            System.out.println("key: " + entry.getKey() + "   " + " value: " + entry.getValue());
        }

    }
}
