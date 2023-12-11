// RealStockMarket.java
public class StockMarket implements StockExchange {
    @Override
    public double getPrice(Stock stock) {
        // Display a comment for the user
        System.out.println("Fetching stock price for " + stock.getSymbol() + " in RealStockMarket.");

        // Return the predefined prices based on the symbol
        return stock.getSymbol().equals("MSFT") ? 90 : 80;
    }
}
