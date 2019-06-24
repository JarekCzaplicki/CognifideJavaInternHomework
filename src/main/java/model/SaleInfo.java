package model;

import java.util.List;

public class SaleInfo {
    private String country;
    private String saleability;
    private boolean isEbook;
    private String buyLink;
    private SaleInfoListPrice listPrice;
    private SaleInfoListPrice retailPrice;
    private List<Offer> offers;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSaleability() {
        return saleability;
    }

    public void setSaleability(String saleability) {
        this.saleability = saleability;
    }

    public boolean getIsEbook() { return isEbook; }
    public void setIsEbook(boolean value) { this.isEbook = value; }

    public String getBuyLink() { return buyLink; }
    public void setBuyLink(String value) { this.buyLink = value; }

    public SaleInfoListPrice getListPrice() { return listPrice; }
    public void setListPrice(SaleInfoListPrice value) { this.listPrice = value; }

    public SaleInfoListPrice getRetailPrice() { return retailPrice; }
    public void setRetailPrice(SaleInfoListPrice value) { this.retailPrice = value; }

    public List<Offer> getOffers() { return offers; }
    public void setOffers(List<Offer> value) { this.offers = value; }
}
