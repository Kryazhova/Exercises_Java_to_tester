package ru.fruit;

import com.sun.tools.corba.se.idl.constExpr.Or;
import org.junit.Assert;
import org.junit.Test;
import ru.fruit.allFruits.Apple;
import ru.fruit.allFruits.Orange;
import ru.fruit.boxes.Box;

import static org.junit.Assert.*;

public class BoxTest {

    @Test
    public void testGetWeightBoxApple() {
        Box<Apple> testBoxApple = new Box<Apple>();
        testBoxApple.add(new Apple(12, 10.0000005));
        testBoxApple.add(new Apple(1, 12));

        Assert.assertEquals(132, testBoxApple.getWeightBox(), 0.001);
    }

    @Test
    public void testGetWeightBoxOrange() {
        Box<Orange> testBoxOrange = new Box<Orange>();
        testBoxOrange.add(new Orange(5, 1.0005));
        testBoxOrange.add(new Orange(1, 10));

        Assert.assertEquals(15, testBoxOrange.getWeightBox(), 0.01);
    }

    @Test
    public void testCompareTo() {
        Box<Apple> testBoxApple = new Box<Apple>();
        testBoxApple.add(new Apple(12, 1));

        Box<Orange> testBoxOrange = new Box<Orange>();
        testBoxOrange.add(new Orange(1, 12));

        Assert.assertTrue(testBoxApple.compareTo(testBoxOrange));
    }

    @Test
    public void testChangeBox() {
        Box<Orange> testBoxOrange = new Box<Orange>();
        testBoxOrange.add(new Orange(5, 1.0005));
        testBoxOrange.add(new Orange(1, 10));

        Box<Orange> newBox = new Box<Orange>();
        testBoxOrange.changeBox(newBox);

        Assert.assertEquals(0,testBoxOrange.getWeightBox(),0.01);
        Assert.assertEquals(15,newBox.getWeightBox(),0.01);
    }
}