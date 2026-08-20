class SmallestInfiniteSet {
    PriorityQueue<Integer> q;
    int counter;
    public SmallestInfiniteSet() {
        q=new PriorityQueue<>();
        counter=1;
    }
    
    public int popSmallest() {
        if(q.size()==0) return counter++;
        return q.poll();
    }
    
    public void addBack(int num) {
        if(!q.contains(num)&&counter>num){
            q.add(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */