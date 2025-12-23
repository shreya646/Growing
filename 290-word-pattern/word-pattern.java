class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str=s.split(" ");
        int sp=pattern.length();
        int ss=str.length;
        if(ss!=sp) return false;
        HashMap<Character,String> ptos=new HashMap<>();
        HashMap<String,Character> stop=new HashMap<>();
        for(int i=0;i<ss;i++){
            char ch=pattern.charAt(i);
            String st=str[i];
            if(ptos.containsKey(ch) && !ptos.get(ch).equals(st))            return false;
             if(stop.containsKey(st) &&  !stop.get(st).equals(ch))          return false;
             ptos.put(ch,st);
             stop.put(st,ch);
            
        }

    return true;}
}