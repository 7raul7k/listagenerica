package ro.myClass.comparator;

import ro.myClass.models.Masina;

import java.util.Comparator;

public class ComparatorAnMasina implements Comparator<Masina> {

    @Override
    public int compare(Masina o1, Masina o2) {
        if (o1.getAn() < o2.getAn()){
            return -1;
        }else if(o1.getAn() > o2.getAn()){
            return 1;
        }
        return 0;

    }
}
