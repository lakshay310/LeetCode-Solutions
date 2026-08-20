class SmallestInfiniteSet {
    List<Integer> avano;

    public SmallestInfiniteSet() {
        avano=new ArrayList<>();
        for(int i=1;i<=2000;i++){
            avano.add(i);
        }
    }
    
    public int popSmallest() {
        Collections.sort(avano);
        return avano.remove(0);
    }
    
    public void addBack(int num) {
        if(!avano.contains(num)){
            avano.add(num);
        }
        
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */