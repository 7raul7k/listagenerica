package ro.myClass.Probleme;

import ro.myClass.structuri_generice.Coada;
import ro.myClass.structuri_generice.Stiva;

import java.util.Scanner;

public class Test {


    @org.junit.Test
    public void test() {

        //cu ajutorul stackului  verificam daca un text este corect balantat  fiecare paranteze deschisa text
        //sa aibe si corespondentu inchis

        //"Ana(are(mere))"

        //"Ana re

        boolean flag = true;
        String text = "Ana()()())()))))) are mere galbene";
        Stiva<Character> stack = new Stiva<>();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '(') {
                stack.push(text.charAt(i));
            } else if (text.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    flag = false;
                } else {
                    stack.pop();
                }
            }
        }

        String sol = flag == true && stack.isEmpty() ? "este balantat" : "nu este blantat";
//        System.out.println(sol);

        //inversam un text folosind o coada

        String txt = "Ana are mere";
        Coada<Character> queue = new Coada<>();

        for (int i = 0; i < txt.length() - 1; i++) {
            queue.enQueue(txt.charAt(i));
        }
        String nou = "";
        while (queue.isEmpty()) {
            char aux = queue.deQueue().getData();
            nou += aux;
        }
//        System.out.println(nou);


        String txt1 = "(}{";
        Stiva<Character> stiva = new Stiva<>();
        boolean f = true;

        for (int i = 0; i < txt1.length(); i++) {

            if (txt1.charAt(i) == '{' || txt1.charAt(i) == '[' || txt1.charAt(i) == '(') {

                stiva.push(text.charAt(i));

            }else if(txt1.charAt(i)=='}'||txt1.charAt(i) == ']'|| txt1.charAt(i) == ')') {


                if (stiva.isEmpty()) {

                    flag = false;

                } else {
                    stiva.pop();
                }

            }

        }

        String res = flag == false && stiva.isEmpty() ? "Textul este corect balantat ": "Textul nu este balantat ";

        System.out.println(res);

    }

}
