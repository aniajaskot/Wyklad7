package exercise1.model;

public class Employee extends Person {
    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double totalSalary(){
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + salary;
    }
}
