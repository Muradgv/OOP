package com.example;
import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.ArrayList;
import java.util.List;

public class Student extends Human {
    @JsonBackReference
    private List<Course> courses = new ArrayList<>();

    public Student(String name, String surname, int age, int id, String phoneNumber) {
        super(name, surname, age, id, phoneNumber);
    }

    public void enrollInCourse(Course course) {
        courses.add(course);
        System.out.println(getName() + " enrolled in " + course.getName());
    }

}