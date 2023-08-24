package com.bptn.course.week1;

public class BatteryTest {
    public static void main(String[] args) {
        int battery = 30;
        if(battery < 50){
            System.out.println("Plug in your phone!");
        }else if(battery == 100){
            System.out.println("Unplug your phone!");
        }else{
            System.out.println("All okay!");
        }

    }
}
