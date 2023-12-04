// Portfolio.java
import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private List<Stock> stocks = new ArrayList<>();

    public Portfolio(List<Stock> stocks) {
        this.stocks.addAll(stocks);
    }

    public double calculatePortfolioValue(StockEExchange stockExchange) {
        double totalValue = 0;
        for (Stock stock : stocks) {
            totalValue += stock.getPrice(stockExchange);
        }
        return totalValue;
    }
    public void createPortfolio() {
        Stock microsoftZurich = new StockImp("MSFT", 90);
        Stock microsoftNewYork = new StockImp("MSFT", 80);

        List<Stock> stockList = new ArrayList<>();
        stockList.add(microsoftZurich);
        stockList.add(microsoftNewYork);

        StockEExchange realStockMarket = new RealStockMarket();

        Portfolio portfolio = new Portfolio(stockList);

        double portfolioValue = portfolio.calculatePortfolioValue(realStockMarket);
        System.out.println("Portfolio Value: $" + portfolioValue);
    }
}
