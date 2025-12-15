class Solution {
    public int findGCD(int[] nums) {
      Arrays.sort(nums);
      int smallest=nums[0];
      int largest=nums[nums.length-1];
      int ans=gcd(smallest,largest);  
      return ans;
      
    }
    public static int gcd(int a,int b){
    if(a==b) return a;
    if(a>b) return gcd(a-b,b);
     return gcd(a,b-a);
    }
}