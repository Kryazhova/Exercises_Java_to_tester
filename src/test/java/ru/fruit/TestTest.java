package ru.fruit;

import org.junit.Test;

public class TestTest {

    @Test
        public  void test() {
            String[] header = {"Яблоки", "Апельсины","Арбузы"};
            Integer[][] data = {{100,200,100},{50,60,70},{10,20,30}};

            AppData testData = new AppData(header, data);

            WorkWithFile file = new WorkWithFile();
            file.saveFile(testData);
            file.readFile();
        }
}
