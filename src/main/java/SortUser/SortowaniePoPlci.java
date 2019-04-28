package SortUser;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SortowaniePoPlci {


    public void Sortowanie() throws IOException {


        File file = new File("C:\\Users\\Oleg Dzhum\\Desktop\\WorkWithFile\\src\\main\\resources\\users.txt");

        List<User> usersK = new ArrayList<User>();
        List<User> usersM = new ArrayList<User>();

        LineIterator zawartoscPliku = FileUtils.lineIterator(file, "UTF-8");
        // wykonuje sie do poki jest nastepna linija w pliku
        while (zawartoscPliku.hasNext()) {
            // dodaje do tablicy i rozdziela linie na pojeyncze slowa, seperator spacja
            String[] line = zawartoscPliku.nextLine().split(" ");
//            dodaje osoby do tablicy
//            users.add(new User(line[0], line[1], Integer.valueOf(line[2])));// Integer.valueOf - parsuje zmienia jeden typ na drugi
// przekstalca 3 miejsce w tablicy ze stringa w int  i porownuje czy jest wiekszy 18
            if (Integer.valueOf(line[2]) > 17) {
                // sprawdza jezeli ostatni indeks w tabeli jest "a" to zapisuje do tabeli z kobietami w inny przypadku do tabeli z Facetami
                if (line[0].endsWith("a")) {
                    usersK.add(new User(line[0], line[1], Integer.valueOf(line[2])));
                } else {
                    usersM.add(new User(line[0], line[1], Integer.valueOf(line[2])));
                }
            }
        }
    }
}
