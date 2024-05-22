package Esercizio_3;

public class Cliente {
    private String clientId;
    private String clientName;
    private String clientSurname;
    private String clientEmail;
    private String clientSubscriptionDate;

    public Cliente(String clientName, String clientSurname, String clientEmail, String clientSubscriptionDate) {
        this.clientId = "agagAHHAHSADJASD";
        this.setClientName(clientName);
        this.setClientSurname(clientSurname);
        this.setClientEmail(clientEmail);
        this.setClientSubscriptionDate(clientSubscriptionDate);
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientSurname() {
        return clientSurname;
    }

    public void setClientSurname(String clientSurname) {
        this.clientSurname = clientSurname;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getClientSubscriptionDate() {
        return clientSubscriptionDate;
    }

    public void setClientSubscriptionDate(String clientSubscriptionDate) {
        this.clientSubscriptionDate = clientSubscriptionDate;
    }
}
