package org.example.Entity;

public class Room {
    private int id;
    private boolean vacancy;

    public Room(int id, boolean vacancy) {
        this.id = id;
        this.vacancy = vacancy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isVacancy() {
        return vacancy;
    }

    public void setVacancy(boolean vacancy) {
        this.vacancy = vacancy;
    }
}
