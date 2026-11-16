public class ClosedDoor extends Door { // inherits from Door

   // A condemned door is closed and can NEVER open.

   public ClosedDoor() {
      this.isOpen = false; // starts closed
      this.isLocked = true; // locked shut, permanently
   }

   // Override open() to do NOTHING — a condemned door never opens.
   @Override
   public void open() {
      return; // refuse always — no matter what
   }
}