package com.example;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Ali", "Aliyev", 20, 1, "0551234567"),
                new Student("Veli", "Veliev", 21, 2, "0551234568"),
                new Student("Huseyn", "Huseynov", 22, 3, "0551234569"),
                new Student("Mehdi", "Mehmedov", 23, 4, "0551234570"),
                new Student("Ayse", "Aydin", 24, 5, "0551234571")
        ));

        List<Teacher> teachers = new ArrayList<>(Arrays.asList(
                new Teacher("Ali", "Aliyev", 30, 1, "0551239597"),
                new Teacher("Veli", "Veliev", 31, 2, "0551265478")
        ));

        List<Course> courses = new ArrayList<>(Arrays.asList(
                new Course("Math"),
                new Course("Physics")
        ));

        // Add exams to courses
        Exam exam1 = new Exam(students.get(2), courses.get(0));
        courses.get(0).addExam(exam1);

        Exam exam2 = new Exam(students.get(3), courses.get(1));
        courses.get(1).addExam(exam2);

        // Write data to JSON files
        writeToJsonFile("students.json", students);
        writeToJsonFile("teachers.json", teachers);
        writeToJsonFile("courses.json", courses);
        writeToJsonFile("exams.json", Arrays.asList(exam1, exam2));
    }

    private static <T> void writeToJsonFile(String fileName, List<T> data) {
        ObjectMapper objectMapper = new ObjectMapper()
                .enable(SerializationFeature.INDENT_OUTPUT);
        ObjectWriter writer = objectMapper.writerWithDefaultPrettyPrinter();

        try {
            writer.writeValue(new File(fileName), data);
            System.out.println("Data written to " + fileName);
        } catch (StackOverflowError e) {
            System.err.println("Circular reference detected when writing to "
                    + fileName + ": " + e);
        } catch (IOException e) {
            System.err.println("Error writing to file "
                    + fileName + ": " + e.getMessage());
        }
    }

}