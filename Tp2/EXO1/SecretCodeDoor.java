public class SecretCodeDoor extends Door {

    private final int secretCode;   // the code needed to unlock (new field) the code needed to unlock new field  21

    public SecretCodeDoor(int secretCode) {
        this.secretCode = secretCode;
        this.isLocked = true;   // starts locked (needs code to open)
    }

    // close() also locks automatically (like AutoLockDoor)
    @Override
    public void close() {
        super.close();       // Door's close() → isOpen = false
        isLocked = true;     // then lock it
    }

    // NEW method: unlock only if the given code matches
    public void unlock(int code) {
        if (code == secretCode) {   // right code → unlock
            isLocked = false;
        }
        // wrong code → do nothing, stays locked (spec c)
    }
}