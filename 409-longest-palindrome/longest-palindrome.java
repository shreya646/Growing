class Solution {
    public int longestPalindrome(String s) {
        int ans=0;
        boolean det=false;
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i:map.values()){
            if(i%2==0){ans+=i;}
            else{ans+=i-1;
            det=true;}
        }
        return det?ans+=1:ans;
    }
}