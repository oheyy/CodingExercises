package com.daniel.codingexercises.challenges.SingleNumber;

public class SingleNumber {
    public SingleNumber(){
    }

    public int singleNumber(int[] nums){
        int ans =0;

        int len = nums.length;
        for(int i=0;i!=len;i++)
            ans ^= nums[i];

        return ans;

    }
}
