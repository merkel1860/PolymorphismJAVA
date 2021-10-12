package core;

public class Bicycle {
    private String gear;
    private int cadence;
    private int speed;
    private int tireWidth;

    public Bicycle() {
    }

    public Bicycle(String gear, int cadence,
                   int speed, int tireWidth) {
        this.gear = gear;
        this.cadence = cadence;
        this.speed = speed;
        this.tireWidth = tireWidth;
    }

    public int getTireWidth() {
        return tireWidth;
    }

    public void setTireWidth(int tireWidth) {
        this.tireWidth = tireWidth;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    public int getCadence() {
        return cadence;
    }

    public void setCadence(int cadence) {
        this.cadence = cadence;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "gear='" + gear + '\'' +
                ", cadence=" + cadence +
                ", speed=" + speed +
                ", tireWidth=" + tireWidth +
                '}';
    }

    public String getDesc(){
        return toString();
    }
}
