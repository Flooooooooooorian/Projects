package model;

public interface Student {

    String getId();

    void setId(String id);

    String getGivenName();

    void setGivenName(String givenName);

    String getSurName();

    void setSurName(String surName);

    String getCourse();

    default void printCourse() {
        System.out.println(this.getCourse());
    }
}
