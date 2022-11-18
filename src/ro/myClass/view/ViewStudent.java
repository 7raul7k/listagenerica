package ro.myClass.view;

import ro.myClass.controllers.*;
import ro.myClass.models.Student;
import ro.myClass.structuri_generice.*;

import java.util.Scanner;

public class ViewStudent {
    ControllerSetStudent controllerSetStudent;
    Scanner scanner;
    public ViewStudent(){
        this.controllerSetStudent = new ControllerSetStudent<>();
        this.scanner = new Scanner(System.in);
        this.play();
    }

    public void show(){
        System.out.println("Apasa 1 pentru a afisa studentii ");
        System.out.println("Apasa 2 pentru a adauga un student");

    }
    public void play(){
        boolean running = true;
        while(running){
            this.show();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1: controllerSetStudent.afisare();
                break;
                case 2: addStudent();
                break;
                case 3: stergeStudent();
                break;
                default : this.play();

            }
        }
    }
    public void addStudent(){
        System.out.println("Introduceti numele studentului");
        String nume = scanner.nextLine();
        System.out.println("Introduceti prenumele");
        String prenume = scanner.nextLine();
        System.out.println("Introduceti varsta");
        int varsta = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti media");
        double medie = Double.parseDouble(scanner.nextLine());
        System.out.println("Introduceti anul in care studiati");
        int an = Integer.parseInt(scanner.nextLine());
        Student student = new Student(nume,prenume,varsta,medie,an);
        this.controllerSetStudent.add(student);
    }
    public void stergeStudent(){

    }

}
