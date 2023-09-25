package exercitii.Ex6;

import java.util.HashSet;
import java.util.Set;

public class ex_6 {
    //Scrie o metoda care:
    //Primeste ca parametru doua set-uri si returneaza true daca primul set primit ca parametru este superset al celui
    // de-al doilea set
    //Un set “set1” este superset al altui set “set2”, daca “set1” contine toate elementele din “set2”, dar seturile
    // nu sunt egale - containsAll()
    //Exemple:
    //Input1: {“ana”, “are”, “mere”}, {“ana”, “are”}
    //Output1: true
    //Input2: {“ana”, “are”, “mere”}, {“ana”, “are”, “mere”}
    //Output2: false
    public static void main(String[] args) {


        Set<String> set1 = new HashSet<>(Set.of("ana", "are", "mere"));
        Set<String> set2 = new HashSet<>(Set.of("ana", "are"));
        Set<String> set3 = new HashSet<>(Set.of("ana", "are", "mere"));
        Set<String> set4 = new HashSet<>(Set.of("ana", "are", "prune"));

        System.out.println(containsAll(set1,set2));
        System.out.println(containsAll(set1,set3));
        System.out.println(containsAll(set4,set2));
        System.out.println(containsAll(set1,set4));
    }
    public static boolean containsAll(Set<String> set1,Set<String> set2){
        if (set1.size()!=set2.size() && set1.containsAll(set2)){
            return true;
        }else {
            return false;
        }
    }
}
