package edu.misena.senaviewer.model;

import java.util.Date;

public class movie extends Film {


   int timeViewed;

   public movie(String title, String genre, String creator, int duration, Date year) {
       super(title, genre, creator, duration);
       setYear(year);
   }

   // Getters y Setters
    public int getTimeViewed() {
       return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
       this.timeViewed = timeViewed;
    }

    @Override
    public String toString() {
       return super.toString() + ", timeViewed=" + timeViewed + "minutes}";
    }

}
