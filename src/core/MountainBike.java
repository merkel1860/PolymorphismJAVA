package core;

public class MountainBike extends Bicycle implements Features {
    private int suspension;

    public int getSuspension() {
        return suspension;
    }

    public void setSuspension(int suspension) {
        this.suspension = suspension;
    }

    @Override
    public String honk() {
        return "Rugir";
    }
}
