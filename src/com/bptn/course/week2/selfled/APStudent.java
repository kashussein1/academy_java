package com.bptn.course.week2.selfled;

public class APStudent extends Student {

    private int apScore;

    public APStudent(String name, int id, int apScore) {
        super(name, id);
        this.apScore = apScore;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.apScore;
    }
}
