package ru.fruit;

import org.junit.Assert;
import org.junit.Test;
import ru.fruit.allFruits.Apple;
import ru.fruit.allFruits.Orange;
import ru.fruit.boxes.Box;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FruitTest {

    @Test
    public void testGetConsignmentWeightApple() {
        Apple firstApple = new Apple(1,1);
        Apple secondApple =new Apple(2,2.0);

        Assert.assertEquals(1,firstApple.getConsignmentWeight(),0.001);
        Assert.assertEquals(4,secondApple.getConsignmentWeight(),0.001);
    }

    @Test
    public void testGetConsignmentWeightOrange() {
        Orange firstOrange = new Orange(1,1.5);
        Orange secondOrange =new Orange(2,3);

        Assert.assertEquals(1.5,firstOrange.getConsignmentWeight(),0.001);
        Assert.assertEquals(6,secondOrange.getConsignmentWeight(),0.001);
    }
}