package Esercizio_3;

public class Carrello {
    private Cliente cliente;
    private Articolo[] articles;
    private double totalPrice;

    public Carrello(Cliente cliente, Articolo[] articles) {
        this.setCliente(cliente);
        this.setArticles(articles);
        this.setTotalPrice();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Articolo[] getArticles() {
        return articles;
    }

    public void setArticles(Articolo[] articles) {
        this.articles = articles;
    }

    public double setTotalPrice() {
        for (int i = 0; i < this.getArticles().length; i++) {
            this.totalPrice += this.getArticles()[i].getArticlePrice();
            System.out.println("Aggiunto: " + this.getArticles()[i].getArticleDescription() + " con prezzo: " + this.getArticles()[i].getArticlePrice() + "$" + " disponibilità: " + this.getArticles()[i].getArticleStock());
        }
        return this.totalPrice;
    }
}
