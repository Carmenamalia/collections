package algoritmica;

import java.util.*;

public class Ex3 {
    //.Sa se verifice daca un array contine duplicate
    //Exemplu:
    //Input: [6,5,6,2,3,1]
    //Output: true, pentru ca 6 apare de doua ori
    //(hint: construieste o mapa care sa numere de cate ori apare fiecare element din lista)
    public static void main(String[] args) {
        List<Integer> arr = List.of(6, 5, 6, 2, 3, 1, 2);
        System.out.println(getNumberOfRepetition(arr));
        isNumberRepetead(arr);
    }

    public static Map<Integer, Integer> getNumberOfRepetition(List<Integer> arr) {
        Map<Integer, Integer> numberOfElements = new HashMap<>();
        for (Integer number : arr) {
            if (numberOfElements.containsKey(number)) {
                numberOfElements.put(number, numberOfElements.get(number) + 1);
            } else {
                numberOfElements.put(number, 1);
            }
        }
        return numberOfElements;
    }

    public static void isNumberRepetead(List<Integer> arr) {
        for (Map.Entry<Integer, Integer> entry : getNumberOfRepetition(arr).entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (value > 1) {
               boolean isRepetead = true;
                System.out.println(isRepetead + ", se repeta: " + key);
            }
        }
    }
}

