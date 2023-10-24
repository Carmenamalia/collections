package algoritmica;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex9 {
    //Roteste un array la stanga cu o pozitie
    //Exemplu:
    //Input: [1,2,3,4,5]
    //Output: [5,1,2,3,4]
    //Rezolva apoi problema in mod general, adica roteste un array la stanga cu n pozitii
    // Exemplu:
    //Input: [1,2,3,4,5] , n=2
    //Output: [3,4,5,1,2] - array-ul s-a rotit cu 2 pozitii
    public static void main(String[] args) {
        List<Integer> arr1 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(arr1);
      //rotesc array-ul cu o pozitie
       List<Integer> arr2 =arr1.stream()
                .skip(1).collect(Collectors.toList());//sterg primul element din array
       arr2.add(arr1.get(0));//adaug la noul array primul element din vechiul array
        System.out.println(arr2);
      //rotesc array-ul cu n pozitii
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
         arr2 = arr1.stream().skip(n).collect(Collectors.toList());//sterg primele n elemente din array
         arr2.addAll(arr1.subList(0,n));//adaug la sfarsitul noului array primele n elemente din vechiul array
        System.out.println(arr2);
    }
}
