class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int first=1;
        int last=0;
        for(int i:nums){
          last=Math.max(last,i);  
        }
        int ans=last;
        while(first<=last){
            int mid=first+(last-first)/2;
            if(isvalid(nums,mid,threshold)){
                  ans=mid;
                  last=mid-1;
            }
            else{first=mid+1;}
        }  return ans;
    }
    public static boolean isvalid(int[]arr,int m,int thr){
         long sum=0;
        for(int i:arr){
           if(i%m==0)  {sum+=(i/m);}
          else {sum+=(i/m)+1;}
           if(sum>thr) return false;
        }
    return true;}
}