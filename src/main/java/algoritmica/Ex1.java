package algoritmica;

import java.util.ArrayList;
import java.util.List;


public class Ex1 {
    //Afla profitul maxim pe care il poti face cumparand si vanzand actiuni.
    //Ca si input ai un array cu preturile unei actiuni in fiecare zi. Va trebui sa determini in ce zi trebuie sa cumperi
    // si in ce zi trebuie sa vinzi ca sa obtii profitul maxim
    //Exemplu:
    //Input: [100, 180, 260, 310, 40, 535, 695]
    //Output: Cumpara in ziua 5 (la pretul de 40) si vinde in ziua 7 (la pretul de 695), adica profit maxim 695-40=655
    //Input2: [2, 3, 10, 6, 4, 8, 1]
    //Output: Cumpara in ziau 0 (la pretul de 2) si vinde in ziua 2 (la pretul de 10), adica profit maxim 10-2=8
    public static void main(String[] args) {
        List<Integer> prices = List.of(100, 180, 260, 310, 40, 535, 695);
        List<Integer> prices2 = List.of(2, 3, 10, 6, 4, 8, 1);
        List<Integer> prices3 = new ArrayList<>();
        List<Integer> prices4 = List.of(2);

        getBestTransactions(prices);
        getBestTransactions(prices2);
        getBestTransactions(prices3);
        getBestTransactions(prices4);

    }

    public static void getBestTransactions(List<Integer> prices) {
        int maxPrice = 0;
        int minPrice = Integer.MAX_VALUE;
        int sellDay = 0;
        int buyDay = 0;
        if (prices == null || prices.size() < 2) {
            System.out.println("Nu există suficiente prețuri pentru a calcula profitul.");
        } else {
            for (int i = 0; i < prices.size(); i++) {
                if (prices.get(i) > maxPrice) {
                    maxPrice = prices.get(i);
                    sellDay = i;
                }
                if (prices.get(i) < minPrice) {
                    minPrice = prices.get(i);
                    buyDay = i;
                }
            }
            int maxProfit = maxPrice - minPrice;
            System.out.println("cumpara in ziua " + buyDay + "(la pretul de " + minPrice + ") " + " si vinde in ziua " + sellDay + "(la pretul de " + maxPrice + ") ,profitul maxim e " + maxProfit);
        }
    }

}


