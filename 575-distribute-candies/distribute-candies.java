class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        HashSet<Integer> ans=new HashSet<>();
       for(int i:candyType){
        ans.add(i);
       }
   return Math.min(n/2,ans.size()); }
}