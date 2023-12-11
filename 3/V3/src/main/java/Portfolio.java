import java.util.*;

public class Portfolio {
    private List<Stock> stocks;
    private StockExchange stockExchange;

    public Portfolio(List<Stock> stocks, StockExchange stockExchange) {
        this.stocks = stocks;
        this.stockExchange = stockExchange;
    }

    public void calculatePortfolioValue() {
        double totalValue = 0.0;
        for (Stock stock : stocks) {
            double stockPrice = stockExchange.getPrice(stock);
            double stockValue = stockPrice * stock.getQuantity();
            totalValue += stockValue;
            System.out.println("Stock: " + stock.getSymbol() + ", Quantity: " + stock.getQuantity() +
                    ", Price: " + stockPrice + ", Value: " + stockValue);
        }
        System.out.println("Total Portfolio Value: " + totalValue);
    }
}
