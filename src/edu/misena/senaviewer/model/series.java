package edu.misena.senaviewer.model;

import java.util.Date;

public class series extends Film {


    String creator;


    public series(String title, String genero, String creator, int duration, int year){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public series(String title, String genero, int duration){

        this.title = title;
        this.genero = genero;
        this.duration = duration;
    }
}


