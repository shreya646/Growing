class Solution {
    public int longestPalindrome(String s) {
       int[]array=new int[123];
       boolean det=false;
       int ans=0;
       for(char ch:s.toCharArray()){
        array[ch]++;
       }
       for(int i=0;i<array.length;i++){
        if(array[i]%2==0){ans+=array[i];}
        else {ans+=array[i]-1;
        det=true;}
       }
       if(det){
        ans+=1;
       }

   return ans; }
}