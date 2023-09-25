package exercitii.Ex18;

import exercitii.Ex10.Category;

public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product1 = new Product("lapte",8, Category.LACTATE);
        Product product2 = new Product("iaurt",5, Category.LACTATE);
        Product product3 = new Product("salam",20, Category.MEZELURI);
        Product product4 = new Product("carnati",17, Category.MEZELURI);
        Product product5 = new Product("morcovi",6, Category.LEGUME);
        Product product6 = new Product("mere",4, Category.LEGUME);
        //cheia e produsul(care are nume,pret si categorie) si valoarea e cantitatea din cos
        shoppingCart.addToCart(product1,2);
        shoppingCart.addToCart(product2,3);
        shoppingCart.addToCart(product3,2);
        shoppingCart.addToCart(product4,5);
        shoppingCart.addToCart(product5,4);
        shoppingCart.addToCart(product6,3);

        shoppingCart.getTotalPrice();

        shoppingCart.removeFromCart(product2,1);

        shoppingCart.removeFromCart(product2);

        shoppingCart.getTotalPrice();
    }
}
