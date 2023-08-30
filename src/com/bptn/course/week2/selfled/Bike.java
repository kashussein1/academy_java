package com.bptn.course.week2.selfled;

public class Bike extends Vehicle {

        //Declare an instance variable- String bikeHandle
        String bikeHandle;

        //add parameterized constructor- use super keyword to call parent constructor
        public Bike(String colour, String brand, String bikeHandle){
            super(colour, brand);
            this.bikeHandle =bikeHandle;
        }

        @Override
        public void print() {
            super.print();

        }

        }