package com.oops;

// Base class
class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Student class
class Student1 extends Person {

    Student1(String name, int id) {
        super(name, id);
    }

    void enrollClass(String className) {
        System.out.println(name + " enrolled in " + className);
    }
}

// Teacher class
class Teacher extends Person {

    Teacher(String name, int id) {
        super(name, id);
    }

    void assignGrade(String studentName, String grade) {
        System.out.println("Teacher " + name + " assigned grade "
                + grade + " to " + studentName);
    }
}

// Staff class
class Staff extends Person {

    Staff(String name, int id) {
        super(name, id);
    }

    void manageWork(String work) {
        System.out.println(name + " is responsible for " + work);
    }
}

// Main class
public class SchoolManagement {

    public static void main(String[] args) {

        Student1 s = new Student1("Koti", 101);
        Teacher t = new Teacher("Ramesh", 201);
        Staff st = new Staff("Suresh", 301);

        System.out.println("--- Student Details ---");
        s.displayDetails();
        s.enrollClass("Java Programming");

        System.out.println("\n--- Teacher Details ---");
        t.displayDetails();
        t.assignGrade("Koti", "A");

        System.out.println("\n--- Staff Details ---");
        st.displayDetails();
        st.manageWork("Administration");
    }
}