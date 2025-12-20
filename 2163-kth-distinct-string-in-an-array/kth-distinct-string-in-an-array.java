class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        int distinct=0;
        for(String ch: arr){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(String h:arr){
           if( map.get(h)==1 ){distinct++;}
           if(distinct==k) return h;
        }
   return ""; }
}