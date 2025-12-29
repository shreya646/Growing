class Solution {
    public int pivotIndex(int[] nums) {
     int x=0;
        int y=0;
        for(int i:nums){
            x=x+i;
        }
        for(int j=0;j<nums.length;j++){
              int k=nums[j];
            if(y==(x-y-k)){return j;}
             y+=nums[j];
        }


   return -1; }
}