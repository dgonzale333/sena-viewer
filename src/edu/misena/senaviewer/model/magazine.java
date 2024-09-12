package edu.misena.senaviewer.model;

import java.util.Date;

public class magazine extends Publication {

    int id;
    String authors;

    public magazine(String title, Date editionDate, String editorial){
        super(title, editionDate, editorial);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getAuthors() {
        return authors;
    }

    @Override
    public void setAuthors(String authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "magazine{" +
                "id=" + id +
                ", authors='" + authors + '\'' +
                '}';
    }
}
