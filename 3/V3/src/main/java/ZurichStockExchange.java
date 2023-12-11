// ZurichStockExchange.java
public class ZurichStockExchange implements StockExchange {

    @Override
    public double getPrice(Stock stock) {
        if (stock.getSymbol().equals("MSFT")) { //microsoft
            return 90.0; // CHF
        }
        return 0.0;
    }
}