package algoritmica;

import java.util.List;


public class Ex4 {
    // Sunt afisate n-1 numere dintr-un interval de la 1 la n. Sa se gaseasca numarul care lipseste.
    //Exemplu:
    //Input: n=7, a=[3,2,1,6,5,7]
    //Output: 4 - lipseste doar 4 din array.
    //(hint: sorteaza array-ul si verifica daca gasesti o diferenta de 2 intre 2 elemente consecutive.
    // Unde gasesti diferenta, acolo va fi si numarul care lipseste. Gandeste-te apoi si la alta metoda de rezolvare)
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 2, 1, 6, 5, 7);
        List<Integer> numbers1 = List.of(7, 8, 1, 3, 4, 6, 2, 9);
        getMissingNumber(numbers);
        getMissingNumber(numbers1);
    }

    public static void getMissingNumber(List<Integer> numbers) {
        List<Integer> sortNumb = numbers.stream()
                .sorted().toList();
        System.out.println("lista sortata: " + sortNumb);

        for (int i = 0; i < sortNumb.size() - 1; i++) {

            if (sortNumb.get(i + 1) - sortNumb.get(i) == 2) {
                int missingNumber = sortNumb.get(i) + 1;
                System.out.println(missingNumber + " este numarul lipsa");
            }
        }

    }
}
