class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0;
        while(i<nums.length){
            if(nums[i]==i+1) i++;
            else{int t=nums[i];
            nums[i]=nums[t-1];
            nums[t-1]=t;
            if(nums[i]==nums[t-1]) {i++; 

            }}}
            for(int j=0;j<nums.length;j++){
                if(nums[j]!=j+1) ans.add(nums[j]);
            }
           
                return ans;}}