package edu.misena.senaviewer.model;

import java.util.Date;

public class book {

     int id;
     String title;
     Date editionDate;
     String editorial;
     String authors;
     int isbn;
     boolean readed;
     Date timeReaded;
     public book(){

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

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public book (String title, Date editionDate, String editorial, int isbn){

        this.title = title;
        this.editionDate = editionDate;
        this.editorial = editorial;
        this.isbn = isbn;
    }
}
