package edu.misena.senaviewer.model;

public class series extends Film {
    private int timeViewed;
    private int sessionQuantity;

    // Constructor
    public series(String title, String genre, String creator, int duration) {
        super(title, genre, creator, duration);
    }

    // Getters y Setters
    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    public int getSessionQuantity() {
        return sessionQuantity;
    }

    public void setSessionQuantity(int sessionQuantity) {
        this.sessionQuantity = sessionQuantity;
    }

    @Override
    public String toString() {
        return super.toString() + ", timeViewed=" + timeViewed + " minutes, sessionQuantity=" + sessionQuantity + "}";
    }
}



