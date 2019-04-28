import java.time.LocalDate;
import java.util.Scanner;

public class PobracDaneOdUsera {

    public static LocalDate pobracdane() {
        Scanner scanner = new Scanner(System.in);
         String daneUsera = scanner.nextLine();

        return LocalDate.parse(daneUsera);
    }
}


