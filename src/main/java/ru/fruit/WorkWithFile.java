package ru.fruit;

import java.io.*;


public class WorkWithFile {
    String pathFile = "src/test/resources/testFile.csv";

    public void saveFile(AppData data){
        try(BufferedWriter writeFile = new BufferedWriter(new FileWriter(pathFile))) {
            writeFile.write(data.dataToString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFile(){
        try(BufferedReader readFile = new BufferedReader(new FileReader(pathFile))) {
            String testRead;
            while ((testRead = readFile.readLine()) != null) {
                System.out.println(testRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
