package Homework5;

public class Student extends Person {
    double score;

    public Student(String name, int age, boolean isMan, double score) {
        super(name, age, isMan);
        this.score = score;
    }

    public String showStudentInfo() {
        return (this.name + " is a " + this.getGender() + ", " + this.age + " years old. His Score is: " + this.score);
    }
}
