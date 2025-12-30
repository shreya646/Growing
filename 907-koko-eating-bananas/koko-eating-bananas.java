class Solution {
    public int minEatingSpeed(int[] piles, int h) {
      int first=1;
      int last=0;
      int ans=-1;
for(int i:piles)
{last=Math.max(last,i);}

while(first<=last){
        int mid=first+(last-first)/2;
        if(isvalid(piles,h,mid)){
            ans=mid;
       last=mid-1;
        }
        else{first=mid+1;}
      } return ans; }
     public static boolean isvalid(int[]arr,int h,int k){
        long hour=0;
        for(int i:arr){
            if(i%k==0){hour+=(i/k);}
            else{hour+=(i/k)+1;}
        }
         if(hour>h) return false;
        return true;
     }   
    
}