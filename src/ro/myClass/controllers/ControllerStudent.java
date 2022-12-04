package ro.myClass.controllers;

import ro.myClass.models.*;
import ro.myClass.structuri_generice.ListaGenerica;
import ro.myClass.structuri_generice.Node;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class ControllerStudent {
    ListaGenerica<Student> studentList;

    public ControllerStudent(){

        this.studentList = new ListaGenerica<>();
        this.load();

    }
  public void load(){

        try{
            File file = new File("C:\\mycode\\JavaBasics\\Collections\\Collections\\src\\ro\\myClass\\resources\\students.txt");
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()){

                this.studentList.addStart(new Student(scanner.nextLine()));


            }

        }catch (Exception e){

            e.printStackTrace();

        }

  }

  public void addNod(Student student) {
      boolean flag = contains(student);
      if (flag == false) {
          studentList.addStart(student);
      }
  }

  public boolean afisare(){

       studentList.afisare();
        return true;

  }

  public void stergerePrimulNod(){
       studentList.stergerePrimulNod();
  }

  public void stergereUltimulNod(){
        studentList.stergereUltimaPozitie();
  }

  public void stergereAnumitNod(int pos){
        studentList.stergereNodAnumitaPozitie(pos);

  }

  public void addNodSfarsit(Student student) {

      boolean flag = contains(student);

      if (flag == false) {
          studentList.addNodSfarsit(student);

      }

  }

  public void addNodeOnPosition(Student student,int pos){
        boolean flag = contains(student);
        if(flag == false){
         studentList.addNodeonPosition(student, pos);
      }
  }

  public Node getHead(){
        return studentList.getHead();
  }

  public boolean contains(Student student){
        return studentList.contains(student);
  }

      public boolean isEmpty(){
        return studentList.isEmpty();
  }

  public int size(){
      return  studentList.size();
  }

  public Student get(int pos){
        return studentList.get(pos);
  }
  public void addPrimaPozitie(Student student){
        studentList.addPrimaPozitie(student);
  }
  public void set(Student student,int pos){
       studentList.set(student,pos);
  }
  public boolean sortare(){
        return studentList.sortare();

  }
    public void save(){
        try{
            File file = new File("C:\\mycode\\JavaBasics\\Collections\\Collections\\src\\ro\\myClass\\resources\\students.txt");
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(this);
            printWriter.flush();
            printWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
