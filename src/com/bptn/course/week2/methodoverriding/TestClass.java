package com.bptn.course.week2.methodoverriding;

public class TestClass {

    // Use the code below for Sanity check. Do not Modify the code below for testing purpose.
    public static void main(String args[]) {
        Car car = new Car("White", "Audi", "ChromeColored");
        car.print();

        Bike bike = new Bike("Grey", "Bianchi", "SilverColored");
        bike.print();
    }
}