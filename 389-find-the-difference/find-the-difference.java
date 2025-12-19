class Solution {
    public char findTheDifference(String s, String t) {
int result=0;
for(char se: s.toCharArray()){
    result^=se;
}
for(char st: t.toCharArray()){
    result^=st;
}
         return (char)result;}
}