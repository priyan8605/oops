package Constructors;

import java.util.*;

abstract class person {
    String name;
    int age;
    int height;

    person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
}

public class Student extends person {
    int weight;
    int marks;
    int rollno;

    public Student(String name, Integer age, int height, int weight, int rollno, int marks) {
        // in person class already code is written for initilization of name age and
        // height
        // to use that code in student we will use super()
        super(name, age, height);
        this.weight = weight;
        this.rollno = rollno;
        this.marks = marks;

    }

    public static void main(String[] args) {
        person p = new Student("rohan ",1 , 1 , 1,  1 , 1 );

    }
}
