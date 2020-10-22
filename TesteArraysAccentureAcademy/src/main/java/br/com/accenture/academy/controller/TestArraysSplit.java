package br.com.accenture.academy.controller;

import java.util.Arrays;

public class TestArraysSplit {
    public static void main(String[] args) {
    String phrase = "How you doing ?";
    String[] palavras = phrase.split(" ");

    for (int i = palavras.length - 1; i >= 0; i--) {
        System.out.println(palavras[i]);
    }
    System.out.println(Arrays.toString(palavras));
    }
}
