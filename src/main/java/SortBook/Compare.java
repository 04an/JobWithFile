package SortBook;

import java.math.BigDecimal;

public class Compare implements Comparable<Compare> {
    private String title;
    private BigDecimal price;
    private Boolean instock;


    public Compare(String title, BigDecimal price, Boolean instock) {
        this.title = title;
        this.price = price;
        this.instock = instock;
    }

// w taki sposob bedzie pokazywala sie informacja  przy wyswietleniu
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", instock=" + instock +
                '}'+"\n";
    }

    // metoda do porownania
    public int compareTo(Compare compare) {
        // porownuje ksiazki po parametrach i zapisuje wynik do zmienych
        int titleCompare = title.compareTo(compare.title);
        int priceCompare = compare.price.compareTo(price);
        int stockCompare = compare.instock.compareTo(instock);
// sprawdza czy ksiazka ma inny czy taki sam parametr i wrazie takiego samego pierwszego parametru sortuje po druig
        if (stockCompare == 0) {
            // sortyje po drugim parametrze
            return compare.price.compareTo(price);
        }
        // sortuje po pierwszym paramentrze
        return stockCompare;
    }


}
