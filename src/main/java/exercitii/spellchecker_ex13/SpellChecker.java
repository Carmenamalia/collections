package exercitii.spellchecker_ex13;

import java.util.*;

public class SpellChecker {
    public static void main(String[] args) {
        //dictionarul ar trebui sa fie de tip set ca sa nu se repete
        //citim n(nr de cuvinte din dictionar)
        //citim de pe fiecare linie de n ori cate un cuvant din dictionar
        //citim n (nr de linii de text)
        //citim fiecare linie de text de n ori
             //citim fiecare cuvant din linia curenta si il bagam in wordsFromText(lista de cuvinte)
        // gasim cuvintele gresite din wordsFromText
        //a df gdf fdg

        //b dfesd dfg dfg

        Scanner scanner = new Scanner(System.in);
        int numberOfWordsInDictionary = Integer.parseInt(scanner.nextLine());
        Set<String> dictionary = new HashSet<>();
        List<String> wordsFromText = new ArrayList<>();
        for (int i = 0; i < numberOfWordsInDictionary; i++) {
            System.out.println("enter the next word in dictionary:");
            String word = scanner.nextLine();
            dictionary.add(word);
        }
        System.out.println("dictionary is: " + dictionary);
        int numberOfTextLines = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfTextLines; i++) {
            System.out.println("enter the next text line:");
            String line = scanner.nextLine();
           String[] wordsFromLine = line.split(" ");
            for (int j = 0; j < wordsFromLine.length; j++) {
                wordsFromText.add(wordsFromLine[j]);
            }
        }
        System.out.println("words from text are: " + wordsFromText);
        System.out.println(spellChecker(dictionary,wordsFromText));
    }

    public static Set<String> spellChecker(Set<String> dictionary,List<String> wordsFromText){
        Set<String> wrongWords = new HashSet<>();
        for (String word:wordsFromText){
            if (!dictionary.contains(word)){
                wrongWords.add(word);
            }
        }
        return wrongWords;
    }
}
