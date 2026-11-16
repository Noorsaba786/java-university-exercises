import java.awt.Color;

public class Bike {

    public static final String DEFAULT_BRAND = "Electra";
    public static final Color DEFAULT_COLOR = Color.RED;
    public static final int DEFAULT_SIZE = 26;
    public static final String DEFAULT_WHEEL_BRAND = "Schwalbe";

    private final String brand;
    private Color color;
    private int speed;
    private final int size;
    private Wheel[] wheels; // [0] = front, [1] = rear it indicates the front

    // main constructor (brand, color, size, wheel brand)
    public Bike(String brand, Color color, int size, String wheelBrand) {
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.speed = 0;
        this.wheels = new Wheel[2];
        this.wheels[0] = new Wheel(wheelBrand, size + 1); // front: +1 inch
        this.wheels[1] = new Wheel(wheelBrand, size - 1); // rear: -1 inch
    }

    // default constructor
    public Bike() {
        this(DEFAULT_BRAND, DEFAULT_COLOR, DEFAULT_SIZE, DEFAULT_WHEEL_BRAND);
    }

    // copy constructor (creates NEW wheels so bikes don't share them)
    public Bike(Bike other) {
        this.brand = other.brand;
        this.color = other.color;
        this.size = other.size;
        this.speed = other.speed;
        this.wheels = new Wheel[2];
        this.wheels[0] = new Wheel(other.wheels[0].toString(), other.size + 1);
        this.wheels[1] = new Wheel(other.wheels[1].toString(), other.size - 1);
    }

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

    public void repaint() {
        color = DEFAULT_COLOR;
    }

    public void removeWheel(int index) {
        wheels[index] = null;
    }

    public void replaceWheel(String wheelBrand, int wheelSize, int index) {
        if (Math.abs(wheelSize - size) > 2) {
            return; // >2 inch difference → refuse
        }
        wheels[index] = new Wheel(wheelBrand, wheelSize);
    }

    public void swapWheels() {
        Wheel tmp = wheels[0];
        wheels[0] = wheels[1];
        wheels[1] = tmp;
    }

    public int countWheels() {
        int count = 0;
        for (Wheel w : wheels) {
            if (w != null) {
                count++;
            }
        }
        return count;
    }

    public void print() {
        System.out.println("Bike :[" + brand + " - " + size + "\" - " + color + " - (" + speed + "km/h)]");
        if (wheels[0] != null) {
            System.out.print("- Front Wheel:");
            wheels[0].print();
        }
        if (wheels[1] != null) {
            System.out.print("- Rear Wheel:");
            wheels[1].print();
        }
    }
}