package ro.myClass.models;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String nume;
    private String prenume;
    private int varsta;
    private double medie;

    private int anStudiu;

    public Student(String nume, String prenume, int varsta, double medie,int anStudiu) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.medie = medie;
        this.anStudiu = anStudiu;
    }
    public Student(String text){
        String[] proprietes = text.split(",");
        this.nume = proprietes[0];
        this.prenume = proprietes[1];
        this.varsta = Integer.parseInt(proprietes[2]);
        this.medie = Double.parseDouble(proprietes[3]);
        this.anStudiu = Integer.parseInt(proprietes[4]);

    }
    public String descriere(){
        String text = "";
        text += "Nume: " + nume;
        text += "\nPrennume: " + prenume;
        text += "\nVarsta: " +  varsta;
        text += "\nMedie: " + medie;
        text += "\nAn Studiu" + anStudiu;
        text += "\n=======================\n";
        return text;
    }
    @Override
    public String toString(){
        return nume+","+prenume+","+varsta+","+medie+","+anStudiu;
    }
    @Override
    public boolean equals(Object obj){
        Student m = (Student) obj;
        if(this.nume.equals(m.nume)&&this.prenume.equals(m.prenume)){
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Student o) {
        if(this.medie > o.medie){
            return 1;
        } else if (this.medie==o.medie) {
            return 0;
        }else{
            return -1;
        }
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public double getMedie() {
        return medie;
    }

    public void setMedie(double medie) {
        this.medie = medie;
    }

    public int getAnStudiu() {
        return anStudiu;
    }

    public void setAnStudiu(int anStudiu) {
        this.anStudiu = anStudiu;
    }
}
