package Lesson5;

import TestJU.MyJUnitCase;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void newAnimalTest() {
        Animal animal4 = new Animal();
        String actual = animal4.doSound();
        Assert.assertNotNull(actual);
    }

    @Test
    void newCatTest() {
        Animal kitty = new Cat();
        String expected = "Meow";
        String actual = kitty.doSound();
        Assert.assertEquals(expected, actual);
    }

    @Test
    void newDogTest() {
        Animal doggy = new Dog();
        String expected = "Bark!";
        String actual = Kitty.doSound();
        Assert.assertEquals(expected, actual);
    }

}