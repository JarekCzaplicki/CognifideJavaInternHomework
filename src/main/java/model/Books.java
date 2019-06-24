package model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Books {
    @SerializedName("requestedUrl")
    private String requestedUrl;
    private List<Item> items;

    public String getRequestedUrl() { return requestedUrl; }
    public void setRequestedUrl(String value) { this.requestedUrl = value; }

    public List<Item> getItems() { return items; }
    public void setItems(List<Item> value) { this.items = value; }
}
