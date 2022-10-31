package ro.myClass;

import org.junit.Test;
import ro.myClass.controllers.ControllerMasina;
import ro.myClass.models.Masina;
import ro.myClass.structuri_generice.ListaGenerica;
import ro.myClass.structuri_generice.Node;

import static org.junit.Assert.assertEquals;

public class ControllerMasinaTest {

 @Test
    public void addNod(){
  ControllerMasina lista = new ControllerMasina();
     Masina masina=  new Masina("Alexandru","Audi",2008,"benzina");
     Masina masina1 = new Masina("Ionut","Bmw",2012,"motorina");
     Masina masina2 = new Masina("Andrei","Honda",2009,"benzina");
     Masina masina3 = new Masina("Bogdan","Mercedes",2012,"motorina");
     lista.addNod(masina);
     lista.addNod(masina1);
     lista.addNod(masina2);
     int size = lista.size();
     lista.addNod(masina3);

     assertEquals(size+1,lista.size());
 }

@Test
public void stergerePrimulNod(){
ControllerMasina lista = new ControllerMasina();
 int size = lista.size();
 lista.stergerePrimulNod();
 assertEquals(size-1,lista.size());
}
@Test
 public void addNodSfarsit(){
  ControllerMasina lista = new ControllerMasina();
 Masina masina4 = new Masina("Alin","Volvo",2016,"motorina");
 int size = lista.size();
 lista.addNodSfarsit(masina4);
 assertEquals(size+1,lista.size()+1);
}
 @Test
 public void addNodeonPosition(){
  ControllerMasina lista = new ControllerMasina();
  Masina masina4 = new Masina("Alin","Volvo",2016,"motorina");
  lista.addNodeOnPosition(masina4,4);
  assertEquals(lista.size(),lista.size());
 }
 @Test
 public void stergereUltimulNod(){
  ControllerMasina lista = new ControllerMasina();
  int size = lista.size();
  lista.stergereUltimulNod();
  assertEquals(size-1,lista.size());
 }
 @Test
 public void stergereAnumitNod(){ControllerMasina lista = new ControllerMasina();
  int size = lista.size();
  lista.stergereAnumitNod(1);
  assertEquals(size-1,lista.size());

 }

 @Test
 public void get(){
  ControllerMasina masina = new ControllerMasina();
  Masina masina1 = masina.get(1);
  assertEquals(masina1,masina.get(1));
 }
 @Test
 public void set(){
  ControllerMasina masina = new ControllerMasina();
  Masina masina1 = new Masina("Tudor","BMW",2009,"motorina");
  masina.set(masina1,3);
  assertEquals(true,masina.contains(masina1));

 }
 @Test
 public void sortare(){
  ControllerMasina controllerMasina = new ControllerMasina();
  controllerMasina.sortare();
  assertEquals(true,controllerMasina.sortare());
 }
 @Test
 public void afisare(){
  ControllerMasina controllerMasina = new ControllerMasina();
  controllerMasina.afisare();
 }

 @Test
 public void getHead(){
  ControllerMasina lista = new ControllerMasina();
  Node head = lista.gethead();
  assertEquals(head,lista.gethead());
 }

 @Test
 public void isEmpty(){
  ControllerMasina controllerMasina = new ControllerMasina();
  assertEquals(false,controllerMasina.isempty());
 }

 }