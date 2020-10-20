package br.com.homework.accenture.academia.vendaCarros.entity;

public class Car {
    String color;
    String brand;
    String model;
    double price;
    boolean PcD;

    public Car() {
        this.price = 15000;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isPcD() {
        return PcD;
    }
    public void setPcD(boolean pcD) {
        PcD = pcD;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", PcD=" + PcD +
                '}';
    }
}
