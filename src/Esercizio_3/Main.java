package Esercizio_3;

public class Main {
    public static void main(String[] args) {
        Articolo pollo = new Articolo("Pollo confezionato", 7.65, 10);
        Articolo farina = new Articolo("Farina grano 00", 2.65, 600);
        Articolo miele = new Articolo("Miele di Acacia", 4.65, 50);

        Articolo[] cartShop = {pollo, farina, miele};
        Cliente cliente1 = new Cliente("Alessio", "Vulpinari", "vulpi99@gmail.com", "20/02/2021");

        Carrello cart = new Carrello(cliente1, cartShop);
    }

}
