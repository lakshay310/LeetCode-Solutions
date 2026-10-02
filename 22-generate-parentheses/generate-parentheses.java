class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        gen("",n,n,res);
        return res;
    }
    public void gen(String str, int o , int c, List<String> res){
        if(o==0&&c==0){
            res.add(str);
            return;
        }
        if(o>0){
            gen(str+"(",o-1,c,res);
        }
        if(c>o){
            gen(str+")",o,c-1,res);
        }
    }
}