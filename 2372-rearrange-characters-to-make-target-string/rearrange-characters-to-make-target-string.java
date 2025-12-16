class Solution {
    public int rearrangeCharacters(String s, String target) {
        int minn=Integer.MAX_VALUE;
        int[] letter=new int[26];
         int[] l=new int[26];
        for(char c: s.toCharArray()){
            letter[c -'a']++;
        }
     
        for(char j:target.toCharArray()){
          l[j-'a']++;}
          for(int i=0;i<26;i++){
            if(l[i]!=0){
            int current=(letter[i]/l[i]);
            minn=Math.min(minn,current);
          }}
           
        
    return minn;}
}