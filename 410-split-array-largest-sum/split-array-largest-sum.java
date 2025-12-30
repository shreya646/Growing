class Solution {
    public int splitArray(int[] nums, int k) {
        int first=0;
        int last=0;
        int ans=-1;
        for(int i:nums){
            first=Math.max(first,i);
            last+=i;
        }
        while(first<=last){
            int mid=first+(last-first)/2;
            if(isvalid(nums,mid,k)){
             ans=mid;
             last=mid-1;
            }
            else{first=mid+1;}}
            return ans;}
public static boolean isvalid(int[]arr,int upper,int k) {
int sum=0;
int sub=1;
      for(int i=0;i<arr.length;i++){
if(sum+arr[i]>upper){
    sub++;
sum=arr[i];
if(sub>k) return false;}
else sum+=arr[i];}
       return true;} 
    }
