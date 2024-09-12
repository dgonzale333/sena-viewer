package edu.misena.senaviewer.model;

import java.util.Date;

public class Publication {



    String title;
    Date editionDate;
    String editorial;
    String authors;

    // Constructor

    public Publication(String title, Date editionDate, String editorial){

        this.title = title;
        this.editionDate = editionDate;
        this.editorial = editorial;
    }

    // Getters y Setters

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


    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Publication{" +
                "title='" + title + '\'' +
                ", editionDate=" + editionDate +
                ", editorial='" + editorial + '\'' +
                ", authors='" + authors + '\'' +
                '}';
    }
}
