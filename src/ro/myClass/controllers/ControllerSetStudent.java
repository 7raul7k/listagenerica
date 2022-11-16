package ro.myClass.controllers;

import ro.myClass.models.Student;
import ro.myClass.structuri_generice.Set;

import java.io.File;
import java.util.Scanner;

public class ControllerSetStudent<U extends Comparable<U>> {

    Set<Student> set;

    public ControllerSetStudent(){
        this.set = new Set<>();
        this.load();
    }

   public void load(){
       try{
           File file = new File("C:\\mycode\\JavaBasics\\Collections\\Collections\\src\\ro\\myClass\\resources\\students.txt");
           Scanner scanner = new Scanner(file);
           while(scanner.hasNextLine()){
               this.set.add(new Student(scanner.nextLine()));
           }
       }catch (Exception e){
           e.printStackTrace();
       }
   }
   public void add(Student obj){
            this.set.add(obj);
   }
   public void delete(int pos){
        this.set.delete(pos);
   }

   public boolean contains(Student obj){
       return this.set.contains(obj);
   }

   public int size(){
        return this.set.size();
   }

   public boolean isEmpty(){
        return this.set.isEmpty();
   }

   public void afisare(){
        this.set.afisare();
   }

}
