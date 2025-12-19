class Solution {
    public List<String> removeAnagrams(String[] words) {
        ArrayList<String> list=new ArrayList<>();
        list.add(words[0]);
        for(int i=1;i<words.length;i++){
            if(!Solution.isanagram(words[i-1],words[i])) {
                list.add(words[i]);
            }}
     return list;   }
    
public static boolean isanagram(String a,String b){
    if(a.length()!=b.length()) return false;
   char[] arr= a.toCharArray();
   char[] brr=b.toCharArray();
   Arrays.sort(arr);
   Arrays.sort(brr);
   return Arrays.equals(brr,arr);
}}