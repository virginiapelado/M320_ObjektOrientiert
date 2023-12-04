public interface Stock {
    String getSymbol();
    double getPrice(StockEExchange stockExchange);
}