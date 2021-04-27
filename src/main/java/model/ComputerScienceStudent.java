package model;

import java.util.Objects;

public class ComputerScienceStudent extends Student{

    public ComputerScienceStudent(String id, String givenName, String surName) {
        this.id = id;
        this.givenName = givenName;
        this.surName = surName;
    }

    @Override
    public String getCourse() {
        return "Computer Science";
    }

    @Override
    public void move(String distance) {
        System.out.println("walked: " + distance);
    }
}
