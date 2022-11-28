package exercise2.app;

import exercise2.model.RentableCar;

public class Tester {
    public static void main(String[] args) {
        RentableCar carToRent = new RentableCar("Audi", 2010, 5);
        carToRent.rent("Jan", "Kowalski", "ABC123");

        System.out.println(carToRent);
        carToRent.goForward();

        System.out.println(carToRent);

        System.out.println(carToRent.isRent());
        carToRent.rent("Maria", "Nowak", "CDS234");
        System.out.println(carToRent);

        carToRent.handOver();
        System.out.println(carToRent.isRent());
    }
}
