class Solution {
    public int searchInsert(int[] nums, int target) {
        int f=0;
        int l=nums.length-1;
        int mid=0;
        while(f<=l){
            mid=f+(l-f)/2;
            if(target==nums[mid]) return mid;
            else if(nums[mid]<target){
                f=mid+1;
            }
            else{l=mid-1;}
        }
  return f;  }
}