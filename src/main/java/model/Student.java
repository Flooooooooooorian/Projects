package model;

import java.util.Objects;

public abstract class Student {

    protected String id;
    protected String givenName;
    protected String surName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public abstract String getCourse();

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", givenName='" + givenName + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }

    void printCourse() {
        System.out.println(this.getCourse());
    }
}
