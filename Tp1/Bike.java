import java.awt.Color;

public class Bike {

    private final String brand;
    private Color color;
    private int speed;
    private final int size;

    public Bike(String brand, Color color, int size) {
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.speed = 0;
    }

    public void print() {
        System.out.println("[" + brand + "-" + size + "\" - " + color + " - (" + speed + "km/h)]");
    }
}