package org.example.students;

public class Student {
    private String name;
    private int age;
    private int grade;

    Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }
}
