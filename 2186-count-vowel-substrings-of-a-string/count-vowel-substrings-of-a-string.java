class Solution {
    public int countVowelSubstrings(String word) {
        int n=word.length();
        int count=0;
        for(int i=0;i<n;i++){
            HashSet<Character> vowel=new HashSet<>();
            for(int j=i;j<n;j++){
                char c=word.charAt(j);
                if(isvowel(c)) {vowel.add(c);
                if(vowel.size()==5) count++;
            }
            else{break;}
        }}

    return count;}
    public static boolean isvowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') return true;
   return false; }
}