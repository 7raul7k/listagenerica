package ro.myClass;

import org.junit.Test;
import ro.myClass.models.Masina;
import ro.myClass.structuri_generice.ChainedHashTable;
import ro.myClass.structuri_generice.Entry;

import static org.junit.Assert.assertEquals;

public class ChainedHashTableTest {

    @Test
    public void put(){
        ChainedHashTable<String,Masina> chainedHashTable = new ChainedHashTable<>();

        chainedHashTable.put("Andrei",new Masina("Andrei","Bmw",2006,"benzina"));
        chainedHashTable.put("George",new Masina("George","Audi",2008,"motorina"));
        chainedHashTable.put("Mihai",new Masina("Mihai","Honda",2010,"benzina"));
        chainedHashTable.put("Darius",new Masina("Darius","Volvo",2009,"benzina"));
        chainedHashTable.put("Ionut",new Masina("Ionut","Mercedes",2013,"benzina"));

    }

    @Test
    public void get(){
        ChainedHashTable<String,Masina> chainedHashTable = new ChainedHashTable<>();

        chainedHashTable.put("Aa",new Masina("Andrei","Bmw",2006,"benzina"));
        chainedHashTable.put("Ab",new Masina("George","Audi",2008,"motorina"));
        chainedHashTable.put("Av",new Masina("Mihai","Honda",2010,"benzina"));
        chainedHashTable.put("Darius",new Masina("Darius","Volvo",2009,"benzina"));
        chainedHashTable.put("Ionut",new Masina("Ionut","Mercedes",2013,"benzina"));

        assertEquals(new Masina("Andrei","Bmw",2006,"benzina"),chainedHashTable.get("Aa"));
        assertEquals(new Masina("George","Audi",2008,"motorina"),chainedHashTable.get("Ab"));
        assertEquals(new Masina("Mihai","Honda",2010,"benzina"),chainedHashTable.get("Av"));
        assertEquals(new Masina("Darius","Volvo",2009,"benzina"),chainedHashTable.get("Darius"));
        assertEquals(new Masina("Ionut","Mercedes",2013,"benzina"),chainedHashTable.get("Ionut"));

    }

    @Test
    public void remove(){
        ChainedHashTable<String,Masina> chainedHashTable = new ChainedHashTable<>();

        chainedHashTable.put("Andrei",new Masina("Andrei","Bmw",2006,"benzina"));
        chainedHashTable.put("George",new Masina("George","Audi",2008,"motorina"));
        chainedHashTable.put("Mihai",new Masina("Mihai","Honda",2010,"benzina"));
        chainedHashTable.put("Darius",new Masina("Darius","Volvo",2009,"benzina"));
        chainedHashTable.put("Ionut",new Masina("Ionut","Mercedes",2013,"benzina"));

      assertEquals(true,chainedHashTable.remove("Darius"));




    }

}
