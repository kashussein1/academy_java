package com.bptn.course.week2.methodoverriding;

public class Vehicle {
    private String color;
    private String brand;

    public Vehicle(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    public void print() {
        System.out.println(this.color + " " + this.brand);
    }

}
