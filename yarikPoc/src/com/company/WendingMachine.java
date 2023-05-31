package com.company;

import java.util.ArrayList;

public class WendingMachine {
    private ArrayList<Product> productList = new ArrayList<>();
    private int countProducts = 0;
    private String name;
    public WendingMachine() {

    }
    public WendingMachine(String name, Product ... p) {
        this.name = name;
        for (int i=0; i < p.length; i++) {
            this.productList.add(p[i]);
            this.countProducts++;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addProduct(Product p) {
        this.productList.add(p);
        countProducts++;
    }

    public void removeProduct(Product p) {
        this.productList.remove(p);
        this.countProducts--;
    }

    public ArrayList<Product> getProductList() {
        return this.productList;
    }

    public int getCountProducts() {
        return this.countProducts;
    }

    public void printInf() {
        System.out.printf("Название автомата: %s", this.getName());
        System.out.println("Доступные товары: ");
        for (Product product : this.getProductList()) {
            System.out.println(product.getName() + " Цена: " + product.getCostInOne() + "$");
        }
        System.out.println("Количество всех продуктов: " + this.getCountProducts());
    }
}
