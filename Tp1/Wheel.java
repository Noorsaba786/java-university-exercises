public class Wheel {

    public static final double DEFAULT_PRESSURE = 3.0;

    private final String brand;
    private final int size;
    private double pressure;

    public Wheel(String brand, int size) {
        this.brand = brand;
        this.size = size;
        this.pressure = DEFAULT_PRESSURE;
    }
  // 
    public void inflate() {
        pressure += 0.1;
    }

    public void deflate() {
        pressure -= 0.1;
    }

    public void print() {
        System.out.println("[" + brand + " - " + size + "\" - " + pressure + " bar]");
    }

    @Override
    public String toString() {
        return "[" + brand + " - " + size + "\" - " + pressure + " bar]";
    }
}