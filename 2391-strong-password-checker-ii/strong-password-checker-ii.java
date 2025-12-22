class Solution {
    public boolean strongPasswordCheckerII(String password) {
       int siz=password.length();
       boolean lc=false; boolean uc=false; boolean dig=false; boolean sc=false; 
       if(siz<8) return false;
    for(int i=0;i<siz;i++){
            char d=password.charAt(i);
            if((i+1) < siz && password.charAt(i+1)==d) return false;
             if(Character.isLowerCase(d)) lc=true;
           else if(Character.isUpperCase(d)) uc=true;
           else if(Character.isDigit(d))      dig=true;
            else  {sc=true;}
}if(uc && lc && dig && sc) return true;
return false;}}