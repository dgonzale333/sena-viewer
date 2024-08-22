package edu.misena.senaviewer.model;

import java.util.Date;

public class movie {

    int id;
    String title;
    String genero;
    String creator;
    int duration;
    Date year;
    boolean viewed;
    int timeViewed;
    public movie(String title, String genre, String creator, int duration, int year){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public movie(String title, String genero, String creator, int duration, Date year){

        this.title = title;
        this.genero = genero;
        this.creator = creator;
        this.duration = duration;
        this.year = year;
    }
}
