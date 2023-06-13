package hs.gml.uebung1;

import java.util.ArrayList;
import java.io.*;

public class CsvReader {

    public ArrayList<String[]> readCsv(String path, String cvsSplitBy) {
        ArrayList<String[]> tabelle = new ArrayList<String[]>();
        System.out.println(path);

        BufferedReader br = null;
        String line = "";

        try {
            br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] row = line.split(cvsSplitBy);
                tabelle.add(row);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        return tabelle;
    }
}
