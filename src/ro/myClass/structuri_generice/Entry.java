package ro.myClass.structuri_generice;

import java.util.Objects;

public class Entry<K,V> implements Comparable<Entry<K,V>> {

    private K key;
    private V value;

    public Entry(K key,V value){
        this.key = key;
        this.value = value;
    }

    public void setKey(K key){
        this.key = key;
    }
    public void setValue(V value){
        this.value = value;
    }
    public K getKey(){
        return key;
    }
    public V getValue(){
        return value;
    }


    @Override
    public int compareTo(Entry<K, V> o) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        return  this.key.equals(((Entry)o).key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }
}
