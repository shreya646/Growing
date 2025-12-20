class Solution {
    public int largestAltitude(int[] gain) {
        int cgain=0;
        int maxgain=0;
        for(int i=0;i<gain.length;i++){
            cgain+=gain[i];
           maxgain=Math.max(cgain,maxgain);
        }

   return maxgain; }
}