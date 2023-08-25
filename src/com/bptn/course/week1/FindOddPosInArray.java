package com.bptn.course.week1;

public class FindOddPosInArray {
    public static void main(String[] args) {
        int [] nums = {10, 20, 30, 40, 50};
        int length = nums.length;

        for(int i =0; i < length; i++){
            if(i % 2 !=0){
                System.out.println(nums[i]);
            }
        }
    }
}
