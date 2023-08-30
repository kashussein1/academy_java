package com.bptn.course.week2.methodoverriding;

public class Car extends Vehicle{

    private String streetingWheel;

    public Car(String color, String brand, String streetingWheel) {
        super(color, brand);
        this.streetingWheel = streetingWheel;
    }

    @Override
    public void print(){
        super.print();
    }
}
