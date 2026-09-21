import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        Bike b1 = new Bike(Bike.DEFAULT_BRAND, Bike.DEFAULT_COLOR, Bike.DEFAULT_SIZE);
        Bike b2 = new Bike("Btwin", Color.BLUE, 28);
        b1.print();
        b2.print();

    }
}