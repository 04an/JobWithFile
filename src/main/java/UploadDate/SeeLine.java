package UploadDate;

import java.io.*;

public class SeeLine {

    public SeeLine() throws IOException {
        // wsczytywanie pliku linia po linii
        File file = new File("C:\\Users\\Oleg Dzhum\\Desktop\\WorkWithFile\\src\\main\\resources\\simpleExample.txt");
        FileReader fis = new FileReader(file);
        String linia = "";
        BufferedReader bfr = new BufferedReader(fis);
        // wyswietlaj dopoki jest nastepna linia
        while ((linia = bfr.readLine()) != null) {
            System.out.println(linia);
        }
    }
}
