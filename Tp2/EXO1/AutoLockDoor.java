public class AutoLockDoor extends Door { // "extends Door" = inherits everything from Door

    // No fields, no open(), no toString() needed —
    // all inherited from Door automatically.
    // We only OVERRIDE close(): it must also lock the door.
    @Override 
    public void close() {
        super.close(); // call Door's close() sets isOpen = false
        isLocked = true; // then  i  ADD the new behaviour: lock it
    }
}