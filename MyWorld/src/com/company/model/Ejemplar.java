package com.company.model;

import java.util.Date;
import java.util.Objects;

public class Ejemplar {

    private final String sku;
    private String itemTitle;
    private final Date dateOfAdquisition;

    public Ejemplar (String itemTitle){
        dateOfAdquisition = new Date();
        sku = String.valueOf(Objects.hash(itemTitle, dateOfAdquisition));
        this.itemTitle = itemTitle;

    }

    public String getSku() {
        return String.valueOf(this.sku);
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public Date getDateOfAdquisition() {
        return dateOfAdquisition;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.itemTitle, this.dateOfAdquisition);
    }
}
