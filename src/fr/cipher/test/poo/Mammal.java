package fr.cipher.test.poo;

public class Mammal extends Animal{

    String family;

    public Mammal() {

        System.out.println("Building a bear");

    }

    public Mammal(int mass, String family) {
        super(mass);

        this.family = family;

        System.out.println("Building a mammal with "+mass+" and "+family);

    }
}
