class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        int ans=-1;
        for(int i:nums){
            if(i%2==0){
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        for(int k:map.keySet()){
            int current=map.get(k);
            if(max<current){
                max=current;
                ans=k;
            }
            else if(max==current){
                if(ans==-1){ans=k;}
                    ans=Math.min(ans,k);
                }}
           return ans; }
        }
    