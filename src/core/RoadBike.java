package core;

public class RoadBike extends Bicycle implements Features {

    public RoadBike(String gear, int cadence,
                    int speed, int tireWidth) {
        super(gear, cadence, speed, tireWidth);
    }

    public int getTireWidth() {
        return super.getTireWidth();
    }

    public void setTireWidth(int tireWidth) {
        super.setTireWidth(tireWidth);
    }

    @Override
    public String honk() {
        return "Miauler";
    }
}
