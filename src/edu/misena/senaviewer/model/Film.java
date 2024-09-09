package edu.misena.senaviewer.model;

import java.util.Date;

public class Film {

    int id;
    String title;
    String genre;
    String creator;
    int duration;
    Date year;
    boolean viewed;
    public Film(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Film(String title, String genre, String creator, int duration){

        this.title = title;
        this.genre = genre;
        this.creator = creator;
        this.duration = duration;
    }
}
