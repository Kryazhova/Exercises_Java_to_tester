package ru.fruit;

import org.omg.CORBA.Any;

import java.util.Arrays;

public class AppData {

    private String[] header;
    private Integer[][] data;

    public AppData(String[] header, Integer[][] data) {
        this.header = header;
        this.data = data;
    }

    public <T> String getFileRow(T[] arr) {
        String str = "";
        for (T column : arr) {
            str += column + ";";
        }
        str += "\n";
        return str;
    }

    public String dataToString() {
        String str = "";
        str += this.getFileRow(header);

        for(Integer[] row: data) {
            str += this.getFileRow(row);
        }
        return str;
    }

}
