package main.car;

public class Car {

    private String model;
    private double engine;
    private int speed;
    private boolean start;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isStart() {
        return start;
    }

    public void setStart(boolean start) {
        this.start = start;
    }



    public Car(String model, double engine) {
        this.model = model;
        this.engine = engine;
    }

    public void startEngine() {
        start = true;
        System.out.println(model + " get started.");
    }

    public void drive() {
        System.out.println(model + " is driving.");
    }

    public void keepSpeed(int x) {
        speed += x;
        System.out.println(model + " is driving " + speed + " kilometers per hour.");
    }

    public void stopEngine() {
        start = false;
        System.out.println(model + " doesn't drive.");
    }
}
