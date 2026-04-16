class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        gen("",n,n,res);
        return res;
    }
    public void gen(String str, int open , int close, List<String> res){
        if(open==0&&close==0){
            res.add(str);
            return;
        }
        if(open>0){
            gen(str+"(",open-1,close,res);
        }
        if(close>open){
            gen(str+")",open,close-1,res);
        }
    }
}
