package br.com.homework.accenture.academia.vendaCarros.entity;

public class Intern extends Employee implements Negotiate {

    public Intern() {
        setJob("Intern");
        setName("Ioury Naimeson");
    }

    @Override
    public void negotiate(Client client, Car car) {
        Manager manager = new Manager();

    }

    @Override
    public void calculate(int parcelas, Car car) {

    }
}
