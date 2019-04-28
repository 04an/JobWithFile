import java.time.LocalDate;

public class DanePogodowe implements Comparable<DanePogodowe> {
    private LocalDate data;
    private Double minT;
    private Double maxT;
    private Double averegT;

    public DanePogodowe(LocalDate data, Double maxT, Double averegT, Double minT) {
        this.minT = minT;
        this.maxT = maxT;
        this.averegT = averegT;
        this.data = data;
    }

        public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Double getMinT() {
        return minT;
    }

    public void setMinT(Double minT) {
        this.minT = minT;
    }

    public Double getMaxT() {
        return maxT;
    }

    public void setMaxT(Double maxT) {
        this.maxT = maxT;
    }

    public Double getAveregT() {
        return averegT;
    }

    public void setAveregT(Double averegT) {
        this.averegT = averegT;
    }

    @Override
    public String toString() {
        return "DanePogodowe{" +
                "data='" + data + '\'' +
                ", minT=" + minT +
                ", maxT=" + maxT +
                ", averegT=" + averegT +
                '}' + "\n";
    }


    public int compareTo(DanePogodowe danePogodowe) {
        int minTcompare = minT.compareTo(danePogodowe.minT);
        int maxTcompare = maxT.compareTo(danePogodowe.maxT);
        int averegeTcompare = averegT.compareTo(danePogodowe.averegT);
        return 0;
    }
}
