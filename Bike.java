import java.awt.Color;
// here its public class of the bike 
public class Bike {

    private static final char[] DEFAULT_BRAND = {'B', 'i', 'k', 'e'};
    private static final Color DEFAULT_COLOR = Color.BLACK;
    private static final int DEFAULT_SIZE = 26;

    private final char[] brand = DEFAULT_BRAND;
    private Color color = DEFAULT_COLOR;
    private int speed = 0;
    private final int size = DEFAULT_SIZE;

    public void print() {
        System.out.println("[" + new String(brand) + " - " + size + "\" - " + color + " - (" + speed + "km/h)]");
    }

  public void accelerate ()
  {
    this.speed++ ; 
  }

  public void brake()
  {
    this.speed--; 
  }
 
 public void repaint(Color c) {
    this.color = c ; 
}
}