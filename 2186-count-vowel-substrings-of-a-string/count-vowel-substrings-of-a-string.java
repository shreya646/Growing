class Solution {
    public int countVowelSubstrings(String word) {
        int count =0;
        int n=word.length();
          for(int i=0;i<n;i++){
            HashSet<Character> set=new HashSet<>();
            for(int j=i;j<n;j++){
                char ch=word.charAt(j);
                if(isvowel(ch)){set.add(ch);
                if(set.size()==5) count++;
            }
            else {break;}
          }}
  return count;  }
  public static boolean isvowel(char k){
   if(k=='a'||k=='e'||k=='i'||k=='o'||k=='u'){
    return true;
   }

 return false; }
}