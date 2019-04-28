import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;


import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class App {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\Oleg Dzhum\\Desktop\\WorkWithFile\\src\\main\\resources\\weather-data.csv");
        List<DanePogodowe> historiaPogody = new ArrayList<DanePogodowe>();
        LineIterator zawartoscPliku = FileUtils.lineIterator(file, "UTF-8");
        // wykonuje sie do poki jest nastepna linija w pliku
        while (zawartoscPliku.hasNext()) {
            // dodaje do tablicy i rozdziela linie na pojeyncze slowa, seperator spacja
            String[] line = zawartoscPliku.nextLine().split(",");
            // Ustawia format dla pobranej daty wedlug podanego wzpru
            DateTimeFormatter DATEFORMATTER = DateTimeFormatter.ofPattern("M/d/yyyy");
            // wylapanie erroru ltory spowodowany jest nieprawidlowym formatem danych w ktores linijce kodu
            try {
                // dodaje dane do listy w takiej kolejnosci i formacie jak podalem w konstruktorze klasy DanePogodowe
                historiaPogody.add(new DanePogodowe(LocalDate.parse(line[0], DATEFORMATTER), Double.parseDouble(line[1]), Double.parseDouble(line[2]), Double.parseDouble(line[3])));
                // lapie errory zeby program pracowaw dalej
            } catch (NumberFormatException | DateTimeParseException ex) {
                // mozna dodac loga
            }
        }

        System.out.println(historiaPogody);
        LocalDate dateFrom = PobracDaneOdUsera.pobracdane().minusDays(1);
        LocalDate dateTo = PobracDaneOdUsera.pobracdane().plusDays(1);


    }
}
