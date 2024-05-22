package Esercizio_3;

public class Articolo {
    private String articleId;
    private String articleDescription;
    private double articlePrice;
    private int articleStock;

    public Articolo(String articleDescription, double articlePrice, int articleStock) {
        this.articleId = "FCCGSJKADJAOSDIASDH";
        this.articleDescription = articleDescription;
        this.articlePrice = articlePrice;
        this.articleStock = articleStock;
    }

    public String getArticleDescription() {
        return articleDescription;
    }

    public void setArticleDescription(String articleDescription) {
        this.articleDescription = articleDescription;
    }

    public double getArticlePrice() {
        return articlePrice;
    }

    public void setArticlePrice(double articlePrice) {
        this.articlePrice = articlePrice;
    }

    public int getArticleStock() {
        return articleStock;
    }

    public void setArticleStock(int articleStock) {
        this.articleStock = articleStock;
    }
}
