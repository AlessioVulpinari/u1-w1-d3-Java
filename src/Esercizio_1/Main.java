package Esercizio_1;

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo1 = new Rettangolo(10.50, 20);
        Rettangolo rettangolo2 = new Rettangolo(30, 55.50);

        Rettangolo.stampaRettangolo(rettangolo1);
        Rettangolo.stampaDueRettangoli(rettangolo1, rettangolo2);
    }
}
