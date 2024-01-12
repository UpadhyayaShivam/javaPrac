package com.shivam.intro;

public class Main {
    public static void main(String[] args) {
        // here using only default constructor that's zero argument

//            Student student1 = new Student();
//            student1.name = "Shivam Sharma";
//            student1.age = 21;
//            student1.marks = 84.4f;
//            student1.rollno = 10290;
//            System.out.println(student1.name);
//            System.out.println(student1.age);
//            System.out.println(student1.marks);
//            System.out.println(student1.rollno);
        Student Shivam = new Student(210930, 21 , 84.4f,"Shivam Sharma");
        Shivam.greeting();
        Shivam.printValues();
        Shivam.changeName("Shivam Upadhyaya");
        System.out.println(Shivam.name);
        System.out.println(".............");
        Student random = new Student(Shivam);
        random.printValues();

    }

    // creating a new class named student for students data consisting of rollno marks name and age
    public static class Student{
        int rollno;
        float marks;
        String name;
        int age;
        Student (){};
        // making parametric constructor
        Student (int rollno,int age, float marks, String name){
            this.rollno = rollno;
            this.name = name;
            this.age = age;
            this.marks = marks;
        }
        // changing the name
        void changeName(String name){
            this.name = name;
        }
        //sending object in constructor
        Student( Student other){
            this.name = other.name;
            this.age = other.age;
            this.rollno = other.rollno;
            this.marks = other.marks;
        }
        // just a greeting function
        void greeting(){
            System.out.println("hello my name is " + this.name);
        }
        // function to print values
        void printValues(){
            System.out.println("rollno : " + this.rollno);
            System.out.println("age : " + this.age);
            System.out.println("marks : " + this.marks);
            System.out.println("name : " + this.name);
        }

    }
}
