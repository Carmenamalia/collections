package exercitii.Ex12;

import java.util.List;
import java.util.TreeSet;

public class Ex_12 {
    //Scrie o metoda care:
    //Primeste ca parametru o lista de numere
    //Afiseaza cel mai mic si cel mai mare element din lista
    //HINT: (alt mod de rezolvare decat cel clasic): adauga toate elementele din lista intr-un treeset,
    // apoi apeleaza metodele first() si last() pe acel treeset
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 2, 1, 4, 7, 6, 5);
        printExtremes(numbers);
    }
    public static void printExtremes(List<Integer> numbers){
        TreeSet<Integer> set = new TreeSet<>(numbers);
        System.out.println(set.first());
        System.out.println(set.last());
    }
}
