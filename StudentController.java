package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student: " + name + ", Age: " + age;
    }
}


class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher: " + name + ", Subject: " + subject;
    }
}


class Course {
    private String title;
    private int duration;

    public Course(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Course: " + title + ", Duration: " + duration + " weeks";
    }
}


class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book: " + title + ", Author: " + author + ", Price: $" + price;
    }
}

@RestController
public class StudentController {
    private Student student = new Student("Ali", 21);
    private Teacher teacher = new Teacher("Ms. Smith", "Mathematics");
    private Course course = new Course("Java Programming", 8);
    private Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 12.99);

    @GetMapping("/student")
    public String getStudent() {
        return student.toString();
    }

    @GetMapping("/is-adult/{age}")
    public String isAdult(@PathVariable int age) {
        if (age >= 18) {
            return "Age " + age + ": You are an adult.";
        } else {
            return "Age " + age + ": You are not an adult.";
        }
    }

    @GetMapping("/update-student/{age}")
    public String updateStudentAge(@PathVariable int age) {
        student.setAge(age);
        return "Student age updated to " + age + ". New details: " + student.toString();
    }

    @GetMapping("/teacher")
    public String getTeacher() {
        return teacher.toString();
    }

    @GetMapping("/course")
    public String getCourse() {
        return course.toString();
    }

    @GetMapping("/book")
    public String getBook() {
        return book.toString();
    }
}
