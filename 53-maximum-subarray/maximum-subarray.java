class Solution {
    public int maxSubArray(int[] nums) {
        //kedans algo
        int sum=0;
        int maxs=nums[0];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
             maxs=(int)Math.max(sum,maxs);
            if(sum<0){sum=0;}
        }
      return maxs;   
    }
}