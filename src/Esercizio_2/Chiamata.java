package Esercizio_2;

public class Chiamata {

    private double duration;
    private String numberCalled;

    public Chiamata(double duration, String numberCalled) {
        this.duration = duration;
        this.numberCalled = numberCalled;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getNumberCalled() {
        return numberCalled;
    }

    public void setNumberCalled(String numberCalled) {
        this.numberCalled = numberCalled;
    }
}
