package exercitii.company_ex8;

import java.util.*;

public class Company {

    private List<Employee> employees;

    public Company(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    //O metoda care returneaza angajatii care au peste 50 de ani, din companie
    public List<Employee> filterByAgeGreaterThan(int age) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getAge() > age) {
                result.add(employee);
            }
        }
        return result;
    }

    //O metoda care returneaza o lista cu angajatii din Romania
    public List<Employee> filterByCountry(String country) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getCountry().equals(country)) {
                result.add(employee);
            }
        }
        return result;
    }

    //O metoda care sorteaza angajatii dupa tara(folosesc comparator--in clasa Employee  implementez Comparabil
    public void sortByCountry() {
        //Collections.sort(employees,new CountryComparator());
        employees.sort(new CountryComparator());
        System.out.println(employees);
    }

    //O metoda care sorteaza angajatii dupa nume
    public void sortByName() {
        Collections.sort(employees);
        System.out.println(employees);
    }

    //O metoda care returneaza o mapa, in care cheia este tara si valoarea este numarul de angajati din acea tara
    public Map<String, Integer> groupNumberOfEmployeesByCountry() {
        Map<String, Integer> numberOfEmployeesByCountry = new HashMap<>();
        for (Employee employee : employees) {
            if (numberOfEmployeesByCountry.containsKey(employee.getCountry())) {
                numberOfEmployeesByCountry.put(employee.getCountry(), numberOfEmployeesByCountry.get(employee.getCountry()) + 1);
            } else {
                numberOfEmployeesByCountry.put(employee.getCountry(), 1);
            }
        }
        return numberOfEmployeesByCountry;
    }
//O metoda care returneaza o mapa, in care cheia este tara si valoarea o lista cu toti angajatii din acea tara

    public Map<String, List<Employee>> groupEmployeesByCountry() {
        Map<String, List<Employee>> employeesByCountry = new HashMap<>();
        for (Employee employee : employees) {
            String employeeCountry = employee.getCountry();
            if (employeesByCountry.containsKey(employeeCountry)){
                employeesByCountry.get(employeeCountry).add(employee);
            }else {
                List<Employee> valueEmployees = new ArrayList<>();
                valueEmployees.add(employee);
                employeesByCountry.put(employeeCountry, valueEmployees);
            }
        }return employeesByCountry;
    }
}
