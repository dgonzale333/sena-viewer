package edu.misena.senaviewer.model;

import java.util.Date;

public class book extends Publication {

     int id;
     String authors;
     int isbn;
     boolean readed;
     Date timeReaded;


     public book (String title, Date editionDate, String editorial){
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

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public boolean isReaded() {
        return readed;
    }

    public void setReaded(boolean readed) {
        this.readed = readed;
    }

    public Date getTimeReaded() {
        return timeReaded;
    }

    public void setTimeReaded(Date timeReaded) {
        this.timeReaded = timeReaded;
    }

    @Override
    public String toString() {
        return "book{" +
                "id=" + id +
                ", authors='" + authors + '\'' +
                ", isbn=" + isbn +
                ", readed=" + readed +
                ", timeReaded=" + timeReaded +
                '}';
    }
}
