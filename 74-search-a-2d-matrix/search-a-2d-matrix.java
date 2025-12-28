class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int coloumn=matrix[0].length;
        int first=0;
        int last=(row*coloumn)-1;
        
        while(first<=last){
           int mid=first+(last-first)/2;
            int midcol=mid%coloumn;
            int midrow=mid/coloumn;
            if(matrix[midrow][midcol]==target){
                return true;
            }
            else if(matrix[midrow][midcol]<target){
                first=mid+1;
            }
            else{last=mid-1;}
        }
   return false; }
}