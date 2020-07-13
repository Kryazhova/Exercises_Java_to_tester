package ru.fruit;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class TestTest {


    @Test
    public void test() throws IOException {
        String[] header = {"Яблоки", "Апельсины", "Арбузы"};
        Integer[][] data = {{100, 200, 100}, {50, 60, 70}, {10, 20, 30}};

        AppData testData = new AppData(header, data);

        WorkWithFile file = new WorkWithFile();
        file.saveFile(testData);
        file.readFile();

        Path path = Paths.get("src/test/resources/testFile.csv");
        Assert.assertTrue(Files.exists(path));

        List<String> testString = Files.readAllLines(path);
        Assert.assertTrue(testString.contains("Яблоки;Апельсины;Арбузы;"));
    }

}
