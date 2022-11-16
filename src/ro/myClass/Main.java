package ro.myClass;

import ro.myClass.controllers.ControllerStudent;
import ro.myClass.models.Student;
import ro.myClass.view.ViewMasina;
import ro.myClass.view.ViewStudent;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ViewStudent viewStudent = new ViewStudent();

        viewStudent.play();
    }
}