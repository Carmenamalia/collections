package exercitii.reverseSentence_ex5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseSentence {
    public static void main(String[] args) {
 //Scrie o metoda care:
        //Primeste ca si parametru o lista de cuvinte si returneaza lista de cuvinte inversata, cu mentiunea ca lista inversata
        // nu va include cuvintele care au lungimea mai mica decat 3
        //Exemplu:
        //Input: {“ana”, “nu”, “are”, “mere”}
        //Output: {“mere”, “are”, “ana”}

        List<String> words = Arrays.asList("ana","nu","are","mere");
        System.out.println(reverseList(words));
    }
    public static List<String> reverseList(List<String> list){
        List<String> reversedWords = new ArrayList<>();
        for (int i = list.size()-1; i >= 0 ; i--) {
            if (list.get(i).length()>=3) {
                reversedWords.add(list.get(i));
            }
        }
        return reversedWords;
    }
}
