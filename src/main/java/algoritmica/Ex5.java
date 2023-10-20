package algoritmica;

import java.util.*;

public class Ex5 {
    //Grupeaza elementele dintr-un array astfel incat elementele duplicate sa fie unul langa altul
    //Exemplu:
    //Input: { 1, 2, 3, 1, 2, 1 }
    //Output: { 1, 1, 1, 2, 2, 3 }
    //(hint: construieste o mapa in care cheia este elementul, iar valoarea de cate ori apare.
    // Apoi construieste rezultatul parcurgand mapa si adaugand elementele unul dupa altul intr-un nou array,
    // in functie de mumarul de aparitii al fiecarui element)
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 1, 2, 1);
        //rezolvare prin expresie lambda
        List<Integer> sortedNumbers = numbers.stream()
                .sorted().toList();
        System.out.println(sortedNumbers);
        //rezolvare dupa cerinta:
        //apelez metoda de construire a mapei in care cheia este elementul, iar valoarea de cate ori apare.
        System.out.println(getSortedMap(numbers));
        //apelez metoda de construire a listei care grupeaza elementele dupa nr de repetitii
        System.out.println(getSortedList(numbers));

    }

    public static List<Integer> getSortedList(List<Integer> numbers) {
        Map<Integer, Integer> duplicateNumbers = getSortedMap(numbers);
        List<Integer> result = new ArrayList<>();
        //parcurg mapa
        for (Map.Entry<Integer, Integer> entry : duplicateNumbers.entrySet()) {
            int key = entry.getKey();
            int count = entry.getValue();
//parcurg fiecare entry in functie de valoare(count)
            for (int i = 0; i < count; i++) {
                //adaug la noua lista cheia de atatea ori de cate este valoarea
                if (result.contains(key)) {
                    result.add(key);
                } else {
                    result.add(key);
                }
            }
        }
        return result;
    }

    public static Map<Integer, Integer> getSortedMap(List<Integer> numbers) {
        Map<Integer, Integer> duplicateNumbers = new HashMap<>();
        //parcurg lista de numere
        for (Integer num : numbers) {
            //daca nr exista deja la cheie maresc valoarea
            if (duplicateNumbers.containsKey(num)) {
                duplicateNumbers.put(num, duplicateNumbers.get(num) + 1);
            } else {
                //daca nu este il adaug la cheie cu valoarea 1
                duplicateNumbers.put(num, 1);
            }
        }
        return duplicateNumbers;
    }
}
