package com.company.model;

import java.util.Date;
import java.util.Objects;

public class Ejemplar {

    private final String sku;
    private String ejemplarTitle;
    private String author;
    private final Date dateOfAdquisition;

    public Ejemplar (String itemTitle){
        dateOfAdquisition = new Date();
        sku = String.valueOf(Objects.hash(itemTitle, dateOfAdquisition));
        this.ejemplarTitle = itemTitle;

    }

    public String getSku() {
        return sku;
    }

    public String getAuthor(){
        return this.author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getEjemplarTitle() {

        return ejemplarTitle;
    }

    public void setEjemplarTitle(String itemTitle) {

        this.ejemplarTitle = itemTitle;
    }

    public Date getDateOfAdquisition() {

        return dateOfAdquisition;
    }

    @Override
    public int hashCode() {

        return Objects.hash(this.ejemplarTitle, this.dateOfAdquisition);
    }
}
