package Esercizio_1;

public class Rettangolo {
    private double height;
    private double width;

    public Rettangolo(double height, double width) {
        setHeight(height);
        setWidth(width);
    }

    public static void stampaRettangolo(Rettangolo rettangolo) {
        System.out.println("Il perimetro del rettangolo: " + rettangolo.getPerimetro());
        System.out.println("L'area del rettangolo: " + rettangolo.getArea());
    }

    public static void stampaDueRettangoli(Rettangolo ret1, Rettangolo ret2) {
        System.out.println("Il perimetro del primo rettangolo: " + ret1.getPerimetro() + "e l'area del primo rettangolo: " + ret1.getArea());
        System.out.println("Il perimetro del secondo rettangolo: " + ret2.getPerimetro() + "e l'area del secondo rettangolo: " + ret2.getArea());
        System.out.println("Somma dei due perimetri: " + (ret1.getPerimetro() + ret2.getPerimetro()));
        System.out.println("Somma delle due aree: " + (ret1.getArea() + ret2.getArea()));
    }

    private double getPerimetro() {
        return (this.getHeight() + this.getWidth()) * 2;
    }

    private double getArea() {
        return (this.getHeight() * this.getWidth());
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
