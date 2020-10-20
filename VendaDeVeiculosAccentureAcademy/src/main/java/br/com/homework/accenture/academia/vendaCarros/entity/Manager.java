package br.com.homework.accenture.academia.vendaCarros.entity;

public class Manager extends Employee implements Negotiate{

    String password;

    public Manager() {
        setName("Joel Santos Mendes");
        setJob("Manager");
    }

    @Override
    public void negotiate(Client client, Car car) {

    }

    @Override
    public void calculate(int parcelas, Car car) {

    }
}
