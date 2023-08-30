package com.bptn.course.week2.cars;

class Car {

    // Fill in the code for Step 2
   String color;
   String brand;
   int price;



   public Car(){

   }
    public Car(String color, String brand, int price) {
        // Fill in the code for Step 4
        this.color = color;
        this.brand = brand;
        this.price = price;
    }




    void printCarDetails() {

                this.print();
    }

   private void print(){
        System.out.println("Car{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}');
    }

}