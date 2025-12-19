class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] arr={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet <String> ans=new HashSet<>();
for(String w:words){
    StringBuilder sb=new StringBuilder();
    for(char c:w.toCharArray()){
            sb.append(arr[c-'a']);}
     ans.add(sb.toString());}
    return ans.size(); }
}