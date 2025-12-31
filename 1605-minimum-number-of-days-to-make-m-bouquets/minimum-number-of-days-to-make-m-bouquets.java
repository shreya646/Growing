class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(m*k>bloomDay.length) return -1;
        int first=1;
        int last=0;
        for(int i:bloomDay){
            last=Math.max(last,i);
        }
        int ans=-1;
        while(first<=last){
            int mid=first+(last-first)/2;
            if(isvalid(bloomDay,mid,m,k)){
             ans=mid;
             last=mid-1;
            }
            else{
                first=mid+1;
            }}
        return ans;}
        public static boolean isvalid(int[]arr,int mid,int m,int k){
            long numflower=0;
            int noofbouquet=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]<=mid){
              numflower++;
              if(numflower==k){
                noofbouquet++;
              numflower=0;
                }
            } else numflower=0;
        } if(noofbouquet>=m) return true;
        return false;
    }
}