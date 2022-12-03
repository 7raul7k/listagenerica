package ro.myClass.structuri_generice;

public class SimpleHashTable<K,V>  {

    private  Entry<K,V>[]  entries;

    public SimpleHashTable() {
        entries= new Entry[10];
    }

    public void put(K key , V value){
        int hashKey = hashKey(key);
        if(occupied(hashKey)){
            int stopIndex= hashKey;

            if(hashKey==entries.length-1){
                hashKey=0;
            }else{
                hashKey++;
            }

            while (occupied(hashKey) &&hashKey!=stopIndex){
                hashKey=(hashKey+1)%entries.length;
            }
        }
        if(occupied(hashKey)){


            System.out.println( "Sorry ,it;s occupied");
        }else{
            entries[hashKey]= new Entry<>(key,value);
        }
    }

    public int find(K key){
        int hashKey = hashKey(key);
        if(entries[hashKey]!=null&&entries[hashKey].getKey().equals(key)){
            return  hashKey;
        }

        int stopIndex= hashKey;

        if(hashKey==entries.length-1){
            hashKey=0;
        }else{
            hashKey++;
        }

        while (occupied(hashKey) &&hashKey!=stopIndex&&!entries[hashKey].getKey().equals(key)){
            hashKey=(hashKey+1)%entries.length;
        }

        if(entries[hashKey]!=null&&entries[hashKey].getKey().equals(key)){
            return  hashKey;
        }


        return -1;
    }

    public V get(K key){
        int hashKey = find(key);
        return hashKey==-1?null:entries[hashKey].getValue();
    }

    public V remove(K key ){

        int hashKey = hashKey(key);


        if(hashKey == -1){

            return  null;
        }
        V value=entries[hashKey].getValue();
        entries[hashKey]=null;
        Entry<K,V>[]oldEntries=entries;

        entries= new Entry[oldEntries.length];
        for(int i=0;i<oldEntries.length;i++){
            if(oldEntries[i]!=null){
                put(oldEntries[i].getKey(),oldEntries[i].getValue());
            }
        }
        return value;


    }
   public boolean occupied(int hashKey){
        return entries[hashKey]!=null;
   }

    private  int hashKey(K key){
        return key.toString().length()%entries.length;
    }


}
