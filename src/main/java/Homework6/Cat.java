package Homework6;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println(this.name + " is playing with another cat.");
    }

    @Override
    public void speak() {
        System.out.println("Meow!");
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("This cat " + this.name + " is very noisy!");
    }

    public void climp() {
        System.out.println("The cat is climbing!");
    }
}
