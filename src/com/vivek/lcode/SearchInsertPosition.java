package com.vivek.lcode;
class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int result=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
               result=i;
               break; 
            }else if(nums[i]>target){
              result=i;
              break;  
            }
        }
        
        return result;
        
    }
}