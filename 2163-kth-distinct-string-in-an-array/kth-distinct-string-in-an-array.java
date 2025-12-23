class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> ans=new HashMap<>();
        int distinct=0;
        for(String ch:arr){
            ans.put(ch,ans.getOrDefault(ch,0)+1);
        }
        for(String ch:arr){
            if(ans.get(ch)==1) distinct++;
            if(distinct==k) return ch;
        }
   return ""; }
}