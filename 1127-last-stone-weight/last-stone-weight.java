class Solution {
    public int lastStoneWeight(int[] stones) {
        //Maxheap application
       PriorityQueue<Integer> max=new PriorityQueue<>(Collections.reverseOrder());
       for(int st:stones){
        max.add(st);
       } 
       while(max.size()>=2){
        int y=max.poll();
        int x=max.poll();
        if(x==y) continue;
        if(y!=x){
            max.add(y-x);
        }
       }
       return max.size()==1?max.peek():0;
    }
}