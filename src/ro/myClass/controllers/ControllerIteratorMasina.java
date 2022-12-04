package ro.myClass.controllers;

import ro.myClass.models.Masina;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ControllerIteratorMasina {

    private Iterator<Masina> masinaIterator;

    private List<Masina> listMasina;

    public ControllerIteratorMasina() {
        this.listMasina = new ArrayList<>();
        this.masinaIterator = listMasina.iterator();
        this.load();
    }

    public void load() {
        try {
            File file = new File("C:\\mycode\\JavaBasics\\Collections\\Collections\\src\\ro\\myClass\\resources\\cars.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                this.listMasina.add(new Masina(scanner.nextLine()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean contains(Masina masina) {
        boolean flag = false;
        while (masinaIterator.hasNext() && flag == false) {
            Masina m = masinaIterator.next();
            if (m.getOwner().equals(masina.getOwner()) && m.getMarca().equals(masina.getMarca())) {
                flag = true;
            }
        }
        return flag;
    }

    public void add(Masina masina) {
        boolean flag = contains(masina);

        if (flag == false) {
            this.listMasina.add(masina);
        }
    }

    public void remove(Masina masina) {
        boolean flag = contains(masina);
        if (flag == true) {
            this.listMasina.remove(masina);
        }
    }

    public int size() {
        int size = 0;
        while (masinaIterator.hasNext()) {
            size++;
            Masina m = masinaIterator.next();

        }
        return size;
    }


    public boolean isEmpty() {
        if (this.size() >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public void afisare(){
        while(masinaIterator.hasNext()){
            Masina m = masinaIterator.next();
            System.out.println(m);

        }
    }

    public Masina get(int pos){
       int ct = 0;
        while (masinaIterator.hasNext()){
            Masina m = masinaIterator.next();
            ct++;
            if(pos == ct){
                return m;
            }
        }
        return null;
    }

    public void set(Masina m,int pos){
        int ct = 0;
        while(masinaIterator.hasNext()){
            Masina car = masinaIterator.next();
            ct++;
            if(pos == ct){
                masinaIterator.next().setAn(m.getAn());
                masinaIterator.next().setMarca(m.getMarca());
                masinaIterator.next().setOwner(m.getOwner());
                masinaIterator.next().setTipmotor(m.getTipmotor());
            }
        }
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
