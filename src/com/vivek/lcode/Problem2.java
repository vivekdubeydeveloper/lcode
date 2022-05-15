package com.vivek.lcode;
class Problem2 {
	
	public static void main(String[] args) {
		int [] nums= {3,2,2,3};
		int val=3;
		
		System.out.println(new Problem2().removeElement(nums, val));
	}
    public int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
            for(int j=i;j<nums.length-1;j++){
                nums[j]=nums[j+1];
            }
            nums[nums.length-1]=val+1;               
            count++;
            i--;    
            }
               
            
        }
        
        return nums.length-count;
    }
}