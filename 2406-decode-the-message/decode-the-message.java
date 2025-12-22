class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> map=new HashMap<>();
         StringBuilder str=new StringBuilder();
        char alpha='a';
        for(char c:key.toCharArray()){
          if(c!=' '&& !map.containsKey(c))  {
        map.put(c,map.getOrDefault(c,alpha));
        alpha++;
       
          }}
         
          for(char g:message.toCharArray()){
            if(g==' '){str.append(' ');}
           else {str.append(map.get(g));}
          }
            
        
    return str.toString();}
}