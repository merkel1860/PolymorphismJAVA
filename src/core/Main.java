package core;

public class Main {
    public static void showAnyThing(Object o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
        RoadBike roadBike = new RoadBike("Automatic", 2,
                5, 18);
        showAnyThing(roadBike.getDesc());
        showAnyThing("Honking type :"+roadBike.honk());
    }
}
