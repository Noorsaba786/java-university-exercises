/* public class Door {
    private boolean isOpen;
    private boolean isLocked;

    public void close() {
        isOpen = false;
    }

    public void open() {
        if (isLocked) {
            return;
        }
        isOpen = true;
    }

    public void unlock() {
        isLocked = false;
    }

    public void lock() {
        if (isOpen) {
            return;
        }
        isLocked = true;
    }

    public void print() {
        String doorState = isOpen ? "open " : "closed";
        String lockState = isLocked ? "locked" : "unlocked";
        System.out.println("the door is " + doorState + " ," + lockState);
    }

} */

public class Door {
    private boolean isOpen;
    private boolean isLocked;

    public Door() {
        this.isOpen = false; // by default loock // if we want to even erase it even we will be able to run
                             // it .
        this.isLocked = false; // by defalut open
    }

    public void close() {
        this.isOpen = false;

    }

    public void open() {
        if (isLocked == false) {
            this.isOpen = true;
        }
    }

    public void lock() {
        if (isOpen == false) {
            this.isLocked = true;
        }

    }

    public void unlock() {
        this.isLocked = false;
    }

    public void printStates() {
        String openState = isOpen ? " open" : " close";// ternary operator
        String lockState = isLocked ? " locked" : "not locked";
        System.out.println("the door is " + openState + " and " + lockState);
    }
}