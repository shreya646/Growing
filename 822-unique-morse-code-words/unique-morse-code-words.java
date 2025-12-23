class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] s={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
   HashSet<String> set=new HashSet<>();
   for(String st:words){
    StringBuilder sb=new StringBuilder();
    for(char ch : st.toCharArray()){
       sb.append(s[ch-'a']);
    } set.add(sb.toString());}

   return set.size(); }
}