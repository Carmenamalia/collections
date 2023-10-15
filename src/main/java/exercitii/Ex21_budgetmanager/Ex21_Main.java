package exercitii.Ex21_budgetmanager;

import java.util.ArrayList;
import java.util.List;

public class Ex21_Main {
    public static void main(String[] args) {
        User user1 = new User("Andrei", 5000.0);
        User user2 = new User("Marcel", 6000.0);

        Purchase purchase1 = new Purchase("alimente", 45.50, Category.FOOD);
        Purchase purchase2 = new Purchase("games", 40.80, Category.FUN);
        Purchase purchase3 = new Purchase("palton", 350.0, Category.CLOTHES);
        Purchase purchase4 = new Purchase("gaze", 30.30, Category.UTILITIES);
        Purchase purchase5 = new Purchase("inel", 2500.0, Category.OTHERS);
        Purchase purchase6 = new Purchase("unelte", 500.0, Category.OTHERS);
        Purchase purchase7 = new Purchase("cosmetice", 600.0, Category.OTHERS);

        List<Purchase> purchaseList1 = new ArrayList<>();
        List<Purchase> purchaseList2 = new ArrayList<>();

        purchaseList1.add(purchase1);
        purchaseList1.add(purchase3);
        purchaseList1.add(purchase4);
        purchaseList1.add(purchase6);

        purchaseList2.add(purchase2);
        purchaseList2.add(purchase5);
        purchaseList2.add(purchase7);

        user1.setPurchaseList(purchaseList1);
        user2.setPurchaseList(purchaseList2);
//Vizualizarea tututor cheltuielilor
        user1.printAllPuchases();
        user2.printAllPuchases();
//Vizualizarea categoriei in care a cheltuit cel mai mult/mai putin
        System.out.println("category with max purchase: " + user1.getCategoryByMaxPurchase());
        System.out.println("category with min purchase: " + user1.getCategoryByMinPurchase());
//Vizualizarea cheltuielilor grupate pe categorii
        System.out.println(user1.getExpensesByCategory());
        System.out.println(user2.getExpensesByCategory());
//Vizualizarea cheltuielilor dintr-o anumita categorie
        System.out.println("cheltuieli dintr- anumita categorie: " + user1.getExpensesByOneCategory(Category.OTHERS));
//Vizualizarea tuturor cheltuielilor dintr-un interval de pret
        System.out.println("cheltuieli dintr-un interval de pret: " + user1.getExpensesByGivenAmount(300.0, 2000.0));
        System.out.println("*****************************");
//Sortarea tuturor cheltuielilor dupa pret
        System.out.println(user1.sortExpensesByPrice());
        System.out.println(user2.sortExpensesByPrice());
        System.out.println("*************************");
//Sortarea cheltuielilor dintr-o anumita categorie dupa pret
        System.out.println(user1.sortExpensesByPriceByCategory(Category.OTHERS));
        System.out.println("*************************");

        List<User> users = List.of(user1, user2);
//Salvarea tuturor cheltuielilor intr-un fisier
        user1.saveAllPurchases(users);
//Setarea unui buget
        user1.setABudget(10000.0);
        user2.setABudget(15000.0);

        System.out.println(user1);
        System.out.println(user1);
//Vizualizarea bugetului disponibil
        user1.printBudget();
        //Adaugarea unei cheltuieli
        user1.addPurchase(purchase7);
        System.out.println(user1);
        //Stergerea unei cheltuieli
        user1.removePurchase(purchase6);
        System.out.println(user1);
    }
}
