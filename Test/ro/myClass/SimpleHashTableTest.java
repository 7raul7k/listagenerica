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

}
