class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s=new Stack<>();
        int size=temperatures.length;
        int[] arr=new int[size];
        for(int i=size-1;i>=0;i--){
            while(!s.isEmpty() && temperatures[s.peek()]<=temperatures[i]){
                s.pop();
            }
            if(s.isEmpty()){
             arr[i]=0;
             
            }
            else{
           arr[i]=(s.peek()-i);
            
        }s.push(i);}
   return arr; }
}