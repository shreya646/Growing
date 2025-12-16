class Solution {
    public String greatestLetter(String s) {
        int[] small=new int[26];
        int[] capital=new int[26];
        String str="";
        for(char c: s.toCharArray()){
            if(c>='a' && c <='z'){
                small[c-'a']+=1;
            }
            else{
                capital[c-'A']++;
            }}
            for(int i=25;i>=0;i--){
                if((small[i]>=1) && (capital[i]>=1))  return str+=(char)(i+'A');
            }
    return str;}
}