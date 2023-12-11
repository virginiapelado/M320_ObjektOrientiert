import java.util.*;

// MainClass.java
public class Main {
    public static void main(String[] args) {
        //creates stock market and passes it on portfolio
        List<Stock> stocks = new ArrayList<>();
        stocks.add(new Stock("MSFT", 10)); // 10 shares of Microsoft

        StockExchange newYorkStockExchange = new NewYorkStockExchange();
        StockExchange zurichStockExchange = new ZurichStockExchange();

        Portfolio portfolioNY = new Portfolio(stocks, newYorkStockExchange);
        Portfolio portfolioZurich = new Portfolio(stocks, zurichStockExchange);

        portfolioNY.calculatePortfolioValue();
        portfolioZurich.calculatePortfolioValue();

    }
}
