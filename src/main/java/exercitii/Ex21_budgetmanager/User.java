package exercitii.Ex21_budgetmanager;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class User {
    private String username;
    private Double maxBudget;
    private List<Purchase> purchaseList;

    public User(String username, Double maxBudget) {
        this.username = username;
        this.maxBudget = maxBudget;
        purchaseList = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Double getMaxBudget() {
        return maxBudget;
    }

    public void setMaxBudget(Double maxBudget) {
        this.maxBudget = maxBudget;
    }

    public List<Purchase> getPurchaseList() {
        return purchaseList;
    }

    public void setPurchaseList(List<Purchase> purchaseList) {
        this.purchaseList = purchaseList;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", maxBudget=" + maxBudget +
                ", purchaseList=" + purchaseList +
                '}';
    }

    //Vizualizarea tututor cheltuielilor
    public void printAllPuchases() {
        System.out.println(purchaseList);
    }
//Vizualizarea cheltuielilor dintr-o anumita categorie
public Double getExpensesByOneCategory(Category category){
        Double expenses = 0.0;
        for (Purchase purchase:purchaseList){
            expenses += purchase.getPrice();
        }
        return expenses;
}

//Vizualizarea cheltuielilor grupate pe categorii
public Map<Category,Double> getExpensesByCategory(){
    Map<Category,Double> expensesByCategory = new HashMap<>();
    Double expenses = 0.0;
    for (Purchase purchase:purchaseList){
        expenses = purchase.getPrice();
        expensesByCategory.put(purchase.getCategory(),purchase.getPrice()+expenses);
    }
    return expensesByCategory;
}

    //Vizualizarea categoriei in care a cheltuit cel mai mult/mai putin
    public Category getCategoryByMaxPurchase() {
        Map<Category, Double> priceByCategory = new HashMap<>();
        Double maxTotalPurchase = 0.0;
        Category categoryByMaxPurchase = null;
        for (int i = 0; i < purchaseList.size(); i++) {
            Category category = purchaseList.get(i).getCategory();
            Double price = purchaseList.get(i).getPrice();
            if (priceByCategory.containsKey(category)) {
                priceByCategory.put(category, price);
            } else {
                priceByCategory.put(category, purchaseList.get(i).getPrice() + price);
            }
        }
        //parcurg mapa cu keyset si care are valoarea mai mare iau cheia
        for (Category category1 : priceByCategory.keySet()) {
            if (priceByCategory.get(category1) > maxTotalPurchase) {
                maxTotalPurchase = priceByCategory.get(category1);
                categoryByMaxPurchase = category1;
            }
        }
        return categoryByMaxPurchase;
    }

    public Category getCategoryByMinPurchase() {
        Map<Category, Double> priceByCategory = new HashMap<>();
        Double minTotalPurchase = Double.MAX_VALUE;
        Category categoryByMinPurchase = null;
        for (int i = 0; i < purchaseList.size(); i++) {
            Category category = purchaseList.get(i).getCategory();
            Double price = purchaseList.get(i).getPrice();
            if (priceByCategory.containsKey(category)) {
                priceByCategory.put(category, price);
            } else {
                priceByCategory.put(category, purchaseList.get(i).getPrice() + price);
            }
        }
        for (Category category1 : priceByCategory.keySet()) {
            if (priceByCategory.get(category1) < minTotalPurchase) {
                minTotalPurchase = priceByCategory.get(category1);
                categoryByMinPurchase = category1;
            }
        }
        return categoryByMinPurchase;
    }
//Vizualizarea tuturor cheltuielilor dintr-un interval de pret
    public List<Purchase> getExpensesByGivenAmount(Double min,Double max){
        List<Purchase> expensesByGivenAmount = new ArrayList<>();
        for (Purchase purchase:purchaseList){
            if (purchase.getPrice()>min&&purchase.getPrice()<max){
                expensesByGivenAmount.add(purchase);
            }
        }return expensesByGivenAmount;
    }

//Sortarea tuturor cheltuielilor dupa pret
    public List<Purchase> sortExpensesByPrice(){
       return purchaseList.stream()
               .sorted(Comparator.comparing(purchase -> purchase.getPrice()))
               .collect(Collectors.toList());
    }

//Sortarea cheltuielilor dintr-o anumita categorie dupa pret
public List<Purchase> sortExpensesByPriceByCategory(Category category){
    return purchaseList.stream()
            .filter(purchase -> purchase.getCategory().equals(category))
            .sorted(Comparator.comparing(purchase -> purchase.getPrice()))
            .collect(Collectors.toList());
}

//Salvarea tuturor cheltuielilor intr-un fisier
    public void saveAllPurchases(List<User> users){
        List<Purchase> allPurchases = new ArrayList<>();
     for (User user:users){
         List<Purchase> userPurchases = user.getPurchaseList();
         allPurchases.addAll(userPurchases);
     }
        System.out.println(allPurchases);
    }

//Incarcarea in aplicatie a tuturor cheltuielilor dintr-un fisier
    //??????????????????

//Setarea unui buget
public void setABudget(Double budget){
       setMaxBudget(budget);
}
//Vizualizarea bugetului disponibil
    public void printBudget(){
        System.out.println(maxBudget);
    }

//Adaugarea unei cheltuieli
    public void addPurchase(Purchase purchase){
        purchaseList.add(purchase);
    }

//Stergerea unei cheltuieli
    public void removePurchase(Purchase purchase){
        for (Purchase purchase1:purchaseList){
            if (purchase1.equals(purchase)){
                purchaseList.remove(purchase1);
            }
        }
    }
}
