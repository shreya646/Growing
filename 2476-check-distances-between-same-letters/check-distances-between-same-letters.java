class Solution {
    public boolean checkDistances(String s, int[] distance) {
        boolean[] check=new boolean[26];
        for(int i=0;i<s.length();i++){
            int charidx=s.charAt(i)-'a';
            if(!check[charidx]){
                int expectedidx=i+1+distance[charidx];
                if(expectedidx>=s.length() || s.charAt(expectedidx)!=s.charAt(i)) return false;
            } check[charidx]=true;}
        
 return true;   }
}