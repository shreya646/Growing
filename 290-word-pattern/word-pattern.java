class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr= s.split(" ");
        int n=arr.length;
        int p=pattern.length();
        if(n!=p) return false;
HashMap<Character,String> ptos=new HashMap<>();
         HashMap<String,Character> stop=new HashMap<>();
        for(int i=0;i<n;i++){
            char c=pattern.charAt(i);
            String t=arr[i];
       if(ptos.containsKey(c) && !ptos.get(c).equals(t)) return false;
     if(stop.containsKey(t) && !stop.get(t).equals(c) ) return false;
      ptos.put(c,t);
        stop.put(t,c);}
return true;}}