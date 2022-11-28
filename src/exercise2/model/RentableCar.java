package exercise2.model;

public class RentableCar extends Car implements Rentable {
    private Person person;

    public RentableCar(String name, int year, int seats) {
        super(name, year, seats);
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public void rent(String firstName, String lastName, String id) {
        if(person == null) {
            person = new Person(firstName, lastName, id);
        }
    }

    @Override
    public void handOver() {
        person = null;
    }

    @Override
    public boolean isRent() {
        return person != null;
    }

    @Override
    public String toString() {
        return super.toString() + " wypożyczony dla " + person;
    }
}
