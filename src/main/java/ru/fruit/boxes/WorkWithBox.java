package ru.fruit.boxes;

import ru.fruit.allFruits.Apple;
import ru.fruit.allFruits.Orange;

public class WorkWithBox {
    public static void main() {

        Box<Apple> boxApple = new Box<Apple>();
        Box<Orange> boxOrange = new Box<Orange>();

        boxApple.add(new Apple(10,1));
        boxApple.add(new Apple(1,3.5));
        boxApple.add(new Apple(3,2));
        boxApple.add(new Apple(5,0.5));

        boxOrange.add(new Orange(5, 3));
        boxOrange.add(new Orange(7, 1.5));

        boxApple.getWeightBox();
        boxOrange.getWeightBox();

        boxApple.compareTo(boxOrange);

        Box<Apple> newBox = new Box<Apple>();
        boxApple.changeBox(newBox);
    }
}
