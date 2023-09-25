package exercitii.Ex17;

import java.util.*;

public class Main {
    //rimeste ca parametrii doua cuvinte si returneaza true, daca cuvintele sunt anagrame.
    //Exemple:
    //
    //Input1: “race”, “care”
    //Output1: true, pentru ca  contine aceleasi litere ca si race, si literele apar de acelasi numar de ori
    //Input2:”race”, “carec”
    //Output2: false, pentru ca nu contin acelasi litere, de acelasi numar de ori

    public static void main(String[] args) {
        //2 mape pentru fiecare cuvant cu litere fiecare elem are o cheie (litera) si o valoare (nr de aparitii)

        String word1 = "race";
        String word2 = "care";

        Map<Character, Integer> firstWordMap = generateMap(word1);
        Map<Character, Integer> secondWordMap = generateMap(word2);

        if (firstWordMap.equals(secondWordMap)) {
            System.out.println("anagrams");
        } else {
            System.out.println("not anagrams");
        }
        System.out.println(areAnagrams(word1, word2));
        System.out.println(areAnagrams2(word1, word2));
    }

    public static Map<Character, Integer> generateMap(String word) {
        Map<Character, Integer> wordMap = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            //fiecare litera din cuvant o adaugam in Map
            Character currentLetter = word.charAt(i);
            if (wordMap.containsKey(currentLetter)) {
                wordMap.put(currentLetter, wordMap.get(currentLetter) + 1);
            } else {
                wordMap.put(currentLetter, 1);
            }
        }
        return wordMap;
    }

    public static boolean areAnagrams(String word1, String word2) {
//        if (generateMap(word1).equals(generateMap(word2))) {
//            System.out.println("anagrams");
//        } else {
//            System.out.println("not anagrams");
//        }
        return generateMap(word1).equals(generateMap(word2));
    }

    public static boolean areAnagrams2(String word1, String word2) {
//        char[] word1Chars = word1.toCharArray();
//        char[] word2Chars = word2.toCharArray();
        if (word1.length()!=word2.length()){
            return false;
        }
//        //convert string to character array
//        char[] charsArray1 = word1.toCharArray();
//        //sort the character array alphabetically
//        Arrays.sort(charsArray1);
//
//        //convert string to character array
//        char[] charsArray2 = word2.toCharArray();
//        //sort the character array alphabetically
//        Arrays.sort(charsArray2);

        ArrayList<Character> characters1 = convert(word1);
        ArrayList<Character> characters2 = convert(word2);
//        ArrayList<Character> characters1 = new ArrayList<>();
//        for (int i = 0; i < word1Chars.length; i++) {
//            characters1.add(word1.charAt(i));
//        }
//        ArrayList<Character> characters2 = new ArrayList<>();
//        for (int i = 0; i < word2Chars.length; i++) {
//            characters2.add(word2.charAt(i));
//        }
        Collections.sort(characters1);
        Collections.sort(characters2);

        return characters1.equals(characters2);
    }

    public static ArrayList<Character> convert(String word) {
        ArrayList<Character> characters = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            characters.add(word.charAt(i));
        }
        return characters;
    }
}
