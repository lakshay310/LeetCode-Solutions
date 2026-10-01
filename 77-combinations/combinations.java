class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> a=new ArrayList<>();
        int total=1<<n;
        for(int mask=0;mask<total;mask++){
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<n;i++){
                if((mask&(1<<i))!=0){
                    temp.add(i+1);
                }
            }
            if(temp.size()==k){
                a.add(temp);
            }
        }
        return a;
    }
}