package com.bptn.course.week2.selfled;

// Complete the OnlineCustomer class below to inherit from Customer
public class OnlineCustomer extends Customer // complete line
{
    private String email;

    // add constructor
    public OnlineCustomer( String name, String address, String email){
        super(name, address);
        this .email = email;
    }

    // override toString method of superclass

    @Override

    public String toString(){
        String output = super.toString();
        output += "\nEmail: " + email;
        return output;
    }

}
