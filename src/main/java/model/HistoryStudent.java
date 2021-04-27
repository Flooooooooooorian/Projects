package model;

public class HistoryStudent extends Student{

    public HistoryStudent(String id, String givenName, String surName) {
        this.id = id;
        this.givenName = givenName;
        this.surName = surName;
    }

    @Override
    public String getCourse() {
        return "History";
    }
}
