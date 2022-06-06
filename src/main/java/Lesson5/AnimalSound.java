package Lesson5;

public class AnimalSound {

    public static void main(String[] args) {

        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        Animal animal3 = new Animal();

        animal1.doSound();
        animal2.doSound();
        animal3.doSound();
    }
}

class Animal {
    void doSound() {
        System.out.println("AnimalSound");
        return;
    }
}

class Cat extends Animal {
    @Override
    void doSound() {
        System.out.println("Meow");
        return;
    }
}

class Dog extends Animal {
    @Override
    void doSound() {
        System.out.println("Bark!");
        return;
    }
}
