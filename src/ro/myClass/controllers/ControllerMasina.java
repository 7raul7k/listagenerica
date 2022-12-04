package ro.myClass.controllers;

import ro.myClass.models.Masina;
import ro.myClass.structuri_generice.ListaGenerica;
import ro.myClass.structuri_generice.Node;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class ControllerMasina {
    private ListaGenerica<Masina> masinaLista;
    public ControllerMasina(){
        this.masinaLista = new ListaGenerica<>();
        this.load();
    }
    public void load(){

        try{

           File file = new File("C:\\mycode\\JavaBasics\\Collections\\Collections\\src\\ro\\myClass\\resources\\cars.txt");
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()){

                this.masinaLista.addStart(new Masina(scanner.nextLine()));

            }

        }catch (Exception e){

            e.printStackTrace();

        }

    }
    public void addNod(Masina masina) {
        boolean flag = contains(masina);
        if (flag == false) {
            this.masinaLista.addStart(masina);
        }
    }
    public void afisare(){
        this.masinaLista.afisare();

    }
    public void stergerePrimulNod(){
        this.masinaLista.stergerePrimulNod();
    }
    public void stergereUltimulNod(){
        this.masinaLista.stergereUltimaPozitie();
    }
    public void stergereAnumitNod(int pos){
        this.masinaLista.stergereNodAnumitaPozitie(pos);
    }
    public void addNodSfarsit(Masina masina) {
        boolean flag = contains(masina);
        if (flag == false) {
            this.masinaLista.addNodSfarsit(masina);
        }
    }
    public void addNodeOnPosition(Masina masina,int pos) {

            this.masinaLista.addNodeonPosition(masina, pos);
    }
    public Node gethead(){
       return this.masinaLista.getHead();
    }
    public boolean contains(Masina masina){
        return this.masinaLista.contains(masina);
    }
    public boolean isempty(){
      return this.masinaLista.isEmpty();
    }
    public int size(){
        return this.masinaLista.size();
    }
    public Masina get(int pos){
        return this.masinaLista.get(pos);
    }
    public void set(Masina masina,int pos){
       this.masinaLista.set(masina,pos);
    }
    public boolean sortare(){
        return masinaLista.sortare();
    }
    public void save(){
        try{
            File file = new File("C:\\mycode\\JavaBasics\\Collections\\Collections\\src\\ro\\myClass\\resources\\cars.txt");
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
