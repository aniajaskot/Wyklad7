package exercise1.model;

public class Director extends Employee {
    private double bonus;

    public Director(String firstName, String lastName, double salary, double bonus) {
        super(firstName, lastName, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double totalSalary() {
        return getSalary() + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + " " + bonus;
    }
}
