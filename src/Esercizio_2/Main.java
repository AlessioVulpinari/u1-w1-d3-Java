package Esercizio_2;

public class Main {
    public static void main(String[] args) {
        Sim sim1 = new Sim("331771239");
        Chiamata chiamata1 = new Chiamata(20.50, "3312225523258");
        Chiamata chiamata2 = new Chiamata(30.50, "3312225523258");
        Chiamata[] arrayChiamate = {chiamata1, chiamata2};
        sim1.setLastFiveCalls(arrayChiamate);
        sim1.printSIM();
    }
}
