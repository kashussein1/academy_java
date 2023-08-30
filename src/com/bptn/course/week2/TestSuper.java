package com.bptn.course.week2;

public class TestSuper {
    static class Base {
        public void methodOne() {
            System.out.print("A");
            methodTwo();
        }

        public void methodTwo() {
            System.out.print("B");
        }
    }

     static class Derived extends Base {
        public void methodOne() {
            super.methodOne();
            System.out.print("C");
        }

        public void methodTwo() {
            super.methodTwo();
            System.out.print("D");
        }
    }

    public static void main(String[] args) {
        Base b = new Derived();
        b.methodOne();
    }
}
