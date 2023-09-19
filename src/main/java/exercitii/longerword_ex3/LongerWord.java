package exercitii.longerword_ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongerWord {
    public static void main(String[] args) {
 //Scrie o metoda care:
        //Gaseste cuvantul cel mai lung dintr-o lista de cuvinte (primita ca parametru), si il returneaza
        //Exemplu:
        //Input: {“ana”, “are”, “mere”}
        //Output: “mere”
    //initializez array-ul de cuvinte
        List<String> words = Arrays.asList("ana","are","mere");
        //apelez metoda care calculeaza care este cel mai lung cuvant
        System.out.println(getLongestWord(words));
    }
    public static String getLongestWord(List<String> wordsList){
        String longestWord = null;
        int maxWordSize = 0;
        //pentru fiecare cuvant din lista
       for (String word:wordsList){
           //daca cuvantul e mai mare decat lungimea maxima initial egala cu 0
          if(word.length()>maxWordSize){
              //acel cuvant devine cel mai lung
              longestWord = word;
              maxWordSize = word.length();
          }
       }
       return longestWord;
    }

}
