class Solution {
    public List<String> removeAnagrams(String[] words) {
        ArrayList<String> ans=new ArrayList<>();
        ans.add(words[0]);
        for(int i=1;i<words.length;i++){
        if(!isanagram(words[i],words[i-1])){
            ans.add(words[i]);
        }}
 return ans;   }
 public static boolean isanagram(String a,String b){
    if(a.length()!=b.length()) return false;
    char[] arr=a.toCharArray();
     char[] brr=b.toCharArray();
     Arrays.sort(arr);
     Arrays.sort(brr);
    return Arrays.equals(arr,brr);
 }
}
