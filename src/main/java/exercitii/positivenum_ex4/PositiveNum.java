package exercitii.positivenum_ex4;

import java.util.*;

public class PositiveNum {
    public static void main(String[] args) {
 //Scrie o metoda care:
        //Primeste ca parametru 2 liste de numere si returneaza un set format din numerele pozitive din ambele liste primite
        // ca parametru
        //Exemplu:
        //Input: {1, -2, 3, 4, 4, -5}, {1, -7, 2}
        //Output: {1, 3, 4, 2}

        List<Integer> numbers1 = Arrays.asList(1, -2, 3, 4, 4, -5);
        List<Integer> numbers2 = Arrays.asList(1, -7, 2);
        //apelez metoda de selectare a numerelor din liste
        System.out.println(findPositiveNumbers(numbers1,numbers2));
    }
    public static Set<Integer> findPositiveNumbers(List<Integer> numberList1,List<Integer> numberList2){
        Set<Integer> positiveNumbers = new HashSet<>();
        for (int number:numberList1){
            if (number>=0){
                positiveNumbers.add(number);
            }
        }
        for (int number:numberList2){
            if (number>=0){
                positiveNumbers.add(number);
            }
        }
        return positiveNumbers;
    }
}
