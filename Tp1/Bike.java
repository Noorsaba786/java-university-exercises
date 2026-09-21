import java.awt.Color;

public static final String DEFAULT_BRAND = "Electra";
public static final Color DEFAULT_COLOR = Color.RED;
public static final int DEFAULT_SIZE = 26;

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

    // speed stays in [0, 60]
    public void accelerate() {
        if (speed < 60) {
            speed++;
        }
    }

    public void brake() {
        if (speed > 0) {
            speed--;
        }
    }

    // repaint ONLY to the default color
    public void repaint() {
        color = DEFAULT_COLOR;
    }

    public void print() {
        System.out.println("[" + brand + "-" + size + "\" - " + color + " - (" + speed + "km/h)]");
    }
}