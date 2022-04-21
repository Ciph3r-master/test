package fr.cipher.test.poo;

public abstract class Animal {

    private int mass;

    public Animal() {

        System.out.println("Building an animal");

    }

    public Animal(int mass) {

        this.mass = mass;

        System.out.println("Building an animal with"+mass);

    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }
}
