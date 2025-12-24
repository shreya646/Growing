class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
       paragraph=paragraph.toLowerCase();
       Set<String> bannedSet= new HashSet<>(Arrays.asList(banned));
       Map<String,Integer> freq=new HashMap<>();
       StringBuilder word=new StringBuilder();
       for(char c:paragraph.toCharArray()){
        if(Character.isLetter(c)){
            word.append(c);}
            else{
                if(word.length()>0){
                    String w=word.toString();
                    if(!bannedSet.contains(w)){
                        freq.put(w,freq.getOrDefault(w,0)+1);
                    } word.setLength(0);
                }
            }}
           if(word.length()>0){
            String w=word.toString();
            if(!bannedSet.contains(w)){
                freq.put(w,freq.getOrDefault(w,0)+1);
            }
           }
           String result="";
           int max=0; 
           for(Map.Entry<String,Integer>entry:freq.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                result=entry.getKey();
            }
           } return result;
        }}
       

