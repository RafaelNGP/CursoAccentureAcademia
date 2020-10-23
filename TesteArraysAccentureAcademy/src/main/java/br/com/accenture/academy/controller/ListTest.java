package br.com.accenture.academy.controller;

import java.util.*;

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
        listaMutavel.remove(2);

//        ex 7
        System.out.println(listaMutavel.contains("Branco"));
        System.out.println(listaMutavel.indexOf("Verde"));

//        ex 8
        Collections.sort(listaMutavel);
        System.out.println(listaMutavel);

//        ex 9
        ArrayList<ArrayList> novaLista = new ArrayList<>();
        novaLista.add(listaMutavel);
        System.out.println(novaLista);

        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i;
            System.out.println(numeros[i]);
        }

        List<String > fruit = Arrays.asList(
                "Apple", "Orange", "Dragon Fruit");

        for (String s : fruit) {
            System.out.println(s);
        }

/*      Collections.sort(listaMutavel);
        System.out.println(listaMutavel);*/




    }
}
