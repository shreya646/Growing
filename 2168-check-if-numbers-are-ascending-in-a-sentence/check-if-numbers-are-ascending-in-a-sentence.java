class Solution {
    public boolean areNumbersAscending(String s) {
        int prev=0;
      for(String t: s.split(" ")){
        if(t.charAt(0)>='0' && t.charAt(0)<='9'){
          int current=Integer.parseInt(t);
          if(current<=prev) return false;
         prev=current;}
      }
      return true; } 
    }
