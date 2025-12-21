class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]==i+1||nums[i]<=0||nums[i]>nums.length) {i++;}
            else{int temp=nums[i];
            nums[i]=nums[temp-1];
            nums[temp-1]=temp;
            if(nums[i]==nums[temp-1]) i++;}
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1) return j+1;
        }
    return nums.length+1; }
}