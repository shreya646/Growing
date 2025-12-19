 class Solution {
    public boolean digitCount(String num) {
    int[] freq=new int[10] ;
    for(int i=0;i<num.length();i++){
        int d = num.charAt(i)-'0' ;
        freq[d]++;}
       for(int j=0;j<num.length();j++){
        int y=num.charAt(j)-'0';
        if(y!=freq[j]) return false;
       }    

    return true;}
}
    
