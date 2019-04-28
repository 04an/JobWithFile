package SortBook;

import java.math.BigDecimal;

public class Book {
    private String title;
    private BigDecimal price;
    private Boolean instock;

    public Book(String title, BigDecimal price, Boolean instock) {
        this.title = title;
        this.price = price;
        this.instock = instock;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Boolean getInstock() {
        return instock;
    }

    public void setInstock(Boolean instock) {
        this.instock = instock;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", instock=" + instock +
                '}';
    }
}
