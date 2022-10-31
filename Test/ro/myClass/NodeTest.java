package ro.myClass;

import org.junit.Test;
import ro.myClass.models.Masina;
import ro.myClass.models.Student;
import ro.myClass.structuri_generice.ListaGenerica;
import ro.myClass.struturi_simple.ListaSimpla;

import static org.junit.Assert.assertEquals;

public class NodeTest {


    @Test
    public void set(){
        ListaGenerica<Masina> lista = new ListaGenerica<>();
        Masina masina = new Masina("Dumitru","Audi",2008,"benzina");
        Masina masina1 = new Masina("Tudor","BMW",2009,"motorina");
        Masina masina2 = new Masina("Rares","Volvo",2010,"benzina");
        lista.addStart(masina);
        lista.addStart(masina1);
        lista.addStart(masina2);
        Masina masina4 = new Masina("Marian","Dacia",2008,"benzina");

        lista.set(masina4,1);



    }
    @Test
    public void get(){
        ListaGenerica<Masina> lista = new ListaGenerica<>();
        Masina masina = new Masina("Dumitru","Audi",2008,"benzina");
        Masina masina1 = new Masina("Tudor","BMW",2009,"motorina");
        Masina masina2 = new Masina("Rares","Volvo",2010,"benzina");
        lista.addStart(masina);
        lista.addStart(masina1);
        lista.addStart(masina2);
        Masina masina4 = new Masina("Marian","Dacia",2008,"benzina");
        lista.addStart(masina4);

        assertEquals(masina4,lista.get(0));
    }
    @Test
    public void addPosition(){
        ListaGenerica<Masina> lista = new ListaGenerica<>();
        Masina masina = new Masina("Dumitru","Audi",2008,"benzina");
        Masina masina1 = new Masina("Tudor","BMW",2009,"motorina");
        Masina masina2 = new Masina("Rares","Volvo",2010,"benzina");
        lista.addStart(masina);
        lista.addStart(masina1);
        lista.addStart(masina2);
        Masina masina4 = new Masina("Marian","Dacia",2008,"benzina");

        lista.addNodeonPosition(masina4,2);

        assertEquals(true,lista.contains(masina4));

    }

    @Test
    public void addNodSfarsit(){
        ListaGenerica<Masina> lista = new ListaGenerica<>();
        Masina masina = new Masina("Dumitru","Audi",2008,"benzina");
        Masina masina1 = new Masina("Tudor","BMW",2009,"motorina");
        Masina masina2 = new Masina("Rares","Volvo",2010,"benzina");
        lista.addStart(masina);
        lista.addStart(masina1);
        lista.addStart(masina2);
        Masina masina4 = new Masina("Marian","Dacia",2008,"benzina");

        lista.addNodSfarsit(masina4);

        assertEquals(true,lista.contains(masina4));
    }

    @Test
    public void stergerePrimulNod(){
        ListaGenerica<Masina> lista = new ListaGenerica<>();
        Masina masina = new Masina("Dumitru","Audi",2008,"benzina");
        Masina masina1 = new Masina("Tudor","BMW",2009,"motorina");
        Masina masina2 = new Masina("Rares","Volvo",2010,"benzina");
        lista.addStart(masina);
        lista.addStart(masina1);
        lista.addStart(masina2);
        lista.stergerePrimulNod();

        assertEquals(false,lista.contains(masina2));

    }

    @Test
    public void stergereUltimulNod(){
        ListaGenerica<Masina> lista = new ListaGenerica<>();
        Masina masina = new Masina("Dumitru","Audi",2008,"benzina");
        Masina masina1 = new Masina("Tudor","BMW",2009,"motorina");
        Masina masina2 = new Masina("Rares","Volvo",2010,"benzina");
        lista.addStart(masina);
        lista.addStart(masina1);
        lista.addStart(masina2);
        lista.stergereUltimaPozitie();
        assertEquals(false,lista.contains(masina));
    }

    @Test
    public void stergereAnumitaPozitie(){
        ListaGenerica<Masina> lista = new ListaGenerica<>();
        Masina masina = new Masina("Dumitru","Audi",2008,"benzina");
        Masina masina1 = new Masina("Tudor","BMW",2009,"motorina");
        Masina masina2 = new Masina("Rares","Volvo",2010,"benzina");
        lista.addStart(masina);
        lista.addStart(masina1);
        lista.addStart(masina2);
      int size = lista.size();
        lista.stergereNodAnumitaPozitie(2);

        assertEquals(size-1,lista.size());


    }

