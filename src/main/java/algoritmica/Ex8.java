package algoritmica;

import java.util.ArrayList;
import java.util.List;

public class Ex8 {
    //Gaseste un subarray dintr-un array, care sa aiba o anumita suma
    //Un subarray are capatul din stanga inaintea capatului din dreapta in array-ul original.
    // Array-ul original poate avea doar numere pozitive
    //Exemplu:
    //Input: [1,4,20,3,10,5], sum=33
    //Ouput:suma a fost gasita intre indicii 2 si 4 (20+3+10=33)
    //Input: [1,4], sum = 0
    //Output: niciun subarray nu a fost gasit
    public static void main(String[] args) {
        List<Integer> array = List.of(1, 4, 20, 3, 10, 5);
        int sum = 33;
        List<Integer> array2 = List.of(1, 4);
        int sum2 = 0;
        List<Integer> subArray = findSubArray(array, sum);
        List<Integer> subArray2 = findSubArray(array2, sum2);
        isSubarrayFound(subArray);
        isSubarrayFound(subArray2);
    }
    public static void isSubarrayFound(List<Integer> subArray){
        if (!subArray.isEmpty()) {
            System.out.println("suma a fost gasita in subarray-ul: " + subArray);
        } else {
            System.out.println("niciun subarray nu a fost gasit");
        }
    }
    public static List<Integer> findSubArray(List<Integer> arr,int sum){
        List<Integer> subArray = new ArrayList<>();
        int left = 0;
        int right = 0;
        int currentSum = 0;
        while (right<= arr.size()) {
            if (currentSum == sum) {
                for (int i = left; i < right; i++) {
                    subArray.add(arr.get(i));
                }
                return subArray;
            }//daca suma curenta e mai mica decat suma initiala
            if (currentSum < sum) {
                // capătul din dreapta creste pentru a adăuga următorul element
                currentSum += arr.get(right);
                right++;
            } else {//altfel,daca suma curenta e mai mare decat suma initiala
                //  capătul din stânga scade pentru a elimina un element
                currentSum -= arr.get(left);
                left++;
            }
        }
        return subArray;
    }
}

