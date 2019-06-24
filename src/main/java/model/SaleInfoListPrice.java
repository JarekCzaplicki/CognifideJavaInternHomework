package model;

public class SaleInfoListPrice {
    private double amount;
    private String currencyCode;

    public double getAmount() { return amount; }
    public void setAmount(double value) { this.amount = value; }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}
