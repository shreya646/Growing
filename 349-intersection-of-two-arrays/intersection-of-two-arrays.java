class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> arr1=new HashSet<>();
        for(int i:nums1){
            arr1.add(i);
        }
         HashSet<Integer> arr2=new HashSet<>();
        for(int j:nums2){
            arr2.add(j);
        }
       arr1.retainAll(arr2);
       int[] ans=new int[arr1.size()];
       int k=0;
       for(Integer i:arr1){
            ans[k++]=i; 
       }
   return ans; }
}