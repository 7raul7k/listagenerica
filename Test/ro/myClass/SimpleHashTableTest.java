package ro.myClass;

import org.junit.Test;
import ro.myClass.models.Masina;
import ro.myClass.models.Student;
import ro.myClass.structuri_generice.SimpleHashTable;

import static org.junit.Assert.assertEquals;

public class SimpleHashTableTest {

    @Test
    public void put(){
        SimpleHashTable<String,Masina> simpleHashTable = new SimpleHashTable<>();

        simpleHashTable.put("Andrei",new Masina("Andrei","Audi",2008,"benzina"));// pe pozitia6
        simpleHashTable.put("Roberto",new Masina("Roberto","Opel",2012,"motorina"));
        simpleHashTable.put("Alex",new Masina("Alex","Mercedes",2007,"benzina"));
        simpleHashTable.put("Gabriel",new Masina("Gabriel","Honda",2010,"motorina"));
        simpleHashTable.put("Darius",new Masina("Darius","Volvo",2015,"benzina"));

        assertEquals(6,simpleHashTable.find("Andrei"));
        assertEquals(4,simpleHashTable.find("Alex"));
        assertEquals(7,simpleHashTable.find("Roberto"));
        assertEquals(8,simpleHashTable.find("Gabriel"));
        assertEquals(9,simpleHashTable.find("Darius"));
    }

    @Test
    public void get(){

        SimpleHashTable<String,Masina> simpleHashTable = new SimpleHashTable<>();

        simpleHashTable.put("Andrei",new Masina("Andrei","Audi",2008,"benzina"));
        simpleHashTable.put("Roberto",new Masina("Roberto","Opel",2012,"motorina"));
        simpleHashTable.put("Alex",new Masina("Alex","Mercedes",2007,"benzina"));
        simpleHashTable.put("Gabriel",new Masina("Gabriel","Honda",2010,"motorina"));
        simpleHashTable.put("Darius",new Masina("Darius","Volvo",2015,"benzina"));


        assertEquals(new Masina("Andrei","Audi",2008,"benzina"),simpleHashTable.get("Andrei"));
        assertEquals(new Masina("Roberto","Opel",2012,"motorina"),simpleHashTable.get("Roberto"));
        assertEquals(new Masina("Alex","Mercedes",2007,"benzina"),simpleHashTable.get("Alex"));
        assertEquals(new Masina("Gabriel","Honda",2010,"motorina"),simpleHashTable.get("Gabriel"));
        assertEquals(new Masina("Darius","Volvo",2015,"benzina"),simpleHashTable.get("Darius"));


    }

    @Test
    public void remove(){

        SimpleHashTable<String,Masina> simpleHashTable = new SimpleHashTable<>();

        simpleHashTable.put("Andrei",new Masina("Andrei","Audi",2008,"benzina"));
        simpleHashTable.put("Roberto",new Masina("Roberto","Opel",2012,"motorina"));
        simpleHashTable.put("Alex",new Masina("Alex","Mercedes",2007,"benzina"));
        simpleHashTable.put("Gabriel",new Masina("Gabriel","Honda",2010,"motorina"));
        simpleHashTable.put("Darius",new Masina("Darius","Volvo",2015,"benzina"));

        assertEquals(new Masina("Andrei","Audi",2008,"benzina"),simpleHashTable.remove("Andrei"));
        assertEquals(new Masina("Roberto","Opel",2012,"motorina"),simpleHashTable.remove("Roberto"));
        assertEquals(new Masina("Alex","Mercedes",2007,"benzina"),simpleHashTable.remove("Alex"));
        assertEquals(new Masina("Gabriel","Honda",2010,"motorina"),simpleHashTable.remove("Gabriel"));
        assertEquals(new Masina("Darius","Volvo",2015,"benzina"),simpleHashTable.remove("Darius"));

    }

}
