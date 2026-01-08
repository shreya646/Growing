class Solution {
    public int longestConsecutive(int[] nums) {
        long max=0;
     HashSet<Integer> set=new HashSet<>();
     for(int i:nums){
        set.add(i);
     } 
     for(int j:set){
        if(set.contains(j-1)){continue;}
        long c=1;
        while(set.contains(++j)){
            c++;
        }
        max=Math.max(c,max);
     }  
   return (int)max; }
}