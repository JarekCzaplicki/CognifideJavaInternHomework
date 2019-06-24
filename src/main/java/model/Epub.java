package model;

public class Epub {
    private boolean isAvailable;
    private String acsTokenLink;
    private String downloadLink;

    public boolean getIsAvailable() { return isAvailable; }
    public void setIsAvailable(boolean value) { this.isAvailable = value; }

    public String getAcsTokenLink() { return acsTokenLink; }
    public void setAcsTokenLink(String value) { this.acsTokenLink = value; }

    public String getDownloadLink() { return downloadLink; }
    public void setDownloadLink(String value) { this.downloadLink = value; }
}
