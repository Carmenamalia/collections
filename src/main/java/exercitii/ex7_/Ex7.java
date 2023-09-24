package exercitii.ex7_;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex7 {
    public static void main(String[] args) {
//Scrie o metoda care:
//Primeste ca parametru o lista de cuvinte si returneaza de cate ori apare fiecare cuvant in lista
//Exemplu:
//Input: {“ana”, “are”, “mere”, “are”}
//Output: {ana=1, are=2, mere=1}
        List<String> words = Arrays.asList("ana","are","mere","are");
        System.out.println(groupWordsByFrecvency(words));
    }
    public static Map<String,Integer> groupWordsByFrecvency(List<String> words){
        Map<String,Integer> wordsByFrecvency = new HashMap<>();
        //parcurg lista si, pt fiecare elem:
          //daca cheia este deja in lista
             //cresc valoarea dela acea cheie cu 1
          //altfel,daca cheia nu este ,adaug cheia cu valoarea 1
        for (String word:words){
            if (wordsByFrecvency.containsKey(word)){
                wordsByFrecvency.put(word,wordsByFrecvency.get(word)+1);
            }else {
                wordsByFrecvency.put(word,1);
            }
        }return wordsByFrecvency;
    }
}
