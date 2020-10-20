package br.com.homework.accenture.academia.vendaCarros.controller;

import br.com.homework.accenture.academia.vendaCarros.entity.*;

import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class SalesController {

    public static void main(String[] args) {
        var client1 = newClient();
        var car1 = newCar(client1);
        Vendor vendor = new Vendor();
        vendor.negotiate(client1, car1);
    }

    public static Client newClient(){
        Client client1 = new Client();
        System.out.println("Ola! Seja bem vindo ao nosso novo e automatizado sistema de vendas!");
        System.out.println("Por favor, comece digitando o seu nome: ");
        try {
            Scanner scanner = new Scanner(System.in);
            client1.setName(scanner.nextLine());
            System.out.println("Carro com modificacoes especiais? (PcD) sim/nao");
            var PcD = scanner.next();
            client1.setPcD(PcD.equalsIgnoreCase("sim") || PcD.equalsIgnoreCase("s"));
        } catch (NoSuchElementException e){
            System.out.println("Ei, voce nao digitou nada!! VOLTE AQUI!!");
        }
        return client1;
    }

    public static Car newCar(Client client){
        Car newCar = new Car();
        System.out.printf("Certo, %s! Vamos montar o MELHOR carro para voce!\n", client.getName());
        System.out.println("Qual a cor que voce deseja no seu carro?");
        try {
            Scanner scanner = new Scanner(System.in);
            newCar.setColor(scanner.nextLine());
            System.out.printf("%s? Muito bem! E de qual marca?\n", newCar.getColor());
            newCar.setBrand(scanner.nextLine());
            System.out.printf("Um %s de cor %s ... temos sim! Inclusive pode escolher o modelo que quiser!\n",
                    newCar.getBrand(), newCar.getColor());
            System.out.println("falando nisso, qual seria o modelo? ");
            newCar.setModel(scanner.nextLine());
            System.out.printf("Recapitulando: um %s %s da %s certo? Deixe-me conferir...\n",
                    newCar.getModel(), newCar.getColor(), newCar.getBrand());
            if (client.isPcD())
                newCar.setPcD(true);
            System.out.println(newCar);
        } catch (NoSuchElementException e){
            System.out.println("Ei, voce nao digitou nada!! VOLTE AQUI!!");
        }
        return newCar;
    }

    public static void potentialSale(Client client, Car car){
        System.out.println("Primeiro precisamos que alguem atenda a gente ...");
        System.out.println("AE, GALERA? ALOOOU CLIENTE NO SALAO!");
        Random vezAtendimento = new Random();
        var vez = vezAtendimento.nextInt(3);
        switch (vez) {
            case 0 -> {
                Vendor vendor = new Vendor();
                vendor.negotiate(client, car);
            }
            case 1 -> {
                Intern intern = new Intern();
                intern.negotiate(client, car);
            }
            case 2 -> {
                Manager manager = new Manager();
                manager.negotiate(client, car);
            }
        }

    }
}
