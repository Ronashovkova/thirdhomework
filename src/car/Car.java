package car;

public class Car {

    protected String model;
    protected double engine;
    private int speed;
    protected boolean start;

    private Car(String model, double engine) {
        this.model = model;
        this.engine = engine;
    }

    private void startEngine() {
        start = true;
        System.out.println(model + " get started.");
    }

    private void drive() {
        System.out.println(model + " is driving.");
    }

    private void keepSpeed(int x) {
        speed += x;
        System.out.println(model + " is driving " + speed + " kilometers per hour.");
    }

    private void stopEngine() {
        start = false;
        System.out.println(model + " doesn't drive.");
    }


    public static void main(String[] args) {
        Car mercedes = new Car("Mercedes", 2.0);
        mercedes.startEngine();
        mercedes.drive();
        mercedes.keepSpeed(60);
        mercedes.stopEngine();
    }
}
