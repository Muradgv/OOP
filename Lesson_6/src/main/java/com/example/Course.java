package com.example;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import java.util.ArrayList;
import java.util.List;
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "name")
public class Course {
    private String name;
    private Teacher teacher;
    private List<Exam> exams;

    public Course(String name) {
        this.name = name;
        this.exams = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setteacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void addExam(Exam exam) {
        exams.add(exam);
    }

    public List<Exam> getExams() {
        return exams;
    }

    @Override
    public String toString() {
        return "Course{name='" + name + "', teacher=" + (teacher != null ? teacher.getName() : "None") + ", exams=" + exams + "}";
    }
}