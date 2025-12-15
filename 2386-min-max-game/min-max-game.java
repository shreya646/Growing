class Solution {
    public int minMaxGame(int[] nums) {
        int n=nums.length;
        while(n!=1){
            int x=(n/2);
            int[] newNums=new int[x];
            for(int i=0;i<x;i++){
                if(i%2==0) newNums[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
                else   newNums[i] =Math.max(nums[2 * i], nums[2 * i + 1]);}
                nums=newNums;
                 n=n/2;}
  return nums[0];  }
}