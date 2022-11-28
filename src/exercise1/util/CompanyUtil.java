package exercise1.util;

import exercise1.model.Employee;

public class CompanyUtil {

    public static double companyCost(Employee[] employees){
        double sum = 0;
        for(Employee employee : employees){
            sum += employee.totalSalary();
        }
        return sum;
    }

    public static int countEmployeeWithSalaryAbove(Employee[] employees, double salary){
        int counter = 0;
        for(Employee employee : employees){
            if(employee.totalSalary() > salary){
                counter++;
            }
        }
        return counter;
    }
}
