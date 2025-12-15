class Solution {
    public int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer> even=new ArrayList<>();
         ArrayList<Integer> odd=new ArrayList<>();
         for(int i=0;i<nums.length;i++){
            if(i%2==0) even.add(nums[i]);
         else odd.add(nums[i]);}
         Collections.sort(even);
         Collections.sort(odd,Collections.reverseOrder());
         int e=0;
         int o=0;
         int[] ans=new int[nums.length];
         for(int j=0;j<nums.length;j++){
            if(j%2==0) {ans[j]=even.get(e++);}
            else ans[j]=odd.get(o++);
         }

    return ans;    }}