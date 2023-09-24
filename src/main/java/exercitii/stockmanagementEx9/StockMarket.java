package exercitii.stockmanagementEx9;

import java.util.Map;

public class StockMarket {
    //Scrie o aplicatie pentru bursa
    //O bursa este structurata sub forma unei mape, cu cheia fiind numele companiei si valoarea fiind pretul unei actiuni
    // la acea companie.
   private Map<String,Integer> stockPriceByCompany;

    public StockMarket(Map<String, Integer> stockPriceByCompany) {
        this.stockPriceByCompany = stockPriceByCompany;
    }

    public Map<String, Integer> getStockPriceByCompany() {
        return stockPriceByCompany;
    }

    public void setStockPriceByCompany(Map<String, Integer> stockPriceByCompany) {
        this.stockPriceByCompany = stockPriceByCompany;
    }
    //O metoda care sa gaseasca compania cu cel mai mare pret al unei actiuni din mapa
    public String getMostExpensiveCompany(){
        int maxPrice = 0;
        String mostExpensiveCompany = "";
//      for (String companyName:stockPriceByCompany.keySet()){
//          if (stockPriceByCompany.get(companyName)>maxPrice){
//              maxPrice = stockPriceByCompany.get(companyName);
//              mostExpensiveCompany = companyName;
//          }
//      }
      for (Map.Entry<String,Integer> entry:stockPriceByCompany.entrySet()){
          if (entry.getValue()>maxPrice){
              maxPrice = entry.getValue();
              mostExpensiveCompany = entry.getKey();
          }
      }

      return mostExpensiveCompany;
    }
    //O metoda care sa gaseasca pretul mediu al preturilor actiunilor din mapa
    public double getAverageSharePrice(){
        double sum = 0;
//        for (String companyName:stockPriceByCompany.keySet()){
//            sum+=stockPriceByCompany.get(companyName);
//        }
//        return sum;
        for (Integer price:stockPriceByCompany.values()){
            sum+=price;
        }
        return sum/stockPriceByCompany.size();
    }
}
