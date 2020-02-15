package com.daniel.codingexercises.challenges.MoveZeroes;

public class MoveZeroes {
    public MoveZeroes(){}

    public int[] moveZeroes(int[] nums) {
        int[] orderArray = new int[nums.length];
        int count = 0;
        int last = nums.length -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                orderArray[count] = nums[i];
                count += 1;
            }else {
                orderArray[last] = nums[i];
                last -= 1;
            }
        }
        return orderArray;
    }
}
