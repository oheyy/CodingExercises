package com.daniel.codingexercises.challenges.MajorityElement;

import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums){
        Integer result = null;
        HashMap<Integer, Integer> majorityElementMap = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(majorityElementMap.get(nums[i]) != null){
                majorityElementMap.put(nums[i], majorityElementMap.get(nums[i]) +1);
                if(majorityElementMap.get(nums[i]) > nums.length/2){
                    result = nums[i];
                }
            }else{
                majorityElementMap.put(nums[i], 1);
            }
        }
        return result;
    }
}
