class Solution {
    public int maxArea(int[] height) {
        int maxarea=0;
        int area=0;
        int n=height.length;
        int i=0;
       int j=n-1;
       while(i<j){
        if(height[i]<height[j])
        { area=height[i]*(j-i);
        maxarea=Math.max(area,maxarea);
        i++;}
        else{area=height[j]*(j-i);
        maxarea=Math.max(area,maxarea);
        j--;}
       }
   return maxarea; }
}