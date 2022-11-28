package exercise1.app;

import exercise1.model.Director;
import exercise1.model.Employee;
import exercise1.util.CompanyUtil;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new Employee("Jan", "Kowalski", 3000);
        employees[1] = new Employee("Adam", "Adamski", 4000);
        employees[2] = new Director("Piotr", "Nowak", 6000, 1000);
        employees[3] = new Director("Karol", "Kamiński", 7000,  1000);

        for(Employee employee : employees){
            System.out.println(employee);
        }

        System.out.println("Suma wypłat: " + CompanyUtil.companyCost(employees));
        System.out.println("Liczba pracowników zarabiających powyżej 5000: "
                + CompanyUtil.countEmployeeWithSalaryAbove(employees, 5000));
    }
}
