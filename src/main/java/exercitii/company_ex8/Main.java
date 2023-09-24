package exercitii.company_ex8;

import java.util.ArrayList;
import java.util.List;

public class Main  {
    public static void main(String[] args)  {

        Employee employee1 = new Employee("Andrei", 52, "Romania");
        Employee employee2 = new Employee("Laura", 28, "Romania");
        Employee employee3 = new Employee("John", 51, "Anglia");
        Employee employee4 = new Employee("Steve", 33, "Anglia");
        Employee employee5 = new Employee("Liz", 32, "Anglia");
        Employee employee6 = new Employee("Maurice", 24, "Franta");
        Employee employee7 = new Employee("Luca", 52, "Italia");
        Employee employee8 = new Employee("Giuliana", 28, "Italia");
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        employees.add(employee7);
        employees.add(employee8);
        Company company = new Company(employees);

        System.out.println("angajati cu varsta peste 50 de ani:");
        System.out.println(company.filterByAgeGreaterThan(50));
        System.out.println("angajati din Romania:");
        System.out.println(company.filterByCountry("Romania"));
        System.out.println("sorteaza dupa tara angajatilor:");
        company.sortByCountry();
        System.out.println("sorteaza dupa numele angajatilor:");
        company.sortByName();
        System.out.println(" nr de angajati din fiecare tara:");
        System.out.println(company.groupNumberOfEmployeesByCountry());
        System.out.println("lista de angajati din fiecare tara:");
        System.out.println(company.groupEmployeesByCountry());
    }
}
