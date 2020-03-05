package edu.demo.classes.constructors;

public class Puppy {
    private String name;
    public Puppy() {
    }

    public Puppy(String name) {
       this.name = name;
    }

    public static void main(String[] args) {
        Puppy p1 = new Puppy();
        Puppy p2 = new Puppy("Lulú");
    }
}