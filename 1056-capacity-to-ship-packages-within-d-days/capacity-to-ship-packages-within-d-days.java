class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int first=0;
        int last=0;
        int ans=0;
        for(int i:weights){
            first=Math.max(first,i);
            last+=i;
        }
        while(first<=last){
            int mid=first+(last-first)/2;
            if(isvalid(weights,days,mid,n)){
                ans=mid;
                last=mid-1;}
                else{first=mid+1;}}
                return ans;}

            public static boolean isvalid(int[] arr, int days, int upper,int arrsize){
               int daycount=1;
                int load=0;
                for(int i=0;i<arr.length;i++){
                if((load+arr[i])>upper){
                    daycount++;
                    load=arr[i];
                    if(daycount>days) return false;}
                   else load+=arr[i];}
                   return true;}}