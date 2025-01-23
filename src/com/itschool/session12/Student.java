package com.itschool.session12;


public class Student {
    public String firstName;
    public String lastName;
    public String sex;
    public int age;
    public String dateOfBirth;
    public String cnp;
    public String address;

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

