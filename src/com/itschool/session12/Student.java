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
                ", coursesCount=" + courses.size() +
                '}';
    }
}

