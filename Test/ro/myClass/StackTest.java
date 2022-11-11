package ro.myClass;


import org.junit.Test;
import ro.myClass.models.*;
import ro.myClass.structuri_generice.Node;
import ro.myClass.structuri_generice.Stiva;

public class StackTest {

    @Test
    public void push() {
        Stiva<Masina> stiva = new Stiva();
        Masina masina = new Masina("Marius","Audi",2010,"benzina");
        Masina masina1 = new Masina("Tudor","BMW",2009,"motorina");
        stiva.push(masina);
        stiva.push(masina1);

        Masina masina2 = new Masina("Alexandru","Mercedes",2006,"benzina");
        stiva.push(masina2);
    }

    @Test
    public void pop(){
        Stiva<Masina> stiva = new Stiva();
        Masina masina = new Masina("Marius","Audi",2010,"benzina");
        Masina masina1 = new Masina("Tudor","BMW",2009,"motorina");
        stiva.push(masina);
        stiva.push(masina1);
        stiva.pop();

    }

    @Test
    public void peek(){
        Stiva<Masina> stiva = new Stiva();
        Masina masina = new Masina("Marius","Audi",2010,"benzina");
        Masina masina1 = new Masina("Tudor","BMW",2009,"motorina");
        stiva.push(masina);
        stiva.push(masina1);

        Node node = stiva.peek();

        System.out.println(node.getData());
    }


}
