package ro.myClass.structuri_generice;

public class ChainedHashTable<K,V>{


    ListaGenerica<Entry<K,V>>[] hashTabel;

    public ChainedHashTable(){


        hashTabel= new ListaGenerica[10];


        for(int i=0;i<hashTabel.length;i++){

            hashTabel[i]= new ListaGenerica<>();
        }
    }

    public void put(K key,V value){
        int pozitie=hashKey(key);
        Entry<K ,V> entry = new Entry<>(key,value);
        this.hashTabel[pozitie].addStart(entry);
    }

    public V get(K key) {
        int pozitie = hashKey(key);
        for(int i = 0 ; i < hashTabel.length;i++){
            if(hashTabel[pozitie].get(i).getKey().equals(key)){
                return hashTabel[pozitie].get(i).getValue();
            }
        }
        return null;
    }

    public int  find(K key){
        int hashKey = hashKey(key);
        int pos = 0;
        while(hashTabel!= null){
            if(hashTabel[hashKey].get(pos).getKey().equals(key)){
                return pos;
            }
        }
        return -1;
    }
    public boolean remove(K key){
        int hashKey = hashKey(key);
        this.hashTabel[hashKey].stergereNodAnumitaPozitie(hashKey);
        return true;
    }

    public int hashKey(K key){
        return key.toString().length()%hashTabel.length;
    }

    public boolean occupied(int key ){
        return hashTabel[key]!=null;
    }


}
