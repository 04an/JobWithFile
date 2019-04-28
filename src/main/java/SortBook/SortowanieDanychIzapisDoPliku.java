package SortBook;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortowanieDanychIzapisDoPliku {

    public void  sortowanieIzapisywanie () throws IOException {
        File file = new File("C:\\Users\\Oleg Dzhum\\Desktop\\WorkWithFile\\src\\main\\resources\\books.csv");

        List<Compare> books = new ArrayList<Compare>();

        LineIterator zawartoscPliku = FileUtils.lineIterator(file, "UTF-8");
        // wykonuje sie do poki jest nastepna linija w pliku
        while (zawartoscPliku.hasNext()) {
            // dodaje do tablicy i rozdziela linie na pojeyncze slowa, seperator spacja
            String[] line = zawartoscPliku.nextLine().split(",");
// wylapanie erroru ltory spowodowany jest nieprawidlowym formatem danych w ktores linijce kodu
            try {
                books.add(new Compare(line[2], BigDecimal.valueOf(Double.parseDouble(line[3])), Boolean.valueOf(line[4])));
            } catch (NumberFormatException ex) {
                // mozna dodac loga
            }

        }
        // wyswietla nie posortowane dany
        System.out.println(books);
        // sortuje dane
        Collections.sort(books);
        //wyswietla posorowane dane
        System.out.println(books);

// zapisywania posortowanych danych do pliku
        File file1 = new File("C:\\Users\\Oleg Dzhum\\Desktop\\Books.txt");
        FileUtils.writeLines(file1, books);

    }
}
