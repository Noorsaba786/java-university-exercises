
public class Main {
    public static void main(String[] args) {
        Lampe l = new Lampe(); // build a lamp (starts off)
        System.out.println(l.isAllumee()); // false

        l.allumer(); // turn it on
        System.out.println(l.isAllumee()); // true

        l.eteindre(); // turn it off
        System.out.println(l.isAllumee()); // false
    }
}