class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String ans="";
        int maxfreq=0;
        HashSet<String> set=new HashSet<>();
        for(String word:banned){
            set.add(word);
        }
        String[] array=paragraph.toLowerCase().split("\\W+");
        HashMap<String,Integer> map=new HashMap<>();
        for(String w:array){
            if(!set.contains(w)){
        map.put(w,map.getOrDefault(w,0)+1);}}
        for(String k:map.keySet()){
            if(map.get(k)>maxfreq){
                ans=k;
       maxfreq=map.get(k);}
       
      
       }
      
return ans;}}