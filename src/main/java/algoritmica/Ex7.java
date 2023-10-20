package algoritmica;

import java.util.ArrayList;
import java.util.List;


public class Ex7 {
    // Muta toate zero-urile dintr-un array la final
    //Exemplu:
    //Input: [6,0,8,2,3,0,4,0,1]
    //Output: [6,8,2,3,4,1,0,0,0]
    public static void main(String[] args) {
        List<Integer> arr = List.of(6, 0, 8, 2, 3, 0, 4, 0, 1);
        List<Integer> zeroList = new ArrayList<>();
        List<Integer> newList = new ArrayList<>();
        for (Integer num : arr) {
            if (num == 0) {
                zeroList.add(num);
            } else {
                newList.add(num);
            }
        }
        newList.addAll(zeroList);
        System.out.println(newList);
    }
}
