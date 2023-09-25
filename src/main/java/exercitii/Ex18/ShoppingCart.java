package exercitii.Ex18;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    //Clasa ShoppingCart va avea ca atribut o mapa, in care ca si cheie este produsul, iar ca si valoare este cantitatea
// (cate produse de acel fel) sunt in cosul de cumparaturi.
    private Map<Product, Integer> cartItems;

    public ShoppingCart() {
        this.cartItems = new HashMap<>();
    }

    public Map<Product, Integer> getCartItems() {
        return cartItems;
    }

    public void setCartItems(Map<Product, Integer> cartItems) {
        this.cartItems = cartItems;
    }

    //Adaugare produs in cosul de cumparaturi (in mapa)
    public void addToCart(Product product, Integer quantity) {
        if (cartItems.containsKey(product)) {
            cartItems.put(product, cartItems.get(product) + quantity);
        } else {
            cartItems.put(product, quantity);
        }
    }

    //Stergerea unui anumit numar de bucati al unui produs din cosul de cumparaturi (din mapa)
    public void removeFromCart(Product product, Integer quantity) {
        cartItems.remove(product, quantity);
    }

    //Stergerea unui produs cu totul din cosul de cumparaturi (din mapa)
    public void removeFromCart(Product product) {
        cartItems.remove(product);
    }

    //Calcul pret total al produselor cosul de cumparaturi (din mapa)
    public void getTotalPrice() {
        int sum = 0;
        for (Product product : cartItems.keySet()) {
            sum += product.getPrice();
        }
        System.out.println(sum);
    }
}
