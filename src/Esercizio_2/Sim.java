package Esercizio_2;

public class Sim {
    private String cellNumber;
    private double credits;
    private Chiamata[] lastFiveCalls;

    public Sim(String cellNumber) {
        setCellNumber(cellNumber);
        setCredits(0);
        setLastFiveCalls(new Chiamata[5]);
    }

    public void printSIM() {
        System.out.println("Numero di telefono: " + this.getCellNumber() + " credito disponibile: " + this.credits + " ultime cinque chiamate: ");
        for (int i = 0; i < this.getLastFiveCalls().length; i++) {
            System.out.println("Chiamata: " + (i + 1) + " effettuata al numero: " + this.getLastFiveCalls()[i].getNumberCalled() + " durata: " + this.getLastFiveCalls()[i].getDuration());
        }
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public Chiamata[] getLastFiveCalls() {
        return lastFiveCalls;
    }

    public void setLastFiveCalls(Chiamata[] lastFiveCalls) {
        this.lastFiveCalls = lastFiveCalls;
    }
}