    @Test
    public void isEmpty(){
        ListaGenerica<Masina> lista = new ListaGenerica<>();
        Masina masina = new Masina("Dumitru","Audi",2008,"benzina");
        Masina masina1 = new Masina("Tudor","BMW",2009,"motorina");
        Masina masina2 = new Masina("Rares","Volvo",2010,"benzina");
        lista.addStart(masina);
        lista.addStart(masina1);
        lista.addStart(masina2);

        assertEquals(false,lista.isEmpty());
    }
    @Test
    public void size(){

        ListaGenerica<Masina> lista = new ListaGenerica<>();
        Masina masina = new Masina("Dumitru","Audi",2008,"benzina");
        Masina masina1 = new Masina("Tudor","BMW",2009,"motorina");
        Masina masina2 = new Masina("Rares","Volvo",2010,"benzina");
        lista.addStart(masina);
        lista.addStart(masina1);
        lista.addStart(masina2);
        Masina masina4 = new Masina("Marian","Dacia",2008,"benzina");
        int size = lista.size();
        lista.addStart(masina4);

        assertEquals(size+1,lista.size());

    }

    @Test
    public void sortare(){
        ListaGenerica<Masina> lista = new ListaGenerica<>();
        Masina masina = new Masina("Dumitru","Audi",2008,"benzina");
        Masina masina1 = new Masina("Tudor","BMW",2009,"motorina");
        Masina masina2 = new Masina("Rares","Volvo",2010,"benzina");
        Masina masina3 = new Masina("Dragos","Ferarri",2015,"benzina");
        Masina masina4 = new Masina("Alin","Volvo",2016,"motorina");
        lista.addStart(masina);
        lista.addStart(masina1);
        lista.addStart(masina2);
        lista.addStart(masina3);
        lista.addStart(masina4);
        lista.sortare();
        lista.afisare();

        assertEquals(true,lista.sortare());

    }

    @Test
    public void contains(){
        ListaGenerica<Masina> lista = new ListaGenerica<>();
        Masina masina = new Masina("Dumitru","Audi",2008,"benzina");
        Masina masina1 = new Masina("Tudor","BMW",2009,"motorina");
        Masina masina2 = new Masina("Rares","Volvo",2010,"benzina");
        Masina masina3 = new Masina("Dragos","Ferarri",2015,"benzina");
        Masina masina4 = new Masina("Alin","Volvo",2016,"motorina");
        lista.addStart(masina);
        lista.addStart(masina1);
        lista.addStart(masina2);
        lista.addStart(masina3);
        lista.addStart(masina4);

        assertEquals(true,lista.contains(masina));

    }
    @Test
    public void addPrimaPozitie(){
        ListaGenerica<Masina> lista = new ListaGenerica<>();
        Masina masina1 = new Masina("Tudor","BMW",2009,"motorina");
        Masina masina2 = new Masina("Rares","Volvo",2010,"benzina");
        Masina masina3 = new Masina("Dragos","Ferarri",2015,"benzina");
        Masina masina4 = new Masina("Alin","Volvo",2016,"motorina");
        lista.addStart(masina1);
        lista.addStart(masina2);
        lista.addStart(masina3);
        lista.addStart(masina4);
        Masina masina = new Masina("Dumitru","Audi",2008,"benzina");
        int size = lista.size();
        lista.addPrimaPozitie(masina);

        assertEquals(size,lista.size());

    }

    @Test
    public void getHead(){
        ListaGenerica<Masina> lista = new ListaGenerica<>();
        Masina masina1 = new Masina("Tudor","BMW",2009,"motorina");
        Masina masina2 = new Masina("Rares","Volvo",2010,"benzina");
        Masina masina3 = new Masina("Dragos","Ferarri",2015,"benzina");
        Masina masina4 = new Masina("Alin","Volvo",2016,"motorina");
        lista.addStart(masina1);
        lista.addStart(masina2);
        lista.addStart(masina3);
        lista.addStart(masina4);

        assertEquals(lista.getHead(),lista.getHead());
    }

    @Test
    public void celMaiMareElement(){
        ListaGenerica<Masina> lista = new ListaGenerica<>();
        Masina masina1 = new Masina("Tudor","BMW",2009,"motorina");
        Masina masina2 = new Masina("Rares","Volvo",2010,"benzina");
        Masina masina3 = new Masina("Dragos","Ferarri",2015,"benzina");
        Masina masina4 = new Masina("Alin","Volvo",2016,"motorina");
        lista.addStart(masina1);
        lista.addStart(masina2);
        lista.addStart(masina3);
        lista.addStart(masina4);

        lista.sortare();


        System.out.println(lista.celMaiMareElement());



    }
}
