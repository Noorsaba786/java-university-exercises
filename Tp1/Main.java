import java.awt.Color;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        // --- bikes ---
        Bike b1 = new Bike("Electra", Color.RED, 26, "Schwalbe");
        Bike b2 = new Bike(); // default constructor for our class
        b1.print();
        b2.print();

        // accelerate / brake test
        b1.accelerate();
        b1.accelerate();
        b1.brake();
        b1.print();

        // copy constructor
        Bike b3 = new Bike(b1);
        b3.print();

        // number of wheels
        System.out.println("b1 wheels: " + b1.countWheels());

        // --- collections (List) ---
        List<Wheel> wlist = new ArrayList<>();
        Wheel w1 = new Wheel("Schwalbe", 24);
        Wheel w2 = new Wheel("Michelin", 26);
        wlist.add(w1);
        wlist.add(w2);
        wlist.add(1, new Wheel("Continental", 25)); // at position 1
        wlist.add(w1); // same wheel twice — allowed in a List
        System.out.println("List size: " + wlist.size());
        System.out.println(wlist); // uses toString()




        //  collection set like its going to be the last part of the 
        Set<Wheel> wset = new HashSet<>();
        wset.add(w1);
        wset.add(w1); // duplicate ignored
        System.out.println("Set size: " + wset.size());
    }
}