package Homework5;

public class Person {

    private String name;
    private int age;
    private boolean isMan;

    public void isMan(boolean isMan) {
        System.out.println("man");
    }

    public Person(String name, int age, boolean isMan) {
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }

    public void showPersonInfo() {
        System.out.println(this.name + " is a " + this.isMan + this.age + "  years old");
    }
}
