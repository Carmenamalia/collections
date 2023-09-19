package exercitii.squaredup_ex2;

import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SquaredUp {
    public static void main(String[] args) {
        //Scrie o metoda care primeste ca si parametru o lista de numere si returneaza o alta lista de numere formata din numerele
// din lista primita ca parametru, ridicate la patrat (puteti folosi Math.pow(2) pentru a ridica la patrat)
        //Output: {4,9,16,25}
        Scanner scanner = new Scanner(System.in);
        //Input: {2,3,4,5} lista de numere de ridicat la putere
        // List<Integer> numbers = Arrays.asList(2,3,4,5);

        List<Integer> numbers = new ArrayList<>();
        do {
            numbers.add(scanner.nextInt()); //introduc numere in lista
        }while (numbers.size()<5);//atat timp cat lungimea listei nu a ajuns la 5
        System.out.println(toSquare(numbers)); //afisez lista de patrate ale numerelor din lista apeland metoda de ridicare la putere
    }

    public static List<Integer> toSquare(List<Integer> numbersList) {
        List<Integer> squaredNum = new ArrayList<>();//lista de patrate ale numerelor date
        for (int number : numbersList) { //pentru fiecare numar din lista
            number = (int) Math.pow(number, 2);//ridic nr la putere
            squaredNum.add(number);//adaug rezultatul la lista de patrate
        }
        return squaredNum;
    }
}
