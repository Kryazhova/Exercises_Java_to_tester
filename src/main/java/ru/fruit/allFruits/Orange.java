package ru.fruit.allFruits;

import ru.fruit.allFruits.Fruit;

public class Orange implements Fruit {
    int quantityInConsignment;
    Number weightOneFruit;

    public Orange(int quantityInConsignment, Number weightOneFruit) {
        this.quantityInConsignment = quantityInConsignment;
        this.weightOneFruit = weightOneFruit;
    }

    public double getConsignmentWeight() {
        return quantityInConsignment * weightOneFruit.doubleValue();
        }
}
