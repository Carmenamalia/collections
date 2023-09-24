package exercitii.stockmanagementEx9;

import java.util.HashMap;
import java.util.Map;

public class MainStockMarket {
    //Exemplu: {Oracle=56, Google=421, Tesla=950}
    public static void main(String[] args) {
        Map<String,Integer> stockPriceByCompany = new HashMap<>();
        stockPriceByCompany.put("Oracle",56);
        stockPriceByCompany.put("Google",421);
        stockPriceByCompany.put("Tesla",950);
        StockMarket stockMarket = new StockMarket(stockPriceByCompany);

        System.out.println("compania cu cel mai mare pret al unei actiuni :");
        System.out.println(stockMarket.getMostExpensiveCompany());

        System.out.println("pretul mediu al preturilor actiunilor:");
        System.out.println(stockMarket.getAverageSharePrice());

        System.out.println("lista companiilor din mapa cu valoarea actiunilor fiecareia:");
        System.out.println(stockPriceByCompany.entrySet());
    }
}
