package com.example;



public class Exam implements Gradable{
    private Student student;
    private Course course;
    private int grade;
    public Exam(Student student, Course course) {
        this.student = student;
        this.course = course;
    }
    public Student getStudent() {return student;}
    public Course getCourse() {return course;}

    @Override
    public String toString() {
        return "Exam{student=" + student.getName() + ", course=" + course.getName() + "}";
    }

    @Override
    public void calcgrade() {
        this.grade = (int) (Math.random() * 100);
    }

}
