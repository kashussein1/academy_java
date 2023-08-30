package com.bptn.course.week2.selfled;

public class Car extends Vehicle {

    //instance variable
    String steeringWheel;

    //add parameterized constructor- use super keyword to call parent constructor
    public Car(String colour, String brand, String steeringWheel){
        super(colour, brand);
        this.steeringWheel =steeringWheel;
    }

    @Override
    public void print() {
        super.print();

    }



}