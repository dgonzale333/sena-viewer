package edu.misena.senaviewer.model;

import java.util.Date;

public class magazine {

    int id;
    String title;
    Date editionDate;
    String editorial;
    String authors;
    public magazine(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getEditionDate() {
        return editionDate;
    }

    public void setEditionDate(Date editionDate) {
        this.editionDate = editionDate;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public magazine(String title, Date editionDate, String editorial){

        this.title = title;
        this.editionDate = editionDate;
        this.editorial = editorial;
    }
}
