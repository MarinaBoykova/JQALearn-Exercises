package Homework5;

public class Person {

    protected String name;
    protected int age;
    protected boolean isMan;

    public Person(String name, int age, boolean isMan) {
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }

    public String getGender() {
        return isMan ? "male" : "female";
    }

    public String showPersonInfo() {
        return (this.name + " is a " + this.getGender() + ", " + this.age + " years old.");
    }
}
