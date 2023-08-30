package com.bptn.course.week2;

public class Cat extends Pet{

    public Cat (String name){
        super(name, "cat");
    }

    @Override
    public String speak(){
        return "Meow!";
    }
}
