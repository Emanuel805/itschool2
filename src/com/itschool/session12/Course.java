package com.itschool.session12;

public class Course {

    private final String name;
    private final String schedule;
    private final String duration;
    private final String description;
    private final Professor assignedProfessor;

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
                ", assignedProfessor=" + assignedProfessor +
                '}';
    }
}


