public class Lampe {

    private boolean allumee;

    public void allumer() {
        this.allumee = true;
    }

    public void eteindre() {
        this.allumee = false;
    }

    public boolean isAllumee() {
        return this.allumee;
    }

}
