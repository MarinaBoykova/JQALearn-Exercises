package Homework6;

public abstract class Animal implements IAnimal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void play();

    public abstract void speak();

}
