class Solution {
    public int percentageLetter(String s, char letter) {
        int d=s.length();
        int n=0;
     for(char c: s.toCharArray()){
        if(c==letter) n++;
     }   
   return ((n*100)/d); }
}