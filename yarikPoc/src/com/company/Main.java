package com.company;

public class Main {

    public static void main(String[] args) {
        Product banana = new Product();
        banana.setName("Банан");
        banana.setCostInOne(4);

        Product strawberry = new Product("Strawberry", 8);

        WendingMachine wendingMachine = new WendingMachine("ВкусВилл", banana);

        wendingMachine.addProduct(strawberry);

        wendingMachine.printInf();
    }
}
