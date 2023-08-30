package com.bptn.course.week2.selfled;

public class SavingsAccount extends Account{

    private double interest;

    public SavingsAccount(String name, double balance, double interest) {
        super(name, balance);
        this.interest = interest;
    }

    @Override
    public String toString(){

        return super.toString() + " , " + this.interest;
    }

    @Override
    public boolean equals(Object o){
        SavingsAccount savings = (SavingsAccount) o;
        return super.equals(savings) && this.interest == savings.interest;
    }
}
