package model;

import java.util.Objects;

public class ComputerScienceStudent implements Student {

    private String id;
    private String givenName;
    private String surName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComputerScienceStudent computerScienceStudent = (ComputerScienceStudent) o;
        return Objects.equals(id, computerScienceStudent.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public ComputerScienceStudent() {
        this.id = "";
        this.givenName = "";
        this.surName = "";
    }

    public ComputerScienceStudent(String id, String givenName, String surName) {
        this.id = id;
        this.givenName = givenName;
        this.surName = surName;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getGivenName() {
        return givenName;
    }

    @Override
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    @Override
    public String getSurName() {
        return surName;
    }

    @Override
    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public String getCourse() {
        return "Computer Science";
    }

    @Override
    public String toString() {
        return this.id + "_" + this.surName + "_" + this.givenName;
    }
}
