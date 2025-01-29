package com.itschool.session12;


import java.util.ArrayList;
import java.util.List;

public class Student {
    public String firstName;
    public String lastName;
    public String sex;
    public int age;
    public String dateOfBirth;
    public String cnp;
    public String address;
    public List<Course> courses = new ArrayList<>();

    public void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);

            /*this method ensures that a student is not enrolled in the same course more than once.
            It adds the course to the student's list of courses only if it is not already present.
             */
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                ", cnp='" + cnp + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

