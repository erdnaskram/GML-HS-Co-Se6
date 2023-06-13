package hs.gml.uebung1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\erdna\\Documents\\Git\\GML-HS-Co-Se6\\GML\\src\\main\\java\\hs\\gml\\uebung1\\uebung01.csv";

        CsvReader reader = new CsvReader();

        ArrayList<String[]> tabelle = reader.readCsv(path, ",");

        for (String[] strings : tabelle) {
            for (String string : strings) {
                System.out.print(string +"|");
            }
            System.out.println(";");

        }


    }
}
