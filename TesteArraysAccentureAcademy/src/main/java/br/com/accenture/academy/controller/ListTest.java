package br.com.accenture.academy.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {

//        ex 1
        List<String> listaImutavel = List.of(
                "Rafael",
                "Bruno",
                "Leandro"
        );
        System.out.println(listaImutavel);

        ArrayList<String> listaMutavel = new ArrayList<>();
        listaMutavel.add("Azul");
        listaMutavel.add("Roxo");
        listaMutavel.add("Laranja");
        listaMutavel.add("Verde");

        System.out.println(listaMutavel);

//        ex 2
        for (String s : listaMutavel){
            System.out.println(s);
        }

//        ex 3
        listaMutavel.add(0, "Branco");
        System.out.println(listaMutavel);

//        ex 4
        System.out.println(listaMutavel.get(3));

//        ex 5
        listaMutavel.remove(1);
        listaMutavel.add(1,"Blue");
        System.out.println(listaMutavel);

//        ex 6
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i;
            System.out.println(numeros[i]);
        }



/*      Collections.sort(listaMutavel);
        System.out.println(listaMutavel);*/




    }
}
