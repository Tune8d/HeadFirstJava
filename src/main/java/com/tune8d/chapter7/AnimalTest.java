package com.tune8d.chapter7;

// Parent class
class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }

    public void roam() {
        System.out.println("This animal roams around.");
    }
}

// Subclass Dog
class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("The dog eats dog food.");
    }

    @Override
    public void roam() {
        System.out.println("The dog roams in the yard.");
    }
}

// Subclass Cat
class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("The cat eats cat food.");
    }

    @Override
    public void roam() {
        System.out.println("The cat roams on the roof.");
    }
}

// Subclass Wolf
class Wolf extends Animal {
    @Override
    public void eat() {
        System.out.println("The wolf eats meat.");
    }

    @Override
    public void roam() {
        System.out.println("The wolf roams in the forest.");
    }
}

// Subclass Hippo
class Hippo extends Animal {
    @Override
    public void eat() {
        System.out.println("The hippo eats grass.");
    }

    @Override
    public void roam() {
        System.out.println("The hippo roams in the water.");
    }
}

// Subclass Lion
class Lion extends Animal {
    @Override
    public void eat() {
        System.out.println("The lion eats prey.");
    }

    @Override
    public void roam() {
        System.out.println("The lion roams in the savannah.");
    }
}

class Vet {
    public void giveShot(Animal animal) {
        System.out.println("The animal dodged a needle.");
        animal.roam();
    }
}

// Main class
public class AnimalTest {
    public static void main(String[] args) {
        // Create an array of Animal objects
        Animal[] animals = new Animal[5];

        // Initialize each element with a different subclass
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Wolf();
        animals[3] = new Hippo();
        animals[4] = new Lion();

        // Iterate through the array and call methods
        for (Animal animal : animals) {
            animal.eat();
            animal.roam();
            System.out.println(); // Add a blank line for better readability
        }

        Vet vet = new Vet();
        Animal testA = new Dog();
        vet.giveShot(testA);
    }
}

