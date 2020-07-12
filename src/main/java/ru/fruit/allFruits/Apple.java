package ru.fruit.allFruits;

public class Apple implements Fruit {
    int quantityInConsignment;
    Number weightOneFruit;

    public Apple(int quantityInConsignment, Number weightOneFruit) {
        this.quantityInConsignment = quantityInConsignment;
        this.weightOneFruit = weightOneFruit;
    }

    public double getConsignmentWeight() {
        return quantityInConsignment * weightOneFruit.doubleValue();
    }
}
