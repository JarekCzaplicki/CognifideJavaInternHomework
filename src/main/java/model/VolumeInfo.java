package model;

import java.util.List;

public class VolumeInfo {
    private String title;
    private String publisher;
    private List<IndustryIdentifier> industryIdentifiers;
    private ReadingModes readingModes;
    private String printType;
    private String maturityRating;
    private boolean allowAnonLogging;
    private String contentVersion;
    private ImageLinks imageLinks;
    private String language;
    private String previewLink;
    private String infoLink;
    private String canonicalVolumeLink;
    private List<String> authors;
    private String publishedDate;
    private String description;
    private Long pageCount;
    private List<String> categories;
    private Double averageRating;
    private Long ratingsCount;
    private PanelizationSummary panelizationSummary;
    private String subtitle;

    public String getTitle() { return title; }
    public void setTitle(String value) { this.title = value; }

    public String getPublisher() { return publisher; }
    public void setPublisher(String value) { this.publisher = value; }

    public List<IndustryIdentifier> getIndustryIdentifiers() { return industryIdentifiers; }
    public void setIndustryIdentifiers(List<IndustryIdentifier> value) { this.industryIdentifiers = value; }

    public ReadingModes getReadingModes() { return readingModes; }
    public void setReadingModes(ReadingModes value) { this.readingModes = value; }

    public String getPrintType() {
        return printType;
    }

    public void setPrintType(String printType) {
        this.printType = printType;
    }

    public String getMaturityRating() {
        return maturityRating;
    }

    public void setMaturityRating(String maturityRating) {
        this.maturityRating = maturityRating;
    }

    public boolean getAllowAnonLogging() { return allowAnonLogging; }
    public void setAllowAnonLogging(boolean value) { this.allowAnonLogging = value; }

    public String getContentVersion() { return contentVersion; }
    public void setContentVersion(String value) { this.contentVersion = value; }

    public ImageLinks getImageLinks() { return imageLinks; }
    public void setImageLinks(ImageLinks value) { this.imageLinks = value; }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPreviewLink() { return previewLink; }
    public void setPreviewLink(String value) { this.previewLink = value; }

    public String getInfoLink() { return infoLink; }
    public void setInfoLink(String value) { this.infoLink = value; }

    public String getCanonicalVolumeLink() { return canonicalVolumeLink; }
    public void setCanonicalVolumeLink(String value) { this.canonicalVolumeLink = value; }

    public List<String> getAuthors() { return authors; }
    public void setAuthors(List<String> value) { this.authors = value; }

    public String getPublishedDate() { return publishedDate; }
    public void setPublishedDate(String value) { this.publishedDate = value; }

    public String getDescription() { return description; }
    public void setDescription(String value) { this.description = value; }

    public Long getPageCount() { return pageCount; }
    public void setPageCount(Long value) { this.pageCount = value; }

    public List<String> getCategories() { return categories; }
    public void setCategories(List<String> value) { this.categories = value; }

    public Double getAverageRating() { return averageRating; }
    public void setAverageRating(Double value) { this.averageRating = value; }

    public Long getRatingsCount() { return ratingsCount; }
    public void setRatingsCount(Long value) { this.ratingsCount = value; }

    public PanelizationSummary getPanelizationSummary() { return panelizationSummary; }
    public void setPanelizationSummary(PanelizationSummary value) { this.panelizationSummary = value; }

    public String getSubtitle() { return subtitle; }
    public void setSubtitle(String value) { this.subtitle = value; }
}
