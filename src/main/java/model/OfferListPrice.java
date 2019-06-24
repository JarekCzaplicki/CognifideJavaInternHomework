package model;

public class OfferListPrice {
    private long amountInMicros;
    private String currencyCode;

    public long getAmountInMicros() { return amountInMicros; }
    public void setAmountInMicros(long value) { this.amountInMicros = value; }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}
