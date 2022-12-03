package ro.myClass.view;

import ro.myClass.controllers.*;
import ro.myClass.models.Student;

import java.util.Scanner;

public class ViewLogin {

    private ControllerStudent controllerStudent;

    public Scanner scanner = new Scanner(System.in);

    public ViewLogin(){
        this.controllerStudent = new ControllerStudent();
    }

    public void show(){
        System.out.println("Apasati 1 pentru a va inregistra");
        System.out.println("Apasati 2 pentru a va loga");
    }

    public void play(){
        boolean running = true;
        while(running){
            this.show();
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1 : register();
                break;
                case 2 : login();
                 break;
            }
        }
    }

    public void register(){
        System.out.println("Introduceti numele");
        String nume = scanner.nextLine();
        System.out.println("Introduceti prenumele");
        String prenume = scanner.nextLine();
        System.out.println("Introduceti varsta");
        int varsta = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti media");
        double medie = Double.parseDouble(scanner.nextLine());
        System.out.println("Introduceti anul de studiu");
        int anStudiu = Integer.parseInt(scanner.nextLine());
        Student student = new Student(nume,prenume,varsta,medie,anStudiu);
        this.controllerStudent.addNod(student);
    }

    public void login(){
        System.out.println("Introduceti emailul");
        String email = scanner.nextLine();
        System.out.println("Introduceti parola");
        String password = scanner.nextLine();
    }

}
