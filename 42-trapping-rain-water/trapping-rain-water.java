class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int ans=0;
       int[] left=new int[n];
       int[] right=new int[n]; 
       left[0]=height[0];
       right[n-1]=height[n-1];
       for(int i=1;i<n;i++){
        left[i]=Math.max(left[i-1],height[i]);}
       for(int k=n-2;k>=0;k--){
        right[k]=Math.max(right[k+1],height[k]);
       }
        for(int j=0;j<height.length;j++){
           ans+=Math.min(left[j],right[j])-height[j];
        }
        return ans;  }
}