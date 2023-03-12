package Homework6;

public class AnimalDemo {
    public static void main(String[] args) {
        Bird birdObj = new Bird("Franky");
        Cat catObj = new Cat("Moris");
        Dog dogObj = new Dog("Arthur");

        birdObj.play();
        birdObj.makeSomeNoise();

        catObj.play();
        catObj.makeSomeNoise();

        dogObj.play();
        dogObj.makeSomeNoise();
    }
}
