package exercitii.company_ex8;

import java.util.ArrayList;
import java.util.List;

public class Company {

 //Gestiunea angajatilor din companie
        //O companie multinationala are o lista de angajati, iar fiecare angajat este caracterizat de: varsta, tara, nume.
        //
        //Scrie urmatoarele metode:
        //
        //O metoda care returneaza o mapa, in care cheia este tara si valoarea este numarul de angajati din acea tara
        //O metoda care returneaza o mapa, in care cheia este tara si valoarea o lista cu toti angajatii din acea tara
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
    public List<Employee> getOverFiftyEmployees(List<Employee> newEmployees){
        List<Employee> employeesOverFifty = new ArrayList<>();
        for (Employee employee:newEmployees){
            if (employee.getAge()>50){
                employeesOverFifty.add(employee);
            }
        }
        return employeesOverFifty;
    }
    //O metoda care returneaza o lista cu angajatii din Romania
    public List<Employee> getRomanianEmployees(List<Employee> newEmployees){
        List<Employee> romanianEmployees = new ArrayList<>();
        for (Employee employee:newEmployees){
            if (employee.getCountry().equals("Romania")){
                romanianEmployees.add(employee);
            }
        }
        return romanianEmployees;
    }
    //O metoda care sorteaza angajatii dupa tara
    public void sortEmployeesByCountry(List<Employee> newEmployees){
        for (Employee employee:newEmployees){
            System.out.println(employee.getCountry());
        }
    }

    //O metoda care sorteaza angajatii dupa nume
   public void sortEmployeesByName(List<Employee> newEmployees){
       for (Employee employee:newEmployees){
           System.out.println(employee.getName());
       }
   }

}
