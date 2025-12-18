class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p=1,c=0;
     for(int i=0;i<nums.length;i++){
        if(nums[i]==0){ 
            c++;
        continue; }
        p*=nums[i];
     }
     if(c==0){
     for(int j=0;j<nums.length;j++){
        nums[j]=(p/nums[j]);
     }  } 
     else if(c==1){
        for(int o=0;o<nums.length;o++){
            if(nums[o]==0) nums[o]=p;
            else nums[o]=0;
        }}
        else Arrays.fill(nums,0);
     
   return nums; }
}