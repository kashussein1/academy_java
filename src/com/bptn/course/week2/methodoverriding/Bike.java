package com.bptn.course.week2.methodoverriding;

public class Bike extends Vehicle {
    private String bikeHandle;

    public Bike(String color, String brand, String bikeHandle) {
        super(color, brand);
        this.bikeHandle = bikeHandle;
    }

    @Override
    public void print(){
        super.print();
    }
}
