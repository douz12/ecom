package com.ecom.model;

import org.ektorp.support.CouchDbDocument;

public class Image extends CouchDbDocument {
    private String src;
    private String alt;
    private String title;

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
