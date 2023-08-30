package com.bptn.course.week2;

public class Dog extends Pet{

    public Dog(String name){

        super(name, "dog");
    }

    @Override
    public String speak(){
        return "Woof!";
    }
}
