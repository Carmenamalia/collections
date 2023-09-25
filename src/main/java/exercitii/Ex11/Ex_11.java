package exercitii.Ex11;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex_11 {
    //Scrie o metoda care:
    //Primeste ca parametru o lista de numere, care are un element duplicat
    //Returneaza elementul duplicat
    //HINT: (alt mod de rezolvare decat cel clasic): metoda add din interfata Set returneaza false,
    // daca nu poate adauga elementul primit ca parametru in set
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 3, 4, 5);
        System.out.println("duplicat: " + returnDuplicate(numbers));
    }
    public static int returnDuplicate(List<Integer> numbers) {
        Set<Integer> set = new HashSet<>();
        for (int number : numbers) {
            if (!set.add(number)) {
                return number;
            }
        }return -1;
    }
}
