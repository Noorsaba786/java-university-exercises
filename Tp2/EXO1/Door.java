import java.util.List;

public class Door {

    protected boolean isOpen; // protected = subclasses can access it directly
    protected boolean isLocked;

    public Door() {
        this.isOpen = false; // closed by default
        this.isLocked = false; // unlocked by default
    }

    public void open() {
        if (isLocked) { // locked → refuse
            return;
        }
        isOpen = true;
    }

    public void close() {
        isOpen = false;
    }

    // toString: class name + state, e.g. "Door [fermée]" or "AutoLockDoor
    // [ouverte]"
    @Override
    public String toString() {
        String state = isOpen ? "ouverte" : "fermée";
        return getClass().getSimpleName() + " [" + state + "]";
    }

    // static method: print every door in the list (question 3)
    public static void printDoorList(List<Door> doors) {
        for (Door d : doors) {
            System.out.println(d); // println calls d.toString() automatically
        }
    }
}