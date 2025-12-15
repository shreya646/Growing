class Solution {
    public int[] numberOfPairs(int[] nums) {
     HashMap<Integer,Integer> map=new HashMap<>();
     int not=0;
     int pair=0;
     for(int i:nums){
        map.put(i,map.getOrDefault(i,0)+1);
     }   
     for(int k:map.keySet()){
        if(map.get(k)%2==0) pair+=(map.get(k)/2);
        else if(map.get(k)%2>=1) {pair+=( map.get(k)/2);
        not+=( map.get(k)%2);}}
        int[] arr={pair,not};
        return arr;
    }
}