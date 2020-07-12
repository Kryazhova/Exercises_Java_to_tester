package ru.fruit.boxes;

import ru.fruit.allFruits.Fruit;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    ArrayList<T> fruits = new ArrayList<T>();

    public void add(T newFruits){
        this.fruits.add(newFruits);
    }

    public Double getWeightBox(){
      double boxWith = 0;
      for (T fruit: this.fruits) {
          boxWith += fruit.getConsignmentWeight();
      }
      return boxWith;
    };

    public boolean compareTo(Box comparableBox) {
        return (this.getWeightBox().intValue() == comparableBox.getWeightBox().intValue());
    }

    private void addAll(ArrayList<T> oldFruits) {
        this.fruits.addAll(oldFruits);
    }

    public void changeBox(Box<T> newBox) {
        newBox.addAll(this.fruits);
        this.fruits.clear();
    }
}
