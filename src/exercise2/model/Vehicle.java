package exercise2.model;

public class Vehicle implements Moveable {

    private static final String FORWARD = "Przód";
    private static final String BACK = "Tył";
    private static final String RIGHT = "Prawo";
    private static final String LEFT = "Lewo";

    private String name;
    private int year;
    private String direction;

    public Vehicle(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public void turnLeft() {
        direction = LEFT;
    }

    @Override
    public void turnRight() {
        direction = RIGHT;
    }

    @Override
    public void goForward() {
        direction = FORWARD;
    }

    @Override
    public void goBack() {
        direction = BACK;
    }

    @Override
    public String toString() {
        return name + ", " + year + ", " + direction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirection() {
        return direction;
    }
}
