package Oop;

public class Car {
    private int power;
    private boolean started;
    private double speed;

    public Car(int pw){
        power=pw;
        started=false;
        speed=0;

    }

    public boolean isStarted() {
        return started;
    }

    public double getSpeed() {
        return speed;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    public void start(){
        started = true;
    }

    public void stop(){
        started = false;
        speed = 0;
    }

    public void accelerate(double acc ,double time){
        if (started){
            speed = acc * time;
        }
    }
}
