package model;

import java.util.Objects;

public class HistoryStudent implements Student{

    private String id;
    private String givenName;
    private String surName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HistoryStudent historyStudent = (HistoryStudent) o;
        return Objects.equals(id, historyStudent.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getGivenName() {
        return this.givenName;
    }

    @Override
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    @Override
    public String getSurName() {
        return this.surName;
    }

    @Override
    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public String getCourse() {
        return "History";
    }
}
