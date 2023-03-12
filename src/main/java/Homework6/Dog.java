package Homework6;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("Dog is playing!");
    }

    @Override
    public void speak() {
        System.out.println("Woof! Woof!");
    }

    @Override
    public void makeSomeNoise() {
        System.out.println(this.name + " is barking and making noise.");
    }

    public void bringStick() {
        System.out.println(this.name + " is bringing the stick!");
    }
}
