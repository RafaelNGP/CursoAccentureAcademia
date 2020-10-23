package br.com.accenture.academy.controller;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
//        https://rflpazini.com/accademia/exercises07/
//        ex 1
        Set<String> nomes = new HashSet<>();
        nomes.add("Rafael");
        nomes.add("Laura");

//        ex 2
        for (String s: nomes) {
            System.out.println(s);
        }

//        ex 3
        System.out.println(nomes.size());

//        ex 4
        nomes.clear();

//        ex 5
        System.out.println(nomes.isEmpty());

//        ex 6
        nomes.add("Rafael");
        nomes.add("Laura");

        Set<String> nomesAlternativos = new HashSet<>();
        nomesAlternativos.add("Simone");
        nomesAlternativos.addAll(nomes);

        System.out.println(nomesAlternativos);

//        ex 7
        var nomesArray = nomesAlternativos.toArray();
        System.out.println(Arrays.toString(nomesArray));

//        ex 8
//        pulando, usando treeSet

//        ex 9
        List<String> listaStrings = new ArrayList<>(nomes);

        System.out.println(listaStrings);

//        ex 10
        Set<String> nomesDeNovo = new HashSet<>();
        nomesDeNovo.add("Marcielo");
        nomesDeNovo.add("Laura");

        System.out.println(nomes.equals(nomesDeNovo));

//        ex 11
        System.out.println(nomesDeNovo);
        System.out.println(nomesAlternativos);

        nomesAlternativos.retainAll(nomesDeNovo);

        Set<String> qlqrNome = new HashSet<>();
        qlqrNome.addAll(nomesAlternativos);

        System.out.println(qlqrNome);

//        ex 12
        nomesDeNovo.clear();
    }
}
