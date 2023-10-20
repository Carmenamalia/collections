package algoritmica;

import java.util.*;


public class Ex6 {
    //Gaseste diferenta maxima intre 2 numere dintr-o lista, astfel incat elementul mai mic sa apara inaintea elementului mai mare
    //Exemplu:
    //Input: [2,7,9,5,1,3,5]
    //Output: 7 (perechea de numere care indeplineste conditia este (2,9)
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 7, 9, 5, 1, 3, 5);

        int max = Collections.max(numbers);
        int min = Collections.min(numbers);
        int difference = max - min;
        System.out.println("(" + min + ", " + max + ")");
        System.out.println(difference);
    }
//        List<Integer> numbers2 = getMaxAndMin(numbers);
//        System.out.println(numbers2);
//            int diffMax = numbers2.stream().reduce((num1,num2)->num2-num1).get();
//            System.out.println(diffMax);
//
//
//    }
//
//    public static List<Integer> getMaxAndMin(List<Integer> numbers) {
//        Optional<Integer> maxNumber = numbers.stream().max((n1, n2)->n1.compareTo(n2));
//        Optional<Integer> minNumber = numbers.stream().min((n1, n2)->n1.compareTo(n2));
//        List<Integer> numbers2 = new ArrayList<>();
//        numbers2.add(minNumber.orElse(0));
//        numbers2.add(maxNumber.orElse(0));
//        return numbers2;
//    }
}
