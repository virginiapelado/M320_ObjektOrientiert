public class StockImp implements Stock {
    private double price;
    private String symbol;

    public StockImp(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
    }
    @Override
    public String getSymbol() {
        return symbol;
    }

    @Override
    public double getPrice(StockEExchange stockExchange) {
        return stockExchange.getPrice(this);
    }
}