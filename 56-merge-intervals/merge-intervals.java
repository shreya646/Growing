class Solution {
    public int[][] merge(int[][] intervals) {
        //shreya
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int[]> list=new ArrayList<>();
        for(int[] i:intervals){
            if(list.size()==0){
                list.add(i);
            }
            else if(list.get(list.size()-1)[1]>=i[0]){
               list.get(list.size()-1)[1]=Math.max(list.get(list.size()-1)[1],i[1]);
            }
            else list.add(i);
        }
        int[][] ans=new int[list.size()][2];
for(int j=0;j<list.size();j++){
ans[j]=list.get(j);
}
  return ans;  }
}