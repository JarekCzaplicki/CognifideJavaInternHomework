package model;

public class AccessInfo {
    private String country;
    private String viewability;
    private boolean embeddable;
    private boolean publicDomain;
    private String textToSpeechPermission;
    private Epub epub;
    private Epub pdf;
    private String webReaderLink;
    private String accessViewStatus;
    private boolean quoteSharingAllowed;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getViewability() {
        return viewability;
    }

    public void setViewability(String viewability) {
        this.viewability = viewability;
    }

    public boolean getEmbeddable() { return embeddable; }
    public void setEmbeddable(boolean value) { this.embeddable = value; }

    public boolean getPublicDomain() { return publicDomain; }
    public void setPublicDomain(boolean value) { this.publicDomain = value; }

    public String getTextToSpeechPermission() {
        return textToSpeechPermission;
    }

    public void setTextToSpeechPermission(String textToSpeechPermission) {
        this.textToSpeechPermission = textToSpeechPermission;
    }

    public Epub getEpub() { return epub; }
    public void setEpub(Epub value) { this.epub = value; }

    public Epub getPDF() { return pdf; }
    public void setPDF(Epub value) { this.pdf = value; }

    public String getWebReaderLink() { return webReaderLink; }
    public void setWebReaderLink(String value) { this.webReaderLink = value; }

    public String getAccessViewStatus() {
        return accessViewStatus;
    }

    public void setAccessViewStatus(String accessViewStatus) {
        this.accessViewStatus = accessViewStatus;
    }

    public boolean getQuoteSharingAllowed() { return quoteSharingAllowed; }
    public void setQuoteSharingAllowed(boolean value) { this.quoteSharingAllowed = value; }
}
