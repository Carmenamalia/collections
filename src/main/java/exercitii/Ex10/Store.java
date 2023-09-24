package exercitii.Ex10;

import java.util.*;

public class Store {
    private Map<Category, List<Product>> productsByCategory;

    public Store(Map<Category, List<Product>> productsByCategory) {
        this.productsByCategory = productsByCategory;
    }
    public Store(){
        this.productsByCategory = new HashMap<>();
//        this.productsByCategory.put(Category.LACTATE,new ArrayList<>());
//        this.productsByCategory.put(Category.MEZELURI,new ArrayList<>());
//        this.productsByCategory.put(Category.LEGUME,new ArrayList<>());
    }

    public Map<Category, List<Product>> getProductsByCategory() {
        return productsByCategory;
    }

    public void setProductsByCategory(Map<Category, List<Product>> productsByCategory) {
        this.productsByCategory = productsByCategory;
    }

    public void addProduct(Product product){
        //daca categoria produsului este deja in mapa adaugam un produs
        if (productsByCategory.containsKey(product.getCategory())){
            productsByCategory.get(product.getCategory()).add(product);//adaug produsul la cheia respectiva din mapa
        }else {//daca categoria(cheia) nu este in mapa,creez lista de produse(care va fi valoarea de la noua cheie din mapa)
            List<Product> valueProductList = new ArrayList<>();
            valueProductList.add(product);//adaug produsul in lista
            productsByCategory.put(product.getCategory(),valueProductList);//adaug categoria cu lista de produse in mapa
        }
    }

    //Va returna toate produsele dintr-o anumită categorie.
    public List<Product> getProductsByCategory(Category category){
        return productsByCategory.get(category);
    }
    //Va returna toate categoriile din mapa.
    public Set<Category> getAllCategories(){
        return productsByCategory.keySet();
    }

    //Va șterge un produs din mapa.
    public void deleteProduct(Product product){
        //trebuie sa cautam produsul din lista de la categoria produsului din mapa
        productsByCategory.get(product.getCategory()).remove(product);
    }
}
