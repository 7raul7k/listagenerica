package ro.myClass.view;

import ro.myClass.controllers.ControllerMasina;
import ro.myClass.controllers.ControllerStudent;
import ro.myClass.models.Masina;
import ro.myClass.structuri_generice.ListaGenerica;

import java.util.Scanner;

public class ViewMasina<U extends Comparable<U>> {


    private ControllerMasina controllerMasina = new ControllerMasina();

    public Scanner scanner;

    public ViewMasina(){

        this.controllerMasina = new ControllerMasina();
        this.scanner = new Scanner(System.in);
        this.play();

    }
    public void show(){

        System.out.println("Apasa 1 pentru a afisa toate masinile");
        System.out.println("Apasa 2 pentru a adauga o masina");
        System.out.println("Apasa 3 pentru a adauga masina pe ultima pozitie");

    }

    public void play(){

        boolean running = true;

        while(running == true){

            show();

            int choice = Integer.parseInt(scanner.nextLine());

            switch(choice){

                case 1: controllerMasina.afisare();
                break;

                case 2 : adaugareMasina();
                break;

                case 3: adaugareUltimaPozitie();
                break;

                case 4: adaugareAnumitaPozitie();
                break;


                default: play();

            }


        }

    }

    public void adaugareMasina(){

        System.out.println("Introduceti numele proprietarului: ");
        String nume = scanner.nextLine();
        System.out.println("Introduceti marca");
        String marca = scanner.nextLine();
        System.out.println("Introduceti anul");
        int an = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti tipul motorului");
        String tipMotor = scanner.nextLine();

        Masina masina = new Masina(nume,marca,an,tipMotor);

        controllerMasina.addNod(masina);

    }
    public void adaugareUltimaPozitie(){
        System.out.println("Introduceti numele proprietarului: ");
        String nume = scanner.nextLine();
        System.out.println("Introduceti marca");
        String marca = scanner.nextLine();
        System.out.println("Introduceti anul");
        int an = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti tipul motorului");
        String tipMotor = scanner.nextLine();

        Masina masina = new Masina(nume,marca,an,tipMotor);

        controllerMasina.addNodSfarsit(masina);
    }
    public void adaugareAnumitaPozitie(){
        System.out.println("Introduceti numele proprietarului: ");
        String nume = scanner.nextLine();
        System.out.println("Introduceti marca");
        String marca = scanner.nextLine();
        System.out.println("Introduceti anul");
        int an = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti tipul motorului");
        String tipMotor = scanner.nextLine();
        System.out.println("Introduceti un numar");
        int pos = Integer.parseInt(scanner.nextLine());

        Masina masina = new Masina(nume,marca,an,tipMotor);
        controllerMasina.addNodeOnPosition(masina,pos);
    }


}
