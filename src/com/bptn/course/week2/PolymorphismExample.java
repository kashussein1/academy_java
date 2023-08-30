package com.bptn.course.week2;

public class PolymorphismExample {
    static class Animal{

        void sound(){
            System.out.println("none");
        }
    }

    static class Cat extends Animal{

        void sound(){
            System.out.println("meow");
        }
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        animal.sound();
        cat.sound();
    }
}
