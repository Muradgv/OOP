package com.example;
import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Human implements Teachable{
    @JsonBackReference
    private List<Course> courseteach= new ArrayList<>();

    public Teacher(String name, String surname, int age, int id, String phoneNumber) {
        super(name, surname, age, id, phoneNumber);
    }
    public List<Course> getCourseteach() {
        return courseteach;
    }

    @Override
    public void Teachcourse(Course course) {
        courseteach.add(course);
        course.setteacher(this);
    }
}
