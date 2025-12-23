class Solution {
    public char findTheDifference(String s, String t) {
        char result=0;
        for(char ch:s.toCharArray()){
            result^=ch;
        }
         for(char chh:t.toCharArray()){
            result^=chh;
        }
   return result; }
}