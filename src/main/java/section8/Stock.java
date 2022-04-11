package section8;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Stock {
    private String symbol;
    private double price;
    private double units;

    public Stock(String symbol, double price, double units) {
        this.symbol = symbol;
        this.price = price;
        this.units = units;
    }

    @Override
    public String toString() {
        return "Stock [symbol=" + symbol + ", price=" + price + ", units=" + units + "]";
    }
}
