package br.com.homework.accenture.academia.vendaCarros.entity;

public interface Negotiate {

    void negotiate(Client client, Car car);

    void calculate(int parcelas, Car car);
}
