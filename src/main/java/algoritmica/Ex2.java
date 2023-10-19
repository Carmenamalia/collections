package algoritmica;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    //Inlocuieste fiecare element dintr-un array cu produsul tuturor celorlalte elemente
    //Exemplu:
    //
    //Input: { 1, 2, 3, 4, 5 }
    //Output: { 120, 60, 40, 30, 24 }
    //(hint: foloseste un alt array in care sa pui rezultatul)
    public static void main(String[] args) {
        List<Integer> arr1 = List.of( 1, 2, 3, 4, 5);
        List<Integer> arr2 = new ArrayList<>();
        int product = 1;
        for (int i = 0; i < arr1.size(); i++) {
            for (int j = 0; j < arr1.size(); j++) {
                if (j!=i) {
                    product *= arr1.get(j);
                }
            }arr2.add(product);
            product=1;
        }
        System.out.println(arr2);
    }

}
