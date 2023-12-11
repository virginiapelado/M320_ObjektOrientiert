public class NewYorkStockExchange implements StockExchange {
    @Override
    public double getPrice(Stock stock) {
        if (stock.equals("MSFT")) { //microsoft
            return 80.0; // $
        }
        return 0.0;
    }
}


