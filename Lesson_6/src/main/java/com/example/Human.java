package com.example;

import com.fasterxml.jackson.annotation.JsonManagedReference;

public abstract class Human {
    @JsonManagedReference
    private String name;
    private String surname;
    private int age;
    private int id;
    private String phoneNumber;

    public Human(String name, String surname, int age, int id, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.id = id;
        this.phoneNumber = phoneNumber;
    }
    //getter and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
