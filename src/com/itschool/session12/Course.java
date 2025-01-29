package com.itschool.session12;

import java.util.ArrayList;
import java.util.List;

public class Course {

    public String name;
    public String schedule;
    public String duration;
    public String description;
    public Professor assignedProfessor;


    public Course(String name, String schedule, String duration, String description, Professor assignedProfessor) {
        this.name = name;
        this.schedule = schedule;
        this.duration = duration;
        this.description = description;
        this.assignedProfessor = assignedProfessor;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", schedule='" + schedule + '\'' +
                ", duration='" + duration + '\'' +
                ", description='" + description + '\'' +
                ", assignedProfessor=" + assignedProfessor.firstName + " " + assignedProfessor.lastName +
                '}';
    }
}



