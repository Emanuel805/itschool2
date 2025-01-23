package com.itschool.session12;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Student> students = new ArrayList<>();
    public static List<Professor> professors = new ArrayList<>();
    public static List<Course> courses = new ArrayList<>();

    public static void main(String[] args) {
        Professor prof1 = new Professor();
        prof1.firstName = "Ionutz";
        prof1.lastName = "Baur";
        prof1.sex = "M";
        prof1.age = 33;
        prof1.dateOfBirth = "12.07.1992";
        prof1.cnp = "5012345678913";
        prof1.address = "Strada Argesului";
        professors.add(prof1);

        Student student1 = new Student();
        student1.firstName = "Trandafir";
        student1.lastName = "Emanuel";
        student1.sex = "M";
        student1.age = 24;
        student1.cnp = "5010345624913";
        student1.address = "Strada Rapsodiei";
        student1.dateOfBirth = "09.12.2000";
        students.add(student1);

        courses.add(new Course("Math", "Monday 10:00-12:00", "2 hours", "Math", prof1));
        courses.add(new Course("Computer Science", "Tuesday 14:00-16:00", "2 hours", "Computer Science", prof1));
        courses.add(new Course("Physics", "Wednesday 10:00-12:00", "2 hours", "Physics", prof1));
        courses.add(new Course("Chemistry", "Thursday 14:00-16:00", "2 hours", "Chemistry", prof1));
        courses.add(new Course("Biology", "Friday 10:00-12:00", "2 hours", "Biology", prof1));
        courses.add(new Course("Geography", "Monday 14:00-16:00", "2 hours", "Geography", prof1));
        courses.add(new Course("English", "Tuesday 10:00-12:00", "2 hours", "English", prof1));
        courses.add(new Course("History", "Wednesday 14:00-16:00", "2 hours", "History", prof1));

        printStudents();
        printProfessors();
        printCourses();

    }

    public static void printStudents() {
        System.out.println("Students:");
        for (Student student : students) {
            System.out.println(student.firstName + " " + student.lastName);
        }

    }

    public static void printProfessors() {
        System.out.println("Professors:");
        for (Professor professor : professors) {
            System.out.println(professor.firstName + " " + professor.lastName);
        }
    }

    public static void printCourses() {
        System.out.println("Courses:");
        for (Course course : courses) {
            System.out.println(course);
        }
    }
}
