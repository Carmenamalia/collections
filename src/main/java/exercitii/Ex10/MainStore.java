package exercitii.Ex10;

public class MainStore {
    public static void main(String[] args) {
        Product product = new Product("carnati",20,Category.MEZELURI);
        Product product2 = new Product("muschi",35,Category.MEZELURI);
        Product product3 = new Product("iaurt",7,Category.LACTATE);
        Product product4 = new Product("lapte",12,Category.LACTATE);
        Product product5 = new Product("morcovi",5,Category.LEGUME);
        Product product6 = new Product("telina",9,Category.LEGUME);

        Store store = new Store();

        store.addProduct(product);
        store.addProduct(product2);
        store.addProduct(product3);
        store.addProduct(product4);
        store.addProduct(product5);
        store.addProduct(product6);

        System.out.println(store.getProductsByCategory(Category.MEZELURI));
        System.out.println(store.getProductsByCategory(Category.LACTATE));
        System.out.println(store.getProductsByCategory(Category.LEGUME));
        System.out.println(store.getAllCategories());
        store.deleteProduct(product2);
        System.out.println(store.getProductsByCategory());
    }
}
