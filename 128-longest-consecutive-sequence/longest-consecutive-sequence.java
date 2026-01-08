class Solution {
    public int longestConsecutive(int[] nums) {
      HashSet<Integer> set=new HashSet<>();
      int max=0;
      for(int i:nums){
        set.add(i);
      }  
      for(int j:set){
          int c=1;
        if(set.contains(j-1)) continue;
        while(set.contains(++j))
        {c++;} 
      max=Math.max(c,max);
      }
  return max;  }
}