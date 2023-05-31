package com.company;

public class Product {
    private String name;
    private double costInOne;

    public Product() {

    }

    public Product(String name, double costInOne) {
        this.name = name;
        this.costInOne = costInOne;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCostInOne() {
        return costInOne;
    }

    public void setCostInOne(int costInOne) {
        this.costInOne = costInOne;
    }

    public void printInf() {
        System.out.printf("Название товара: %s \nЦена: %f $", this.getName(), this.getCostInOne());
    }
}
