package Homework6;

public class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println(this.name + " is playing!");
    }

    @Override
    public void speak() {
        System.out.println("Chik - chirik!");
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("The birds are very noisy in the morning.");
    }

    public void fly() {
        System.out.println(this.name + " is flying.");
    }

    public void sync(String name) {
        System.out.println("This bird makes noise.");
    }

    public void sync(String name, String name2) {
        System.out.println("The noise is louder now :(");
    }
}
