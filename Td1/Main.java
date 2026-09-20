public class Main {
    public static void main(String[] args) {
        Door firstCar = new Door();
        firstCar.lock();
        firstCar.printStates();
        firstCar.close();
        firstCar.open();
        firstCar.printStates();

    }
}
